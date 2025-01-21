package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class ORune extends Rune {
  public ORune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Ellipse2D.Double e = new Ellipse2D.Double(startX + (unitLength / 2), startY - (1.5 * unitLength), unitLength, unitLength);
    g2d.draw(e);
  }
}
