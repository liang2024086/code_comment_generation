package methodEmbedding.Revenge_of_the_Pancakes.S.LYD945;


import java.util.*;

public class B2016 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int T = in.nextInt();
		for(int x=1; x<=T; x++) {
			char[] pArray = in.next().toCharArray();
			char current = pArray[pArray.length-1];
			int turns = 0;
			if (current == '-') {
				turns += 1;
			}
			
			for(int i=pArray.length-2; i>=0; i--) {
				if (pArray[i] != current) {
					turns += 1;
				}
				current = pArray[i];
			}
			
			System.out.println("Case #" + x + ": " + turns);
		}
	}

}
