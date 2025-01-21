import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

import Runes.*;

public class SpellSigilDrawer extends JComponent {

  private int width;
  private int height;
  private Color background = Color.BLACK;
  private Color lineColor = Color.CYAN;

  public SpellSigilDrawer(int w, int h) {
    width = w;
    height= h;
  }

  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D) g;

    RenderingHints rh = new RenderingHints(
      RenderingHints.KEY_ANTIALIASING, 
      RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHints(rh);


    String[] runes = Rune.getKeys();
    String[] letters = new String[26];
    String[] other = new String[19];

    for(int i = 0, j = 0, k = 0; i < runes.length; i++){
      if(runes[i].length() == 1 && Character.isLetter(runes[i].charAt(0))){
        letters[j] = runes[i];
        j++;
      }
      else{
        other[k] = runes[i];
        k++;
      }
    }


    double unitLength = ((512 * 3.1415) / (2 * runes.length + 1 + (2 * 3.1415)));
    double margin = 2 * unitLength;
    double radius = 512 - (2 * unitLength);

    Rectangle2D.Double r = new Rectangle2D.Double(0,0,width, height);

    g2d.setBackground(background);
    g2d.setColor(background);
    g2d.fill(r);
    g2d.setColor(lineColor);
    g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));


    AffineTransform at = g2d.getTransform();

    drawCircle(g2d, margin, margin, radius, unitLength, letters);

    drawCircle(g2d, (margin + (6 * unitLength)), (margin + (6 * unitLength)), (radius - (6 * unitLength)), unitLength, other);

  }

  public void drawCircle(Graphics2D g2d, double startX, double startY, double radius, double unitLength, String[] runes){
    Ellipse2D.Double e = new Ellipse2D.Double(startX, startY, (2 * radius), (2 * radius));
    g2d.draw(e);
    double centerX = startX + radius;
    double centerY = startY + radius;
    double runeStartX = centerX - unitLength;
    double runeStartY = centerY + radius;
    double turn = 360 / runes.length;

    for(int i = 0; i < runes.length; i++) {
      (Rune.getRune(runes[i])).draw(g2d, runeStartX, runeStartY - 1, unitLength);
      g2d.rotate(Math.toRadians(-turn), centerX, centerY);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    int size = 1024;
    SpellSigilDrawer sig = new SpellSigilDrawer(size, size);
    frame.setSize(size,size);
    frame.setTitle("Spell Sigil");
    frame.add(sig);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
};