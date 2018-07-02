package methodEmbedding.Speaking_in_Tongues.S.LYD898;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String english = " qzourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
		String googlese= " zqejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
		Scanner a = new Scanner(new File("/Users/anurag/Dev/Java/workspace/CodeJam/src/input"));
		FileWriter w = new FileWriter(new File("/Users/anurag/Dev/Java/workspace/CodeJam/src/output"));
		int T = a.nextInt();
		a.nextLine();
		for (int t = 1; t <= T; ++t) {
			String garbage = a.nextLine();
			StringBuilder translated = new StringBuilder();
			for (char c: garbage.toCharArray()) {
				translated.append(english.charAt(googlese.indexOf(c)));
			}
			
			w.write(String.format("Case #%d: %s\n", t, translated.toString()));
		}
		
		w.close();

	}
	
	
	
	


}
