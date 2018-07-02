package methodEmbedding.Speaking_in_Tongues.S.LYD734;

import java.util.*;

public class A {

  private static final char[] map = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
  //                            real"abcdefghijklmnopqrstuvwxyz"
  //                            map "
  
  
  public static void main(String[] args) {
    new A();
  }
  
  public A() {
    Scanner scan = new Scanner(System.in);
    int NCASES = scan.nextInt();
    scan.nextLine();
    for (int ZZ = 1; ZZ <= NCASES; ZZ++) {
      System.out.print("Case #"+ZZ+": ");
      char[] line = scan.nextLine().toCharArray();
      for (int i = 0; i < line.length; i++) {
        if (Character.isWhitespace(line[i])) continue;
        line[i] = map[line[i]-'a'];
      }
      System.out.println(line);
    }
    
  }
  
}
