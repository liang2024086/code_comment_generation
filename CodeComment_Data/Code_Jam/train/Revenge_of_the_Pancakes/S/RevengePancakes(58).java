package methodEmbedding.Revenge_of_the_Pancakes.S.LYD760;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class RevengePancakes {

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		in.nextLine();

		for (int testCase = 1; testCase <= t; testCase++) {
			
			String s = in.nextLine();
			
			char flip = s.charAt(0);
			int count = 0;
			
			for (char c : s.toCharArray()){
				
				if (flip != c) {
					count++;
					flip = c;
				}
				
			}
			
			if (flip == '-') { count++; }
			
			System.out.println("Case #" + testCase +": " + count);
			
		}
	}

}
