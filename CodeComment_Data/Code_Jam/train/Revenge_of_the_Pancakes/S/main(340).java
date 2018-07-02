package methodEmbedding.Revenge_of_the_Pancakes.S.LYD694;


import java.util.*;
import java.io.*;

public class main {
  public static void main(String[] args) throws FileNotFoundException {
	
    Scanner in = new Scanner(new BufferedReader(new FileReader("prova.txt")));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    String s1 = in.nextLine();
    for (int i = 1; i <= t; ++i) {
    	  String s = in.nextLine();
      	  flip f = new flip(s);
      	  int n = f.nflip();
    	  System.out.println("Case #" + i + ": " + (n));

    }
    in.close();
  }
}
