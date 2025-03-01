import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SpellReader {
  private BufferedReader source;
  private static HashSet<String> keyWords;

  static {
    keyWords = new HashSet<String>();
    keyWords.add("COMPONENTS");
    keyWords.add("SOMATIC");
    keyWords.add("VERBAL");
    keyWords.add("MATERIAL");
    keyWords.add("BODY");
    keyWords.add("CREATURE");
    keyWords.add("SOUL");
    keyWords.add("TARGETCREATURE");
    keyWords.add("AIR");
    keyWords.add("WATER");
    keyWords.add("EARTH");
    keyWords.add("FIRE");
    keyWords.add("START");
    keyWords.add("INVOKE");
    keyWords.add("SPELL");
    keyWords.add("GOD");
    keyWords.add("TARGETSPELL");
    keyWords.add("END");
    keyWords.add("WORLD");
    keyWords.add("SPACE");
    keyWords.add("PLANE");
    keyWords.add("TARGETAREA");
    keyWords.add(" ");
    keyWords.add("(");
    keyWords.add(")");
    keyWords.add(";");
    keyWords.add(",");
  }


  public SpellReader(String sourceFile) throws IOException{
    source = new BufferedReader(new FileReader(System.getProperty( "user.dir" ) + System.getProperty( "file.separator" ) + sourceFile));
  }

  public String[][] read() throws IOException{
    String nextLine = source.readLine();

    String[][] symbols = new String[5][];
    StringTokenizer tokenizer;
    String delim = " ,;()";
    String token = "";
    int i = 0, j = 0;

    while (nextLine != null) {
      tokenizer = new StringTokenizer(nextLine, delim, true);
      symbols[i] = new String[40];

      System.out.println("nextLine: " + nextLine);

      do {
        token = tokenizer.nextToken();
        System.out.println("token: " + token);

        if(keyWords.contains((token.toUpperCase()))) {//checking for key words
          symbols[i][j] = (token.toUpperCase());
          j++;

          if(j == symbols[i].length){//checking array space 
            symbols[i] = Arrays.copyOf(symbols[i], symbols[i].length * 3);
          }
        }
        else {
          for(int k = 0; k < token.length(); k++){
            if(Character.isLetterOrDigit(token.charAt(k)) || token.charAt(k) == '#' || token.charAt(k) == '!'){
              symbols[i][j] = "" + (Character.toUpperCase(token.charAt(k)));
              j++;

              if(j == symbols[i].length){//checking array space
                symbols[i] = Arrays.copyOf(symbols[i], symbols[i].length * 3);
              }
            }
          }
        }

      } while(tokenizer.hasMoreTokens());
      nextLine = source.readLine();
      i++;
      j = 0;
    }
    return symbols;
  }

  public void close(){
    try {
      source.close();
    } catch( Exception e ) { /* no-op */ }
  }

  public static void main(String[] args){
    try{
      SpellReader reader = new SpellReader(args[0]);
      String[][] symbols = reader.read();
      for(int i = 0; i < symbols.length; i ++){
        for(int j = 0; j < symbols[i].length; j++){
          if(symbols[i][j] != null){
            System.out.println(symbols[i][j]);
          }
        }
      }
      reader.close();
    } catch ( Exception e ) { /* no-op */}
  }

}
