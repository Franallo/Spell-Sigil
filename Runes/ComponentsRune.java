package Runes;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class ComponentsRune extends Rune {
  public ComponentsRune(){}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Ellipse2D.Double e = new Ellipse2D.Double(startX, startY - unitLength, (2 * unitLength), (2 * unitLength));
    g2d.fill(e);
  }
}
