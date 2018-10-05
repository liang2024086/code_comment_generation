package methodEmbedding.Speaking_in_Tongues.S.LYD580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SpeakingInTongues {

	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		int T = new Integer(in.readLine()).intValue();
		String text = "";
		for (int i=0; i<T; i++){
			text = in.readLine();
			System.out.print("Case #"+(i+1)+": ");
			for (int j=0; j<text.length(); j++){
				if (text.charAt(j) == ' ')
					System.out.print(" ");
				else{
					System.out.print(map[text.charAt(j)-'a']);
				}
			}
			System.out.println();
		}

	}

}
