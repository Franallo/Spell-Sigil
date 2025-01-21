package Runes;

import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.*;

public class EndRune extends Rune {
  public EndRune(){}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Rectangle2D.Double r = new Rectangle2D.Double(startX, startY - unitLength, (2 * unitLength), (2 * unitLength));
    g2d.fill(r);

    Color color = g2d.getColor();
    g2d.setColor(g2d.getBackground());

    Rectangle2D.Double r2 = new Rectangle2D.Double(startX + (2 * unitLength), startY - unitLength, unitLength, 2 * unitLength);
    g2d.fill(r2);

    g2d.setColor(color);
  }
}
