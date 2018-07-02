package methodEmbedding.Counting_Sheep.S.LYD1158;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class ProblemA {
	public static void main(String[] args) throws IOException {
		String inputFilename = "A-small-attempt0.in";
		String outputFilename = inputFilename + ".out";
		
		// Standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// File input
		br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilename)));
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilename)));
		
		String line = br.readLine();
		int T = (int) Integer.parseInt(line.trim());
		
		for (int i = 0; i < T; i++) {
			String answer = "Case #" + (i + 1) + ": ";
			
			long N = (long) Long.parseLong(br.readLine().trim());
			
			
			if (N == 0) {
				answer = answer + "INSOMNIA";
			} else {
				HashMap<String, String> digits = new HashMap<>();
				for (int j = 0; j < 10; j++) {
					digits.put("" + j, "" + j);
				}
				
				for (long k = 1; k != 0; k++) {
					String strN = "" + ( N * k );
					String[] obtainedDigits = strN.split("");
					for (int j = 0; j < obtainedDigits.length; j++) {
						digits.remove(obtainedDigits[j]);
					}
					
					if (digits.isEmpty()) {
						answer = answer + strN;
						break;
					}
				}
			}
			
			System.out.println(answer);
			bw.write(answer + "\n");
			
		}
		br.close();
		bw.close();
	}

}
