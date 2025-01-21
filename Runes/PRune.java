package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class PRune extends Rune{
  public PRune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    erase(g2d, startX, startY, unitLength);
    double factor = 0.5;
    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.curveTo(startX, startY + (factor * unitLength), startX + (factor * unitLength), startY + unitLength, startX + unitLength, startY + unitLength);
    p.lineTo(startX + unitLength, startY - unitLength);
    p.curveTo(startX + unitLength + (factor * unitLength), startY - unitLength, startX + (2 * unitLength), startY - (factor * unitLength), startX + (2 * unitLength), startY);
    g2d.draw(p);
  }
}
