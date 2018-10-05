package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1066;


import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(new File("out.txt"));

		Scanner scan = new Scanner(System.in);
		int test_case = scan.nextInt();
		for (int test = 1; test <= test_case; test++) {

			String str = scan.next();
			int len = str.length();
			int arr[] = new int[len];

			int step = 0;
			for (int j = 0; j < len; j++) {
				if (str.charAt(j) == '+')
					arr[j] = 1;
				else
					arr[j] = 0;
			}

			step = 1 - arr[0];
			for (int j = 1; j < len; j++) {
				int pre = arr[j - 1];
				int cur = arr[j];

				if (pre != cur) {
					if (cur == 0)
						step += 2;
				}
			}

			out.println("Case #" + test + ": " + step);
		}

		out.flush();
		out.close();
	}
}
