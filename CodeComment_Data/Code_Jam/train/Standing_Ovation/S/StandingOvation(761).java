package methodEmbedding.Standing_Ovation.S.LYD1949;


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner sc = null;
		int T;
		PrintStream ps = null;
		
		try {
			sc = new Scanner(new FileInputStream("input/qr2015/A-small-attempt0.in"));
			ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("input/small.out", false)));
			System.setOut(ps);
			T = sc.nextInt();
			for (int i = 1; i <= T; i++) { 
				int smax = sc.nextInt();
				String temp = sc.next();
				int[] input = new int[smax+1];
				for (int j = 0; j < input.length; j++)
					input[j] = (int)temp.charAt(j)-48;
				
				int sum = input[0];
				int supp = 0;
				for (int j = 1; j < input.length; j++) {
					if (input[j] == 0) continue;
					if (sum < j) {
						supp += (j-sum);
						sum = j;
					}
					sum += input[j];
//					System.out.println("j: " + j + " sum: " + sum + " supp: " + supp); 
				}
				
				System.out.println("Case #" + i + ": " + supp);
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
