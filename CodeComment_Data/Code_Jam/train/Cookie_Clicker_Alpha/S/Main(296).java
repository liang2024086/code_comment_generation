package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("F:\\download\\B-small-attempt0.in");
		BufferedReader br = new BufferedReader(in);
		FileWriter out = new FileWriter("F:\\download\\CodeJam\\out.txt");
		BufferedWriter bw = new BufferedWriter(out);

		int t = Integer.parseInt(br.readLine());
		for (int c = 0; c < t; c++){
			String line = br.readLine();
			StringTokenizer St1 = new StringTokenizer(line, " ");
			double cc = Double.valueOf(St1.nextToken()).doubleValue();
			double ff = Double.valueOf(St1.nextToken()).doubleValue();
			double xx = Double.valueOf(St1.nextToken()).doubleValue();

			double cps = 2.0;
			double answer = 0.0;
			
			int count = 0;
			
			while(true){
				count++;
				if (xx/cps > cc/cps + xx/(cps+ff)){
					answer += cc/cps;
					cps += ff;
				}
				else{
					answer += xx/cps;
					break;
				}
			}
			
			bw.write(String.format("Case #%d: %.7f\n", c+1, answer));
		}
		
		br.close();
		in.close();
		bw.close();
		out.close();

	}

}
