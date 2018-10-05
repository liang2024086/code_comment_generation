package methodEmbedding.Speaking_in_Tongues.S.LYD310;

import java.io.*;
import java.util.Scanner;

public class SpeakingInTongues {

	private static char googleress[] = { 'y', 'h', 'e', 's', 'o', 'c', 'v',
			'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w',
			'j', 'p', 'f', 'm', 'a', 'q' };

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("input"));
		int n = s.nextInt();
		s.nextLine();
		for (int i = 1; i <= n; i++) {
			String in=s.nextLine();
			StringBuilder sb=new StringBuilder(in);
			for(int j=0;j<in.length();j++){
				if(sb.charAt(j)==' ') continue;
				int index=sb.charAt(j)-'a';
				sb.setCharAt(j, googleress[index]);
			}				
			System.out.println("Case #" + i + ": "+sb.toString());
		}
	}

}
