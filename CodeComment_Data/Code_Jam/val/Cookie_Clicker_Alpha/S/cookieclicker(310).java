package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1053;


import java.util.*;
import java.io.*;

public class cookieclicker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
		PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
		int T = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;
		for (int i =1; i <= T; i++) {
			out.print("Case #"+i+": ");
			st = new StringTokenizer(br.readLine());
			double C = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			double X = Double.parseDouble(st.nextToken());
			double min = Double.MAX_VALUE;
			double rate = 2.0;
			double start = 0.0;
			while (start < min) {
				min = Math.min(min, start + X/rate);
				start += C/rate;
				rate += F;
			}
			out.printf("%.7f\n", min);
		}
		out.close();
	}
}
