package methodEmbedding.Standing_Ovation.S.LYD1929;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("in"));
		PrintWriter out = new PrintWriter("out");
		int T = in.nextInt();
		
		for (int i = 1; i <= T;i++) {
			int maxN = in.nextInt();
			int maxH = 0;
			int add = 0;
			String line = in.next();
			
			for (int j = 0;j <= maxN;j++) {
				if (maxH >= maxN)
					break;
				
				int x = Integer.parseInt(line.substring(j, j+1));
				
				if (maxH < j) {
					add++;
					maxH++;
				}
				maxH += x;
			}
			
			System.out.println("Case #" + i + ": " + add);
			out.println("Case #" + i + ": " + add);
		}
		
		out.close();
		in.close();
	}

}
