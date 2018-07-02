package methodEmbedding.Counting_Sheep.S.LYD553;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		

		
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int testCases = in.nextInt();

		for (int t = 1; t <= testCases; t++) {
			String res = "";
			boolean sleep0 = false;
			boolean sleep1 = false;
			boolean sleep2 = false;
			boolean sleep3 = false;
			boolean sleep4 = false;
			boolean sleep5 = false;
			boolean sleep6 = false;
			boolean sleep7 = false;
			boolean sleep8 = false;
			boolean sleep9 = false;
			
			int N = in.nextInt();
			if (N >= 0 && N <= 200) {
				for (int i = 1;; ++i) {
					res = "" + N * i;

					if (!sleep0 && res.contains("0")) {
						sleep0 = true;
					}
					if (!sleep1 && res.contains("1")) {
						sleep1 = true;
					}
					if (!sleep2 && res.contains("2")) {
						sleep2 = true;
					}
					if (!sleep3 && res.contains("3")) {
						sleep3 = true;
					}
					if (!sleep4 && res.contains("4")) {
						sleep4 = true;
					}
					if (!sleep5 && res.contains("5")) {
						sleep5 = true;
					}
					if (!sleep6 && res.contains("6")) {
						sleep6 = true;
					}
					if (!sleep7 && res.contains("7")) {
						sleep7 = true;
					}
					if (!sleep8 && res.contains("8")) {
						sleep8 = true;
					}
					if (!sleep9 && res.contains("9")) {
						sleep9 = true;
					}

					if (sleep0 && sleep1 && sleep2 && sleep3 && sleep4 && sleep5 && sleep6 && sleep7 && sleep8
							&& sleep9)
						break;

					if (i == 100) {
						res = "INSOMNIA";
						break;
					}

				}
				System.out.println("Case #"+t+": " + res);
			}
		}
	}
}
