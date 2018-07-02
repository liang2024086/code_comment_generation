package methodEmbedding.Revenge_of_the_Pancakes.S.LYD827;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = Integer.parseInt(s.nextLine().trim());
		
		for (int i = 0; i < n; i++){
			String in = s.nextLine().trim();
		
			int swaps = 0;
			char curr = in.charAt(0);
			
			for (int j = 0; j < in.length(); j++){
				if (in.charAt(j) != curr){
					swaps++;
					curr = in.charAt(j);
				}
			}
			
			if (curr == '+') swaps--;
			
			System.out.println("Case #" + (i+1) + ": " + (swaps+1));
		}
		
		s.close();
	}
}
