package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {
			String[] S = in.readLine().split(" ");
			double C = Double.parseDouble(S[0]);
			double F = Double.parseDouble(S[1]);
			double X = Double.parseDouble(S[2]);
			double minT = Double.MAX_VALUE;
			double prod = 2.0;
			double t = 0.0;
			for (int j = 0; j < (int)X+1; j++) {
				if(minT >  t + X/prod)
					minT = t + X/prod;
				t += C/prod;
				prod+=F;
			}
			DecimalFormat df = new DecimalFormat("0.00000000");
			String a = df.format(minT);
			a = a.replace(',', '.');
			System.out.println("Case #"+(i+1)+": "+a);
		}
	}

}
