package methodEmbedding.Revenge_of_the_Pancakes.S.LYD828;

import java.util.*;
import java.io.*;
import java.math.*;

public class CodeJam_B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tests = Integer.parseInt(in.next());

		for(int t = 1; t < tests + 1; t++) {

			char[] letters = (in.next().toString()).toCharArray();

			char s1 = letters[0];
			int count = 0;
			for(int i = 0; i < letters.length; i++) {
				if(s1 != letters[i]) {
					s1 = letters[i];
					count++;
				}
			}
			if(letters.length == 1 && letters[0] == '-') {
				count++;
			} 

			if(letters.length > 1 && letters[letters.length - 1] == '-') {
				count++;
			}

			System.out.println("Case #" + t + ": " + count);

		}



	}


}
