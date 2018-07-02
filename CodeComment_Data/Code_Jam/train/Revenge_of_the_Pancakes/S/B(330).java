package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1186;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class B {
    
    public static void main(String[] args) throws FileNotFoundException {
	try (Scanner sc =
	     new Scanner(new BufferedReader(new FileReader(new File(args[0]))))
	     ) {
		int iterations = sc.nextInt();
		for (int i = 0; i < iterations; i++) {
		    String stack = sc.next();
		    stack = new StringBuilder(stack).reverse().toString();
		    int n = 0;
		    char state = '+';
		    while (stack.length() > 0) {
			if (stack.charAt(0) != state) {
			    n++;
			    state = state == '+' ? '-' : '+';
			}
			stack = stack.substring(1);
		    }
		    System.out.printf("Case #%d: %d\n", i + 1, n);
		}
	    }
    }

}
