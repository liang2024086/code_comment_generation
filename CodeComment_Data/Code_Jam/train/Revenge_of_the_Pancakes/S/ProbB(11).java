package methodEmbedding.Revenge_of_the_Pancakes.S.LYD358;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProbB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Harish/Downloads/B-small-attempt1.in"));
		String line = br.readLine();
		int t = Integer.parseInt(line);
		int counter = 1;
		while (t-- > 0) {
			line = br.readLine();
			int count = 0;
			int l = line.length();
			char c = line.charAt(0);
			if (line.contains("-")) {
				for(int i=0;i<l;i++){
					if(line.charAt(i) != c){
						count++;
						c = line.charAt(i);
					}
				}
				if(line.charAt(l-1) == '-') count++;
			}
			System.out.println("Case #" + (counter++) + ": " + count);
		}
	}

}
