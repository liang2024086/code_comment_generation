package methodEmbedding.Revenge_of_the_Pancakes.S.LYD712;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

			int N = Integer.parseInt(br.readLine());
			for (int tc = 1; tc <= N; tc++) {

				String exp = br.readLine();
				int count = 0;
				while (exp.contains("-")) {
					if (exp.startsWith("+")) {
						exp = exp.replaceFirst("^\\++", "-");
					} else {
						exp = exp.replaceFirst("^-+", "+");
					}
					count++;
				}
				out.println("Case #" + tc + ": " + count);

			}
			out.close();

		} catch (Exception e) {
			System.out.println("0");

		}

	}

}
