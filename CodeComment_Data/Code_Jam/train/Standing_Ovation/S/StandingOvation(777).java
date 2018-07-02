package methodEmbedding.Standing_Ovation.S.LYD880;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new FileWriter("out"));
		
		int t = Integer.parseInt(br.readLine());
		
		int kase = 0;
		
		while(kase++ < t) {
			String [] input = br.readLine().split("[ ]+");
			int max = Integer.parseInt(input[0]);
			
			int [] array = new int [max + 1];
			
			for (int i = 0; i <= max; i++) {
				array[i] = input[1].charAt(i) - '0';
			}
			
			int answer = 0;
			int total = 0;
			
			for (int i = 0; i <= max; i++) {
				if (total < i) {
					answer += i - total;
					total = i;
				}
				total += array[i];
			}
			
			String output = "Case #" + kase + ": " + answer;
			out.write(output);
			out.write('\n');
		}
		out.close();
	}

}
