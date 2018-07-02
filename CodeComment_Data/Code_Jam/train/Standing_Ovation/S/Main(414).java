package methodEmbedding.Standing_Ovation.S.LYD2021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("F:\\download\\A-small-attempt0.in");
		BufferedReader br = new BufferedReader(in);
		FileWriter out = new FileWriter("F:\\download\\CodeJam\\out.txt");
		BufferedWriter bw = new BufferedWriter(out);

		int t = Integer.parseInt(br.readLine());
		for (int c = 0; c < t; c++){

			String line = br.readLine();
			StringTokenizer St1 = new StringTokenizer(line, " ");
			int s = Integer.valueOf(St1.nextToken()).intValue();
			String k = St1.nextToken();

			int stand = 0;
			int answer = 0;
			for (int i = 0; i <= s; i++){
				int n = k.charAt(i) - 48;
				
				if (stand < i){
					answer += (i - stand);
					stand = i;
				}
				stand += n;
			}
			
			bw.write(String.format("Case #%d: %d\n", c+1, answer));

		}
		
		br.close();
		in.close();
		bw.close();
		out.close();

	}



}
