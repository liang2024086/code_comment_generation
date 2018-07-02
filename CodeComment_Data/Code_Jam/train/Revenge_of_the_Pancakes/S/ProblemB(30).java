package methodEmbedding.Revenge_of_the_Pancakes.S.LYD512;


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

public class ProblemB {
	public static void main(String[] args) throws IOException {
		String inputFilename = "B-small-attempt0.in";
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
			
			line = br.readLine().trim();
			
			while (line.charAt(line.length() - 1) == '+') {
				line = line.substring(0, line.length() - 1);
				if (line.length() == 0) {
					break;
				}
			}
			
			char prev = '0';
			int count = 0;
			for (int j = 0; j < line.length(); j++) {
				char curr = line.charAt(j);
				
				if(curr != prev) {
					count++;
					prev = curr;
				}
			}
			
			answer = answer + count;
			
			System.out.println(answer);
			bw.write(answer + "\n");
			
		}
		br.close();
		bw.close();
	}

}
