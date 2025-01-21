package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class SevenRune extends Rune {
  public SevenRune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    erase(g2d, startX, startY, unitLength);
    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.lineTo(startX, startY + unitLength);
    p.lineTo(startX + unitLength, startY);
    p.lineTo(startX + (2 * unitLength), startY + unitLength);
    p.lineTo(startX + (2 * unitLength), startY);
    p.moveTo(startX, startY);
    p.lineTo(startX + (2 * unitLength), startY - unitLength);
    p.lineTo(startX + (2 * unitLength), startY);
    g2d.draw(p);
  }
}
