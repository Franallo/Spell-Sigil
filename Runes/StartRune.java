package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class StartRune extends Rune {
  public StartRune(){}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Path2D.Double p = new Path2D.Double();
    p.moveTo(startX, startY);
    p.lineTo(startX, startY - unitLength);
    p.lineTo(startX + (Math.sqrt(3) * unitLength), startY);
    p.lineTo(startX, startY + unitLength);
    p.closePath();
    g2d.fill(p);
  }
}
