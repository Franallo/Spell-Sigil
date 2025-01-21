package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class WRune extends Rune{
  public WRune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    erase(g2d, startX, startY, unitLength);
    double factor = 0.6;
    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.lineTo(startX, startY + unitLength);
    p.curveTo(startX + (factor * unitLength), startY + unitLength, startX + unitLength, startY + (factor * unitLength), startX + unitLength, startY);
    p.curveTo(startX + unitLength, startY - (factor * unitLength), startX + unitLength + (factor * unitLength), startY - unitLength, startX + (2 * unitLength), startY - unitLength);
    p.lineTo(startX + (2 * unitLength), startY);
    g2d.draw(p);
  }
}
