package methodEmbedding.Standing_Ovation.S.LYD60;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class A {
	static final String INPUT_FILE = "Q/A/small.in";
	static final String OUTPUT_FILE = "Q/A/small-output.txt";
	
	public static void main(String args[]) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(new File(INPUT_FILE));
		BufferedWriter out = new BufferedWriter(new FileWriter(new File(OUTPUT_FILE)));
		

		int T = in.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int n = in.nextInt();
			int S[] = new int[n+1];
			
			String string = in.nextLine();
			for (int i = 0; i <= n; i++) {
				S[i] = Integer.parseInt(String.valueOf(string.charAt(i+1)));
			}

			int peopleToInvite = 0;
			int peopleClapping = 0;
			for (int i = 0; i <= n; i++) {
				if (peopleClapping < i) {
					peopleToInvite += i - peopleClapping;
					peopleClapping += i - peopleClapping;
				}

				peopleClapping += S[i];
			}
			
			System.out.println("Case #" + t + ": " + peopleToInvite);
			out.append("Case #" + t + ": " + peopleToInvite);
			out.newLine();
		}
		
		
		in.close();
		out.close();
	}
}
