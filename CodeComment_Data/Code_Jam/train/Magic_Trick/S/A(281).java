package methodEmbedding.Magic_Trick.S.LYD1319;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader(new File("A.in")));
		PrintWriter out = new PrintWriter(new FileWriter("A.out"));
		int tests = in.nextInt();
		System.out.println(tests);
		for (int k = 1; k <= tests; k++) {
			out.print("Case #" + (k) + ": ");
			System.out.print("Case #" + (k) + ": ");
			
			int [] a = new int[17];
			int r1 = in.nextInt();
			
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					int y = in.nextInt();
					if(i == r1){
						a[y]++;
					}
				}
			}
			
			int r2 = in.nextInt();
			
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					int y = in.nextInt();
					if(i == r2){
						a[y]++;
					}
				}
			}
			
			int num = -1;
			int cnt = 0;
			for (int i = 1; i < a.length; i++) {
				if(a[i] > 1){
					cnt++;
					num = i;
				}
			}
			if(cnt == 1){
				System.out.println(num);
				out.println(num);				
			}else if(cnt > 1){
				System.out.println("Bad magician!");
				out.println("Bad magician!");	
			}else{
				System.out.println("Volunteer cheated!");
				out.println("Volunteer cheated!");	
			}			
		}
		out.close();
	}
}
