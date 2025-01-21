package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class RRune extends Rune {
  public RRune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    erase(g2d, startX, startY, unitLength);
    double factor = 0.5;
    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.lineTo(startX, startY - unitLength);
    p.curveTo(startX, startY - unitLength + (factor * unitLength), startX + unitLength - (factor * unitLength), startY, startX + unitLength, startY);
    p.curveTo(startX + unitLength + (factor * unitLength), startY, startX + (2 * unitLength), startY + unitLength - (factor * unitLength), startX + (2 * unitLength), startY + unitLength);
    p.lineTo(startX + (2 * unitLength), startY);
    g2d.draw(p);
  }
}
