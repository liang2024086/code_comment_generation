package methodEmbedding.Cookie_Clicker_Alpha.S.LYD377;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base = "D:\\GoogleCodeJam\\googleCJ\\";
		String fileName = "B-small-attempt0 (1).in";
		String path = base + fileName;
		PrintWriter out = null;
		try {
			out = new PrintWriter(base + "SecondProblem.out");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(	path)));
			int t = Integer.parseInt(br.readLine());
			double c = 0, f = 0, x = 0, result = 0;
			DecimalFormat df = new DecimalFormat(".0000000");
			String data[] = null;
			double tc = 2.0;
			double aux = 0;
			double aucc = 0;

			for (int i = 1; i <= t; i++) {
				data = br.readLine().split(" ");
				c = Double.parseDouble(data[0]);
				f = Double.parseDouble(data[1]);
				x = Double.parseDouble(data[2]);
				 tc = 2.0;
				 result=0;
				while (true) {
					aux = x / tc;
					aucc = c / tc;
					if (c/tc+x/(tc+f)>x/tc) {
						aux += result;
						System.out.println("Case #" + i + ": " +df.format(aux));
						out.println("Case #" + i + ": " +df.format(aux));
						break;
					}
					result += aucc;
					tc += f;	
				}

			}
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
