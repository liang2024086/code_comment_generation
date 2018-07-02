package methodEmbedding.Standing_Ovation.S.LYD268;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new FileReader("A.txt"));
		//BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new File("ans.txt"));
		//PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.parseInt(scan.readLine());
		for (int q = 1; q <= t; q++) {
			StringTokenizer st = new StringTokenizer(scan.readLine());
			int n = Integer.parseInt(st.nextToken());
			int ans = 0;
			int count = 0;
			String srs = st.nextToken();
			for (int i = 0; i < n + 1; i++) {
				count = count + Integer.parseInt(srs.charAt(i) + "");
				if (count < i + 1) {
					ans = ans + (i+1)-count;
					count = i+1;
				}
			}
			System.out.println("Case #" + q + ": " + ans);
			pw.close();
		}
	}
}
