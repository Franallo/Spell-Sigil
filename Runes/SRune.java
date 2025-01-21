package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class SRune extends Rune {
  public SRune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    erase(g2d, startX, startY, unitLength);
    double factor = 1.4;
    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.curveTo(startX, startY + (factor * unitLength), startX + unitLength, startY + (factor * unitLength), startX + unitLength, startY);
    p.curveTo(startX + unitLength, startY - (factor * unitLength), startX + (2 * unitLength), startY - (factor * unitLength), startX + (2 * unitLength), startY);
    g2d.draw(p);
  }
}
