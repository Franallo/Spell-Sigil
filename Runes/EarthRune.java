package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class EarthRune extends Rune{
  public EarthRune() {}
  
  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Path2D.Double p = new Path2D.Double();
    double adjust = unitLength / 4;
    p.moveTo(startX, startY - (Math.sqrt(3) * unitLength / 2) + adjust);
    p.lineTo(startX + unitLength, startY + (Math.sqrt(3) * unitLength / 2) + adjust);
    p.lineTo(startX + (2 * unitLength), startY - (Math.sqrt(3) * unitLength / 2) + adjust);
    p.closePath();
    g2d.draw(p);
  }
}
