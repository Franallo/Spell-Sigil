import java.io.*;

public class SpellReader {
  private BufferedReader source;


  public SpellReader(String sourceFile) throws IOException{
    source = new BufferedReader(new FileReader(System.getProperty( "user.dir" ) + System.getProperty( "file.separator" ) + sourceFile));
  }

  public void close(){
    try {
      source.close();
    }
  }

}
