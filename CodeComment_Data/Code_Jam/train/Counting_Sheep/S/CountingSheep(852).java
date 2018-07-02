package methodEmbedding.Counting_Sheep.S.LYD891;


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) {
		Scanner sc = null;
		int T;
		PrintStream ps = null;
		
		try {
			sc = new Scanner(new FileInputStream("input/qr2016/A-small-attempt0.in"));
//			sc = new Scanner(new FileInputStream("input/test.in"));
			ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("input/small.out", false)));
			System.setOut(ps);
			T = sc.nextInt();
			for (int c = 1; c <= T; c++) { 
				int N = sc.nextInt();
				int temp = N;
				int[] d = new int[10];
				int r = 0;
				
				while (r == 0 && temp != 0) {
					String s = String.valueOf(temp);
					for (int i = 0; i < s.length(); i++)
						d[s.charAt(i)- '0']++;
					temp += N;
					r = 1;
					for (int x : d) {
						if (x == 0) {
							r = 0;
							break;
						}
					}
				}
				String result = "INSOMNIA";
				if (r != 0)
					result = "" + (temp-N);
				
				System.out.println("Case #" + c + ": " + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) try {
				sc.close();
			} catch (Exception never) { never.printStackTrace(); }

			if (ps != null) try {
				ps.close();
			} catch (Exception never) { never.printStackTrace(); }
		}
	}
}
