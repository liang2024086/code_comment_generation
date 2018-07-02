package methodEmbedding.Magic_Trick.S.LYD1902;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		FileOutputStream fos = new FileOutputStream("A-small-attempt0.out");
		
		int test_case = scanner.nextInt();
		for (int t = 1; t <= test_case; t++) {
			int a[][] = new int[5][5];
			int b[][] = new int[5][5];
			boolean p[] = new boolean[17];
			
			int m = scanner.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					a[i][j] = scanner.nextInt();
				}
			}
			
			int n = scanner.nextInt();
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					b[i][j] = scanner.nextInt();
				}
			}
			
			for (int i = 1; i <= 16; i++)
				p[i] = false;
			for (int i = 1; i <= 4; i++)
				p[a[m][i]] = true;
			
			int count = 0;
			int ans = 0;
			for (int i = 1; i <= 4; i++) {
				if (p[b[n][i]]) {
					count++;
					ans = b[n][i];
				}
			}
			
			String tmp = "";
			switch (count) {
				case 0:
					tmp = "Volunteer cheated!";
					break;
				case 1:
					tmp = new Integer(ans).toString();
					break;
				default:
					tmp = "Bad magician!";
					break;
			}
			String result = String.format("Case #%d: %s\n", t, tmp);
			fos.write(result.getBytes());
		}
		fos.flush();
		scanner.close();
		fos.close();

	}

}
