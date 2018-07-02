package methodEmbedding.Standing_Ovation.S.LYD990;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class One {

	public static void main(String[] args) throws IOException {
		int numProb = 0, maxShy = 0;
		String aud = new String();
		File in = new File(
				"C:\\Users\\Drew\\Workspace School\\CodeJam\\src\\test.txt");
		File out = new File	("C:\\Users\\Drew\\Workspace School\\CodeJam\\src\\output.txt");
        BufferedWriter output = new BufferedWriter(new FileWriter(out));


		Scanner sc = new Scanner(in);
		numProb = sc.nextInt();
		for (int i = 0; i < numProb; i++) {
			maxShy = sc.nextInt();
			sc.skip(" ");
			aud = sc.next();
			int k = 0;
			int ova = 0;
			int friends = 0;
			while (k < maxShy) {
				ova += aud.charAt(k) - 48;
				while ((ova + friends) < k + 1) {
					++friends;
				}
				++k;
			}
		    output.write("Case #" + (i+1) + ": " + friends);
	        output.newLine();
	        
			System.out.println("Case #" + (i+1) + ": " + friends);
		}
		
		output.close();
	}
}
