package methodEmbedding.Magic_Trick.S.LYD1935;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai1 {
	public static void main(String[] args) throws IOException {
		int[] a = new int[4];
		int[] b = new int[4];
		String iF = "D:\\A-small-attempt0.in";
		Scanner sc = new Scanner(new FileReader(iF));
		String oF = "D:\\A-small-attempt0.out";
		PrintWriter pw = new PrintWriter(oF);
		int n = sc.nextInt();
		int timeRun = 1;

		while (timeRun <= n) {

			int A = sc.nextInt();
			sc.nextLine();
			String[] B = new String[4];
			for (int i = 0; i < 4; i++) {
				B[i] = sc.nextLine();
			}
			StringTokenizer stk = new StringTokenizer(B[A - 1]);
			int C = 0;
			while (stk.hasMoreTokens()) {
				a[C] = Integer.parseInt(stk.nextToken());
				C ++;

			}
			int A1 = sc.nextInt();
			sc.nextLine();
			String[] B1 = new String[4];
			for (int i = 0; i < 4; i++) {
				B1[i] = sc.nextLine();
			}
			StringTokenizer stk2 = new StringTokenizer(B1[A1 - 1]);
			int C1 = 0;
			while (stk2.hasMoreTokens()) {
				b[C1] = Integer.parseInt(stk2.nextToken());
				C1 ++;
			}
			int numberLike = 0;
			int number2 = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						numberLike ++;
						number2 = a[i];
					}
				}
			}
			if (numberLike == 1) {
				pw.println("Case #"+timeRun +": " + number2);

			} else if (numberLike == 0) {
				pw.println("Case #"+timeRun +": Volunteer cheated!");
			} else {
				pw.println("Case #"+timeRun +": Bad magician!");
			}
			timeRun = timeRun + 1;
		}
		pw.flush();
		pw.close();
	System.out.println("Done");
	}
}
