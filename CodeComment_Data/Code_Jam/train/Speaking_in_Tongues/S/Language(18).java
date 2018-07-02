package methodEmbedding.Speaking_in_Tongues.S.LYD742;

import java.util.*;
public class Language {
  public static void main (String[] args) {
    String[] language = {"y", "h", "e", "s", "o", "c", "v", "x", "d", "u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j", "p", "f", "m", "a", "q"};
    Scanner sc = new Scanner(System.in);
	int t = sc.nextInt(); sc.nextLine();
	for(int i = 1; i <= t; i++) {
	  String str = sc.nextLine();
	  System.out.print("Case #" + i + ": ");
	  for(int j = 0; j < str.length(); j++) {
        if(str.charAt(j) == ' ') System.out.print(" ");
	    else System.out.print(language[(int)(str.charAt(j) - 'a')]);
	  }
	  System.out.println();
	}
  }
}
