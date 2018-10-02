package methodEmbedding.Cookie_Clicker_Alpha.S.LYD522;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeJam2014B {

	public static void main(String[] args) throws IOException {
		BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		String a0 = m.readLine();
		int t = Integer.parseInt(a0);
		int in = 0;

		while (in < t) {
			String out = "";
			a0 = m.readLine();
			String[] cfx = a0.split(" ");
			double c = Double.parseDouble(cfx[0]);
			double f = Double.parseDouble(cfx[1]);
			double x = Double.parseDouble(cfx[2]);

			double time = 0;
			double count = 0;
			double timetoX = 0;
			double timetoC = 0;
			double ic = 2;

			while (count < x) {
				timetoX = x / ic;
				timetoC = c / ic;
				timetoC += time + (x / (ic + f));
				if (timetoC < (timetoX+time)) {
					time += c / ic;
					ic += f;
				} else {
					time += timetoX;
					time = Math.round(time*10000000);
					time /= 10000000;
					out = time + "";
					break;
				}
			}
			System.out.println("Case #" + (in + 1) + ": " + out);
			in++;
		}
	}

}
