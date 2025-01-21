package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class URune extends Rune{
  public URune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    erase(g2d, startX, startY, unitLength);

    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.curveTo(startX, startY + (1.4 * unitLength), startX + (2 * unitLength), startY + (1.4 * unitLength), startX + (2 * unitLength), startY);
    g2d.draw(p);
  }
}
