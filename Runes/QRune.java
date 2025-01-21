package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class QRune extends Rune {
  public QRune() {}
  
  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Ellipse2D.Double e = new Ellipse2D.Double(startX + (unitLength / 2), startY + (unitLength / 2), unitLength, unitLength);
    g2d.draw(e);
  }
}
