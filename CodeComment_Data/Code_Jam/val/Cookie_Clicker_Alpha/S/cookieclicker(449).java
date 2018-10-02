package methodEmbedding.Cookie_Clicker_Alpha.S.LYD993;

import java.io.*;
import java.util.*;

class cookieclicker {
	public static void main (String [] args) throws IOException {
		long start = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new FileReader("cookieclicker.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cookieclicker.out")));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double C = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			double X = Double.parseDouble(st.nextToken());
			if (X/C >= 2./F + 1.) {
                double n = Math.ceil(X/C - 2./F - 1.);
                System.out.println(n);
                double answer = 0.;
                for (double j = 0.; j < n; j++) {
                    answer += C/(2.+j*F);
                }
                answer += X/(2.+(n)*F);
                out.println("Case #" + (i+1) + ": " + answer);
            } else {
                out.println("Case #" + (i+1) + ": " + X/2.);
            }
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		out.close();
		System.exit(0);
	}
}

