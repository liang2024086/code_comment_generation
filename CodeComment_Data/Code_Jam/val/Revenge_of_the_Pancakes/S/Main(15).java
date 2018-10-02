package methodEmbedding.Revenge_of_the_Pancakes.S.LYD833;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		 Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int n = Integer.parseInt(in.nextLine());

		 for (int i = 1; i <= n; i++) {
		 	
			char[] stack = in.nextLine().toCharArray();
		 	char last = stack[0];
		 	
		 	int flips = 0;

		 	for (int j = 0; j < stack.length; j++) {
		 		if (last == stack[j]) continue;
		 		else {
		 			flips++;
		 			last = stack[j];
		 		}
		 	}
		 	if (stack[stack.length - 1] == '-') {
		 		flips++;
		 	}

		 	System.out.println("Case #" + i + ": " + flips);
		 }
	}
}
