package methodEmbedding.Magic_Trick.S.LYD397;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;


public class MagicTrick {
	MagicTrick() throws Exception{
		Scanner in = new Scanner(new File("magicTrick.in"));
		PrintWriter out = new PrintWriter(new File("magicTrick.out"));
		
		int tests = in.nextInt();
		for(int t = 1; t<=tests; t++){
			int row = in.nextInt();
			TreeSet<Integer> set1 = new TreeSet<>();
			for(int r = 1; r<=4; r++)
				for(int c = 1; c<=4; c++){
					int val = in.nextInt();
					if(r == row)
						set1.add(val);
				}
			row = in.nextInt();
			TreeSet<Integer> set2 = new TreeSet<>();
			for(int r = 1; r<=4; r++)
				for(int c = 1; c<=4; c++){
					int val = in.nextInt();
					if(r == row)
						set2.add(val);
				}
			String res = "";
			TreeSet<Integer> union = new TreeSet<>();
			for(int i: set1)
				if(set2.contains(i))
					union.add(i);
			if(union.size() > 1)
				res = "Bad magician!";
			else if(union.isEmpty())
				res = "Volunteer cheated!";
			else res = ""+union.first();
			
			out.printf("Case #%d: %s\n", t, res);
		}
		
		in.close();
		out.close();
	}
	public static void main(String[] args) throws Exception{
		new MagicTrick();
	}
}
