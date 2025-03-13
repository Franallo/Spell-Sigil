package Runes;

import java.awt.*;
import java.util.HashMap;
import java.awt.geom.Rectangle2D;
import java.util.*;

public abstract class Rune {
  private static HashMap<String,Rune> runeMap;

  static {
    runeMap = new HashMap<>();
    runeMap.put("COMPONENTS", new ComponentsRune());
    runeMap.put("SOMATIC", new SomaticRune());
    runeMap.put("VERBAL", new VerbalRune());
    runeMap.put("MATERIAL", new MaterialRune());
    runeMap.put("BODY", new BodyRune());
    runeMap.put("CREATURE", new CreatureRune());
    runeMap.put("SOUL", new SoulRune());
    runeMap.put("TARGETCREATURE", new TargetCreatureRune());
    runeMap.put("AIR", new AirRune());
    runeMap.put("WATER", new WaterRune());
    runeMap.put("EARTH", new EarthRune());
    runeMap.put("FIRE", new FireRune());
    runeMap.put("START", new StartRune());
    runeMap.put("INVOKE", new InvokeRune());
    runeMap.put("SPELL", new SpellRune());
    runeMap.put("GOD", new GodRune());
    runeMap.put("TARGETSPELL", new TargetSpellRune());
    runeMap.put("END", new EndRune());
    runeMap.put("WORLD", new WorldRune());
    runeMap.put("SPACE", new SpaceRune());
    runeMap.put("PLANE", new PlaneRune());
    runeMap.put("TARGETAREA", new TargetAreaRune());
    runeMap.put("A", new ARune());
    runeMap.put("B", new BRune());
    runeMap.put("C", new CRune());
    runeMap.put("D", new DRune());
    runeMap.put("E", new ERune());
    runeMap.put("F", new FRune());
    runeMap.put("G", new GRune());
    runeMap.put("H", new HRune());
    runeMap.put("I", new IRune());
    runeMap.put("J", new JRune());
    runeMap.put("K", new KRune());
    runeMap.put("L", new LRune());
    runeMap.put("M", new MRune());
    runeMap.put("N", new NRune());
    runeMap.put("O", new ORune());
    runeMap.put("P", new PRune());
    runeMap.put("Q", new QRune());
    runeMap.put("R", new RRune());
    runeMap.put("S", new SRune());
    runeMap.put("T", new TRune());
    runeMap.put("U", new URune());
    runeMap.put("V", new VRune());
    runeMap.put("W", new WRune());
    runeMap.put("X", new XRune());
    runeMap.put("Y", new YRune());
    runeMap.put("Z", new ZRune());
    runeMap.put("0", new ZeroRune());
    runeMap.put("1", new OneRune());
    runeMap.put("2", new TwoRune());
    runeMap.put("3", new ThreeRune());
    runeMap.put("4", new FourRune());
    runeMap.put("5", new FiveRune());
    runeMap.put("6", new SixRune());
    runeMap.put("7", new SevenRune());
    runeMap.put("8", new EightRune());
    runeMap.put("9", new NineRune());
    runeMap.put("#", new TenRune());
    runeMap.put("!", new ElevenRune());
    runeMap.put("(", new ParenthesisRune());
    runeMap.put(")", new ParenthesisRune());
    runeMap.put(";", new SemiColonRune());
    runeMap.put(" ", new _Rune());
    runeMap.put("BLANK", new BlankRune());
    //fill out with rest of runes
  }

  public abstract void draw(Graphics2D g2d, double startX, double startY, double unitLength);

  public static boolean check(String string){
    return runeMap.containsKey(string);
  }
  public static Rune getRune(String string){
    return runeMap.get(string);
  }
  public static String[] getKeys(){
    Set<String> s = runeMap.keySet();
    String[] runes = new String[runeMap.size()];
    return s.toArray(runes);

  }
  public static void erase(Graphics2D g2d, double startX, double startY, double unitLength){
    Rectangle2D.Double r = new Rectangle2D.Double(startX, startY - unitLength, 2 * unitLength, 2 * unitLength);
    Color color = g2d.getColor();
    g2d.setColor(g2d.getBackground());
    g2d.fill(r);
    g2d.setColor(color);
  } 
}