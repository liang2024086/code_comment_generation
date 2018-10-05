package methodEmbedding.Magic_Trick.S.LYD1888;

import static java.lang.StringBuffer.*; //Of Utmost Importance and Indisputable Gravity.
import static java.lang.Math.*;
import java.math.*;
import java.util.*;
import java.io.*;

public class MagicTrick {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("magic.out")); 
		
		
		int times = sc.nextInt();
		for(int time = 1;time <= times;time++)
		{
			out.print("Case #" + time + ": ");
			
			int row1 = sc.nextInt()-1;
			int[] set1 = new int[4];
			
			for(int x = 0;x < 4;x++)
				for(int y = 0;y < 4;y++) {
					if(x == row1)
						set1[y] = sc.nextInt();
					else sc.nextInt();
				}
			
			
			int row2 = sc.nextInt()-1;
			int[] set2 = new int[4];
			
			for(int x = 0;x < 4;x++)
				for(int y = 0;y < 4;y++) {
					if(x == row2)
						set2[y] = sc.nextInt();
					else sc.nextInt();
				}
					
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for(int x = 0;x < set1.length;x++)
				for(int y = 0;y < set2.length;y++)
					if(set1[x] == set2[y])
						nums.add(set1[x]);
			
			switch(nums.size()) {
			case 0: out.println("Volunteer cheated!"); break;
			case 1: out.println(nums.get(0)); break;
			default: out.println("Bad magician!"); break;
			}
		}
		
		sc.close();
		out.close();
	}
}
