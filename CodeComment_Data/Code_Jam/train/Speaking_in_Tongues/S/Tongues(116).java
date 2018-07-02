package methodEmbedding.Speaking_in_Tongues.S.LYD271;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class Tongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String goog = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
		String english = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
		HashMap<String, String> ht = new HashMap<String, String>();
		
		for (int i = 0; i < goog.length(); i++) {
			if (!ht.containsKey(goog.charAt(i))) {
				ht.put(String.valueOf(goog.charAt(i)), String.valueOf(english.charAt(i)));
			}
		}
		
		ht.put("q", "z");
		ht.put("z", "q");

		Scanner sc = new Scanner(new FileReader("tongues.in"));
		PrintWriter out = new PrintWriter(new FileWriter("TonguesAsmall.out"));
		
		int cases = sc.nextInt();
		sc.nextLine();
		
	
		
		for (int i = 0; i < cases; i++) {
			String s = sc.nextLine();
			out.print("Case #" + (i + 1) + ": ");

			for (int j = 0; j < s.length(); j++) {
				//System.out.print(String.valueOf(s.charAt(j)));
				

				if (String.valueOf(s.charAt(j)).equals(" ")) {
					out.print(" ");
				}
				else if (ht.containsKey(String.valueOf(s.charAt(j)))) {
					out.print(ht.get(String.valueOf(s.charAt(j))));
				}
			}
			out.println();
		}
		
		out.close();
		
	}

}
