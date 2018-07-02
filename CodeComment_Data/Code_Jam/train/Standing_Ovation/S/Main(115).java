package methodEmbedding.Standing_Ovation.S.LYD1557;


import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int Case = 1;
		while (T-- > 0) {
			System.out.print("Case #" + Case + ": ");
			Case++;
			long answer = 0;
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int arr[] = new int[n + 1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = str[1].charAt(i) - '0';
			}
			int start = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i >= start) {
					answer = answer + (i - start);
					start = start + (i - start);
				}
				start = start + arr[i];
			}
			System.out.println(answer);
		}

	}
}
