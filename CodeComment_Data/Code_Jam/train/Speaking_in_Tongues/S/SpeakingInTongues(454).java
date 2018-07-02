package methodEmbedding.Speaking_in_Tongues.S.LYD1249;

import java.util.Scanner;

public class SpeakingInTongues {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String sentence = sc.nextLine();
		char[] translator = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		
		for (int x = 0; x < T; x++) {
			sentence = sc.nextLine();
			System.out.print("Case #" + (x+1) + ": ");
			for (int y = 0; y < sentence.length(); y++) {
				if (sentence.charAt(y) == ' ') System.out.print(" ");
				else if ((int)sentence.charAt(y) > 90) System.out.print(translator[(int)sentence.charAt(y)-97]);
				else System.out.print(translator[(int)sentence.charAt(y)-65]);
			}
			System.out.println();
		}
		
	}
	
}
