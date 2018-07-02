package methodEmbedding.Counting_Sheep.S.LYD1186;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter(new File("A.out"));
		
		int T = scanner.nextInt();
		boolean[] D = new boolean[10];
		
		for (int i=0; i<T; i++) {
			int N = scanner.nextInt();
			long M = 0;
			boolean F = false;
			
			for (int j=0; j<D.length; j++)
				D[j] = false;
			
			for (int j=0; j<1000000; j++) {
				M = N * (j+1);
				long R = M;
				while (R > 0) {
				    D[(int) R % 10] = true;
				    R = R / 10;
				}
				
				F = true;
				
				for (int k=0; k<D.length; k++)
					if (!D[k])
						F = false;
				
				if (F)
					break;
			}
			
			String r = String.format("Case #%d: %s", i+1, F ? Long.toString(M) : "INSOMNIA");
			System.out.println(r);
			writer.println(r);
		}
		
		scanner.close();
		writer.close();
	}

}
