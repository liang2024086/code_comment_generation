package methodEmbedding.Magic_Trick.S.LYD463;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	
	public static void main(String[] args) throws FileNotFoundException{
		int[][] table = new int[4][4];
		Scanner in = new Scanner(new File(args[0] + ".in"));
		int tests = in.nextInt();
		PrintWriter out = new PrintWriter("output.out");
		for(int i = 1; i <= tests; i++){
			ArrayList<Integer> nums = new ArrayList<Integer>();
			int row = in.nextInt();
			for(int r = 0; r < 4; r++)
					for(int c = 0; c < 4; c++)
						if(r + 1 == row)
							nums.add(in.nextInt());
						else
							in.nextInt();
			row = in.nextInt();
			int count = 0;
			int num = 0;
			for(int r = 0; r < 4; r++)
					for(int c = 0; c < 4; c++)
						if(r + 1 == row){
							int tmp;
							if(nums.contains(tmp = in.nextInt())){
								num = tmp;
								count++;
							}
						}else
							in.nextInt();
			if(count == 0)
				out.println("Case #" + i + ": Volunteer cheated!");
			else if(count == 1)
				out.println("Case #" + i + ": " + num);
			else			
				out.println("Case #" + i + ": Bad magician!");
		}
		out.close();
	}
}
