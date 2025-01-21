package Runes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class ZeroRune extends Rune {
  public ZeroRune() {}

  public void draw(Graphics2D g2d, double startX, double startY, double unitLength){
    Rectangle2D.Double r = new Rectangle2D.Double(startX + (unitLength / 2), startY - (unitLength / 2), unitLength, unitLength);
    AffineTransform at = g2d.getTransform();
    g2d.rotate(Math.toRadians(-45), startX + unitLength, startY);
    Color color = g2d.getColor();
    g2d.setColor(g2d.getBackground());
    g2d.fill(r);
    g2d.setColor(color);
    g2d.draw(r);
    g2d.setTransform(at);
  }
}
