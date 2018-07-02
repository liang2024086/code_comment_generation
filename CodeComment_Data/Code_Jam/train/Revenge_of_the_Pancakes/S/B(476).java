package methodEmbedding.Revenge_of_the_Pancakes.S.LYD807;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class B {
	static final String INPUT_FILE = "Q/B/small.in";
	static final String OUTPUT_FILE = "Q/B/small-output.txt";
	
	public static void main(String args[]) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(new File(INPUT_FILE));
		BufferedWriter out = new BufferedWriter(new FileWriter(new File(OUTPUT_FILE)));
		

		int T = in.nextInt();
		in.nextLine();
		
		for (int t = 1; t <= T; t++) {
			int result = 0;
			
			String line = in.nextLine();
			char[] array = line.toCharArray();
			
			int i = array.length-1;
			
			
			while (i >= 0) {
				
				while (i >= 0 && array[i] == '+') {
					i--;
				}
				
				boolean toFlip = false;
				while (i >= 0 && array[i] == '-') {
					i--;
					toFlip = true;
				}
				
				if (toFlip) {
					result++;
					
					for (int j = 0; j <= i; j++) {
						if (array[j] == '+')
							array[j] = '-';
						else
							array[j] = '+';
					}
				}
				
				
			}
			


			System.out.println("Case #" + t + ": " + result);
			out.append("Case #" + t + ": " + result);
			out.newLine();
		}
		
		
		in.close();
		out.close();
	}
}
