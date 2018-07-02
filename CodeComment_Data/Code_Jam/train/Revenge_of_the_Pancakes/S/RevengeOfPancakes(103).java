package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1179;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevengeOfPancakes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/vigneshiyer/Desktop/B-small-attempt0.in"));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] result = new String[t];
		for (int i = 0; i < t; i++) {
			String line = br.readLine();
			char x = line.charAt(0);
			
			int numPlusMinus = 0;
			for (int j = 0; j < line.length() - 1; j++) {
				if (line.charAt(j) == '+' && line.charAt(j+1) == '-') {
					numPlusMinus++;
					j++;
				}
			}
			
			if (x == '+') {
				result[i] = Integer.toString(numPlusMinus*2);
			}
			else {
				result[i] = Integer.toString(numPlusMinus*2+1);
			}
			
			
		}
		FileIO.writeAllLines("/Users/vigneshiyer/Desktop/B.txt", result);
	}
}
