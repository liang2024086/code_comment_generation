package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cookie2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] line = br.readLine().split(" ");
			double C = Double.parseDouble(line[0]);
			double F = Double.parseDouble(line[1]);
			double X = Double.parseDouble(line[2]);
			
			double cumtime = 0;
			double currprod = 2;
			
			boolean isFinished = false;
			while (!isFinished) {
				double needed = C / currprod + X / (currprod + F);
				double dest = X / currprod;
				if (dest <= needed) {
					cumtime += dest;
					break;
				}
				cumtime += C / currprod;
				currprod += F;
			}
			System.out.printf("Case #%d: %.7f\n", i + 1, cumtime);
			
		}
	}
}
