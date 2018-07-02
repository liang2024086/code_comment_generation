package methodEmbedding.Cookie_Clicker_Alpha.S.LYD847;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class QR14_B {

	static final double delta = 0.0000001;
	public static void main(String[] args) throws Exception {
		BufferedReader fin = new BufferedReader(new FileReader("D:/B-small-attempt0.in"));
		PrintWriter fout = new PrintWriter(new FileWriter("D:/B-small-attempt0.out"));
		String line = fin.readLine();
		int n = Integer.parseInt(line), num = 0;
		while (n-- > 0) {
			num++;
			line = fin.readLine();
			StringTokenizer st = new StringTokenizer(line);
			double c = Double.parseDouble(st.nextToken()), f = Double.parseDouble(st.nextToken()),
					x = Double.parseDouble(st.nextToken());
			
			double farmPrice = 0, nowTiming = x/2, m = 1, nextTiming = 0;
			boolean b = false;
			while (!b) {
				farmPrice += (c / (2+(m-1)*f));
				nextTiming = farmPrice + x/(2+m*f);
				if (Math.abs(nowTiming - nextTiming) < delta || nowTiming < nextTiming)
					b = true;
				else
					nowTiming = nextTiming;
				m++;
			}
			fout.print("Case #" + num + ": ");
			fout.printf("%.7f\n", nowTiming);
		}
		fout.close();
		fin.close();
	}
}
