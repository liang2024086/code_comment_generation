package methodEmbedding.Cookie_Clicker_Alpha.S.LYD279;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
	public static void main(String args[]) {
		try {
			FileInputStream fstream = new FileInputStream(
					"c:/B-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter fstream2 = new FileWriter("c:/out.txt");
			BufferedWriter out = new BufferedWriter(fstream2);

			int t = Integer.parseInt(br.readLine());

			
			double c, f, x, time1, time2;

			String[] str;
			for (int i = 0; i < t; i++) {
				double cs = 2.0f, tt = 0f;
				str = br.readLine().split(" ");

				c = Double.parseDouble(str[0]);
				f = Double.parseDouble(str[1]);
				x = Double.parseDouble(str[2]);

				boolean stop = false;

				while (!stop) {
					time1 = x / cs;
					time2 = c / cs + x / (cs + f);
					if (time1 <= time2) {
						tt += time1;
						stop = true;
					} else {
						tt += c / cs;
						cs += f;
					}
				}
				String result = String.format("Case #%d: %.7f\n", (i + 1), tt);
				out.write(result);
			}

			out.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}
}
