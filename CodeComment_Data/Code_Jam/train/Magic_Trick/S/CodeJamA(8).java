package methodEmbedding.Magic_Trick.S.LYD1310;

import java.io.*;
import java.util.Scanner;
public class CodeJamA {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("A-small-attempt1.in"));
		PrintWriter out = new PrintWriter("A-small-attempt0.out");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			int[] ss1 = new int[4];
			for (int j = 1; j <= 4; j++) {
				if (j==k) {
					for (int t = 0; t<4; t++) {
						ss1[t] = scanner.nextInt();
					}	
				} else for (int t = 0; t<4; t++) {
					scanner.nextInt();
				}							
			}
			k = scanner.nextInt();
			int[] ss2 = new int[4];
			for (int j = 1; j <= 4; j++) {
				if (j==k) {
					for (int t = 0; t<4; t++) {
						ss2[t] = scanner.nextInt();
					}	
				} else for (int t = 0; t<4; t++) {
					scanner.nextInt();
				}							
			}
			int count = 0;
			int number =0;
			for (int j = 0; j<ss1.length; j++) {
				for (int t = 0; t<ss2.length; t++) {
					if (ss1[j]==ss2[t]) {
						count++;
						number = ss1[j];
					}
				}	
			}
			if (count == 0) {
				out.println("Case #"+(i+1)+": Volunteer cheated!");
			} else if (count==1) {
				out.println("Case #"+(i+1)+": "+number);
			} else if (count > 1) {
				out.println("Case #"+(i+1)+": Bad magician!");
			}
		}
		out.close();
	}
}	
				
