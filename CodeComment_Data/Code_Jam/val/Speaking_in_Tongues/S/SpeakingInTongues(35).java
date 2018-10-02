package methodEmbedding.Speaking_in_Tongues.S.LYD331;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class SpeakingInTongues {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("input.in"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		int n = Integer.parseInt(br.readLine());
		
		String google = "abcdefghijklmnopqrstuvwxyz";
		String alpha = "yhesocvxduiglbkrztnwjpfmaq";
		StringBuilder str;
		
		for(int count = 1; count <= n; count++){
			String in = br.readLine();
			str  = new StringBuilder();
			for(int i = 0; i < in.length(); i++){
				if(in.charAt(i) == ' '){
					str.append(' ');
					continue;
				}
				str.append(alpha.charAt(google.indexOf(in.charAt(i))));				
			}
			System.out.println("Case #" + count + ": " + str.toString());
		}
//		String junk = br.readLine();
//		String eng = br.readLine();
//		char[] translate = new char[26];
//		for(int i = 0; i < junk.length(); i++){
//			char in = junk.charAt(i);
//			if(in == ' ') continue;
//			if(!Character.isLetter(translate[alpha.indexOf(in)]))
//				translate[alpha.indexOf(in)] = eng.charAt(i);
//			else if(translate[alpha.indexOf(in)] != eng.charAt(i))
//				System.out.println("Conflict: " + translate[alpha.indexOf(in)] + " want to replace with: " + eng.charAt(i));
//			
//		}
//		for(int i = 0; i < 26; i++){
//			System.out.println(alpha.charAt(i) + " " + translate[i]);
//		}
	}
}
