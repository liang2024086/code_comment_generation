package methodEmbedding.Speaking_in_Tongues.S.LYD1289;

import java.util.*;
public class Tongues {

//Uses std in and out. I pasted the results in a text file
	public static void main(String[] args) {
		final char[] cipher = new char[]{'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String str = in.nextLine();
		String output = "";

		for (int i = 0; i < N; i++) {
			str = in.nextLine();
			output += "Case #" + (i+1) + ": ";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ' ')
					output += ' ';
				else
					output += cipher[str.charAt(j) - 'a'];
			}
			output += "\n";
		}
		
		System.out.print(output);
	}
}
