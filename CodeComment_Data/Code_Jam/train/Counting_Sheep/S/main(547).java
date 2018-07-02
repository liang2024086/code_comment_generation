package methodEmbedding.Counting_Sheep.S.LYD1036;

import java.util.*;
import java.io.*;

public class main {
  public static void main(String[] args) throws FileNotFoundException {
	
    Scanner in = new Scanner(new BufferedReader(new FileReader("prova.txt")));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      
      shape s = new shape(n);
      
      long ris = s.lastNumber();
      if (ris == -1) 
    	  System.out.println("Case #" + i + ": " + "INSOMNIA");
      else
    	  System.out.println("Case #" + i + ": " + (ris));

    }
    in.close();
  }
}
