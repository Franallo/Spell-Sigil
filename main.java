import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    SpellSigilDrawer sig = new SpellSigilDrawer(600, 800);
    frame.setSize(600,800);
    frame.setTitle("Spell Sigil");
    frame.add(sig);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
