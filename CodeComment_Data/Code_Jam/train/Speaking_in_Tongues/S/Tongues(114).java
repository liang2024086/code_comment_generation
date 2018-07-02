package methodEmbedding.Speaking_in_Tongues.S.LYD728;

import java.util.*;

public class Tongues {
	static char[] MAP = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt(); reader.nextLine();
		String[] in = new String[n];
		for(int i = 0; i < n; i++)
			in[i] = reader.nextLine();
		for(int k = 1; k <= n; k++){
			int i = k-1;
			System.out.print("Case #"+k+": ");
			for(int j = 0; j < in[i].length(); j++){
				if(in[i].charAt(j)==' ')
					System.out.print(" ");
				else
					System.out.print(MAP[in[i].charAt(j)-'a']);
			}
			System.out.println();
		}
	}
}
