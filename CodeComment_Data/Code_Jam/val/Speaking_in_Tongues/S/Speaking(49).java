package methodEmbedding.Speaking_in_Tongues.S.LYD541;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class Speaking {

	public static void main(String a[]) throws NumberFormatException, IOException{
		String input = "zqejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";

		String output = "qzour language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

		HashMap<Character,Character> letters = new HashMap<Character,Character>();

		for(int i = 0; i < input.length(); i++){

			letters.put(input.charAt(i), output.charAt(i));

		}

		PrintWriter pw = new PrintWriter(new FileWriter("data/output"));
		BufferedReader br = new BufferedReader(new FileReader ("data/A-small-attempt2.in"));
		int lines = Integer.parseInt(br.readLine());
		for(int j = 0; j < lines; j++){
			String sol = "Case #" + (j+1) + ": ";
			String toSolve = br.readLine();
			for(int i = 0; i < toSolve.length(); i++){
				//Character value = letters.get(input.charAt(i));
				sol += letters.get(toSolve.charAt(i));
			}
			pw.println(sol);
		}
		pw.close();
	}

}
