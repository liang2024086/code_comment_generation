package methodEmbedding.Revenge_of_the_Pancakes.S.LYD767;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class RevengeOfThePancakes {
	public static void main(String[] args) throws Exception {
		File f = new File("B-small-attempt0.in");
		PrintWriter outputWriter = new PrintWriter("output-large.txt");
		
		BufferedReader inputReader = new BufferedReader(new FileReader(f));
		int numOfTestCases = Integer.parseInt(inputReader.readLine());
		for(int i=0; i < numOfTestCases; i++) {
			char arr[] = inputReader.readLine().toCharArray();

			int flip = 0;
			for(int j = arr.length-1; j >= 0;) {
				if((flip % 2 == 0 && arr[j] == '-') || (flip % 2 == 1 && arr[j] == '+')) {
					char start = arr[j];
					while(j >= 0 && arr[j] == start) {
						--j;
					}
					++flip;
				}
				else {
					--j;
				}
			}
			
			outputWriter.println("Case #" + (i+1) + ": " + flip);
		}
		outputWriter.close();
	}
}
