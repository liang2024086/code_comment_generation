package methodEmbedding.Cookie_Clicker_Alpha.S.LYD32;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		String input[] = null;

		double cost, fast, x;

		DecimalFormat numberFormat = new DecimalFormat("#.0000000");

		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		int cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < cases; i++) {

			System.out.println("Case " + (i + 1));
			input = br.readLine().split(" ");

			cost = Double.parseDouble(input[0]);
			fast = Double.parseDouble(input[1]);
			x = Double.parseDouble(input[2]);

			double time = 2.0;
			double calculatedtime = 0;
			double totaltime = 0;
			double initialtime = 0;
			initialtime = x / time;

			while (true) {
				totaltime += cost / time;

				time += fast;

				calculatedtime = totaltime + (x / time);

				if (calculatedtime > initialtime) {
					bw.write("Case #" + (i + 1) + ": "
							+ numberFormat.format(initialtime));
					bw.append("\n");
					System.out.println(numberFormat.format(initialtime));
					break;
				}
				initialtime = calculatedtime;

			}

		}
		bw.flush();
		bw.close();
	}

}
