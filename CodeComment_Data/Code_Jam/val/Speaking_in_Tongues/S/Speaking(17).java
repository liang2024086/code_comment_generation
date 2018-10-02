package methodEmbedding.Speaking_in_Tongues.S.LYD496;

import java.util.Scanner;
import java.io.*;

public class Speaking {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner input = new Scanner(new File(args[0]));
    int lines = 0;
    
    if (input.hasNextInt()) {
      lines = input.nextInt();
      input.nextLine();
    }
    
    String nLine;
    
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
    
    //char [] goog = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    //char [] eng = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
    char [] eng = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};

    for (int i = 0; i < lines; i++) {
      nLine = input.nextLine();
      out.print("Case #" + (i + 1) + ": ");
      int curChar;
      for (int j = 0; j < nLine.length(); j++) {
        curChar = (int) nLine.charAt(j);
        if (curChar == 32) out.print(" ");
        else out.print(eng[curChar - 97]);
      }
      out.println();
    }
    
    out.close();
  
  }

}
