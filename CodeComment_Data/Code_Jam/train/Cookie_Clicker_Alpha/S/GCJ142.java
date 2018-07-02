package methodEmbedding.Cookie_Clicker_Alpha.S.LYD838;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;

/**
 * 
 */

/**
 * @author behroozkamali
 *
 */
public class GCJ142 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader inp = null;
		BufferedWriter out = null;
		try {
			inp = new BufferedReader(new FileReader("inp.txt"));
			out = new BufferedWriter(new FileWriter("out.txt"));
			int T = Integer.parseInt(inp.readLine());
			for(int i = 1; i <= T; i++) {
				String[] values = inp.readLine().split(" ");
				double c = Double.parseDouble(values[0]); //farm cost
				double f = Double.parseDouble(values[1]); //farm yield
				double x = Double.parseDouble(values[2]); //goal
				double old = x/2;
				double sum = c/2;
				boolean done = false;
				int count = 0;
				while(!done) {
					count++;
					double y = count * f;
					double temp = c/(2 + y);
					if(x/(y+2) + sum >= old) {
						done = true;
					} else {
						old = x/(y+2) + sum;
					}
					sum += temp;
				}
				Formatter fmt = new Formatter();
				fmt.format("Case #%d: %.7f\n", i, old);
				//System.out.format(fmt.toString());
				out.write(fmt.toString());
			}
			inp.close();
			out.close();
		} catch (Exception e) {
			System.out.println("Catch error: " + e.getMessage());
		}
	}

}
