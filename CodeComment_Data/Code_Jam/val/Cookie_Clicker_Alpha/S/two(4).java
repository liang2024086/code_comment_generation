package methodEmbedding.Cookie_Clicker_Alpha.S.LYD441;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File(args[0] + args[1]));
			FileWriter f = new FileWriter(new File(args[0] + "output2"));
			int N = s.nextInt();

			String c;
			
			double C, F, X;

			double r, t, x;

			for (int n = 0; n < N; n++) {
				C = Double.valueOf(s.next());//s.nextDouble();
				F = Double.valueOf(s.next());
				X = Double.valueOf(s.next());
				System.out.println(C+" "+F+" "+X); 
				r = 2.000000;
				t = 0.000000;
				x = 0.000000;

				while ((X - x) > C) {
					x = x + C;
					t = t + (C / r);
					if (((X - x) / r) > ((X - (x - C)) / (r + F))) {
						x = x - C;
						r = r + F;
					} 
				}

				t = t + ((X - x) / r);
				
				f.write("Case #" + (n + 1) + ": " + (t*10000000/10000000) + "\n");
			}
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
