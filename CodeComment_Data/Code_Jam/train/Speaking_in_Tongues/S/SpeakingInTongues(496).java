package methodEmbedding.Speaking_in_Tongues.S.LYD1584;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("src/SpeakingInTongues.in"));
		//Scanner out = new Scanner(new File("src/SpeakingInTongues.out"));
		PrintWriter o = new PrintWriter(new File("src/a.out"));
		//yhesocvxduiglbkr*tnwjpfma* = qz
		String cypher = "yhesocvxduiglbkrztnwjpfmaq";
		
		int T = Integer.parseInt(in.nextLine());
		System.out.println(T);
		//char know[] = new char[27];
		for(int TT = 0; TT < T; ++TT) {
			String encoded = in.nextLine();
			//String decoded = out.nextLine();
			System.out.println(encoded);
			o.print(String.format("Case #%d: ", TT + 1));
			for(int i = 0; i < encoded.length(); ++i) {
				if(encoded.charAt(i) == ' ') {
					o.print(" ");
					continue;
				}
				int c = encoded.charAt(i) - 'a';
				//know[c] = decoded.charAt(i);
				o.print(cypher.charAt(c));
			}
			o.println();
		}
		//for(int i = 0; i < 26; ++i) {
		//	if(know[i] > 0) System.out.print(know[i]);
		//	else System.out.print("*");
		//}
		//System.out.println();
		
		in.close();
		//out.close();
		o.close();
	}

}
