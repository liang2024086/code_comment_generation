package methodEmbedding.Revenge_of_the_Pancakes.S.LYD412;

import java.util.*;
import java.io.*;

public class pancakes {

    public static void main (String[] args) {

	Scanner in = new Scanner(System.in);

	int count = in.nextInt();
	in.nextLine();
	for (int l = 0; l < count; l++) {

	    String s = in.nextLine();

	    int current = 0;
	    char past = s.charAt(0);

	    int flips = 0;
	    
      	    while (current < s.length()) {
		past = s.charAt(current);
		while (current < s.length() && s.charAt(current) == past)
		    current++;
		flips += 1;
	    }

	    if (past == '+')
		flips -= 1;

	    System.out.println("Case #" + (l+1) + ": " + flips);

	}

    }

}
