import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {

      String[][] symbols = null;
 
      try{
        SpellReader reader = new SpellReader(args[0]);
        symbols = reader.read();
        reader.close();
      } catch ( Exception e ) { /* no-op */} 
      
      int size = 1024;
      SpellSigilDrawer sig = new SpellSigilDrawer(size, size, symbols);

      JFrame frame = new JFrame();
      frame.setSize(size,size);
      frame.setTitle("Spell Sigil");
      frame.add(sig);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }
}
