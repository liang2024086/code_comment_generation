package methodEmbedding.Speaking_in_Tongues.S.LYD1046;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {

		File file = new File("in.txt");
		Scanner scanner = new Scanner(file);
		FileWriter outFile = new FileWriter("out.txt");
		PrintWriter out = new PrintWriter(outFile);

		String s1 = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
		String s2 = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";

		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		for (int i = 0; i < s1.length(); i++) {
			hm.put(s1.charAt(i), s2.charAt(i));
		}
		hm.put('z', 'q');
		hm.put('q', 'z');
		hm.put(' ', ' ');

		int N = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < N; i++) {

			String in = scanner.nextLine();
			StringBuilder ant = new StringBuilder("");
			
			for (int j = 0; j < in.length(); j++) {
				ant.append(hm.get(in.charAt(j)));
			}

			out.println("Case #" + (i + 1) + ": " + ant.toString());

		}

		out.close();

	}

}
