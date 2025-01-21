package Runes;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;

public class InvokeRune extends Rune {
  public InvokeRune(){}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    AffineTransform at = g2d.getTransform();
    g2d.rotate(Math.toRadians(-45), startX + unitLength, startY);
    
    Rectangle2D.Double r = new Rectangle2D.Double(startX, startY - unitLength, (2 * unitLength), (2 * unitLength));
    g2d.fill(r);

    g2d.setTransform(at);
  }
}