package methodEmbedding.Cookie_Clicker_Alpha.S.LYD180;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cookies {
	public static void main(String args[]) throws IOException {
		double c, f, k, t, t1, t2, pr;
		int test;
		boolean tr;
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		FileWriter ww = new FileWriter("output.txt");
		test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			t=0;tr=true;pr=2;
			c = sc.nextDouble();
			f = sc.nextDouble();
			
			k = sc.nextDouble();
			
			while (tr) {
				t1 = c / pr;
				t2 = k / pr;
				if ((k / (pr + f) + t1 + t) > (t2 + t)) {
					t = t + t2;
					tr = false;

				} else {
					pr += f;
					t = t + t1;
				}
			}
		
			ww.write("case #" + (i + 1) + ": " + t);
			ww.write("\n");
		
		}
		sc.close();
		ww.close();
	}

}
