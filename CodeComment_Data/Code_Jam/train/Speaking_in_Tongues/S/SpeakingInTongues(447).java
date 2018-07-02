package methodEmbedding.Speaking_in_Tongues.S.LYD1456;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a = "abcdefghijklmnopqrstuvwxyz ";
		String b = "yhesocvxduiglbkrztnwjpfmaq ";
		Scanner in = new Scanner(new File("D:/in.txt"));
		PrintStream out = new PrintStream(new File("D:/out.txt"));
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i <= n; i++) {
			String input = in.nextLine();
			String output = "";
			for (int j = 0; j < input.length(); j++) {
				output += b.charAt(a.indexOf(input.charAt(j)));
			}
			out.println("Case #" + i + ": " + output);
		}
		in.close();
		out.close();
	}

}
