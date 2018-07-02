package methodEmbedding.Standing_Ovation.S.LYD1182;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) throws FileNotFoundException{
		File f = new File("A-small-attempt1.in");
		Scanner s = new Scanner(f);
		PrintWriter p = new PrintWriter("as.out");
		int T = s.nextInt();
		for(int i=0;i<T;i++){
			int sm = s.nextInt();
			String l = s.nextLine().substring(1);
			int sum = 0;
			int max = 0;
			for(int j=0;j<=sm;j++){
				max = Math.max(max, j-sum);
				sum += (int)l.charAt(j)-48;
			}
			p.write("Case #" + (i+1) + ": " + max + "\n");
		}
		p.close();
	}
}
