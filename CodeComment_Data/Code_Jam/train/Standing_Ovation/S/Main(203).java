package methodEmbedding.Standing_Ovation.S.LYD1593;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String []args) throws FileNotFoundException, IOException {
		
		Scanner br = new Scanner(new FileInputStream(new File("input.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
		int n = br.nextInt();
		for (int i = 0; i < n; i++) {
			int Smax = br.nextInt();
			String s = br.next();
			int sum = 0;
			int missingSum = 0;
			for (int j = 0; j < s.length(); j++) {
				int c = Character.getNumericValue(s.charAt(j));
				if (j > sum) {
					missingSum += j - sum;
					sum = j;
				}
				sum += c;
				if (sum >= Smax) break;
			}
			bw.write("Case #" + (i + 1) + ": " + missingSum + "\n");
		}
		bw.close();
		br.close();
	}
	
}
