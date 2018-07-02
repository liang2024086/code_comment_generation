package methodEmbedding.Counting_Sheep.S.LYD92;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public Main() {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(System.out);
		
		int t = in.nextInt();
		
		for (int j = 1; j < t+1; j++) {
			final int n = in.nextInt();
			
			if (n == 0) {
				out.printf("Case #%d: INSOMNIA\n", j);
			} else {
				int a[] = new int[10];
				int t10 = 0;
				
				int i = 2;
				int nn = n;
				
			main : do {
					int z = nn;
					
					do {
						int k = z % 10;
						
						if (a[k] == 0) {
							a[k] = 1;
							t10++;
							
							if (t10 == a.length) {
								break main;
							}
							
						}
					} while ((z /= 10) > 0);

					nn = n * i++;
				} while (true);
				
				out.printf("Case #%d: %d\n", j, nn);
			}
			
		}
		
		in.close();
		
		out.flush();
		out.close();
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
	
}
