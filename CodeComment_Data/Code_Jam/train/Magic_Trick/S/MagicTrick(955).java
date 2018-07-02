package methodEmbedding.Magic_Trick.S.LYD1214;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("MagicTrick"));
		int t = in.nextInt();
		for(int x = 0; x < t; x++)
		{
			int ans1 = in.nextInt();
			Integer[][] m = new Integer[4][4];
			for(int y = 0; y < 4; y++)
			{
				for(int z = 0; z < 4; z++)
				{
					m[y][z] = in.nextInt();
				}
			}
			int ans2 = in.nextInt();
			Integer[][] mm = new Integer[4][4];
			for(int y = 0; y < 4; y++)
			{
				for(int z = 0; z < 4; z++)
				{
					mm[y][z] = in.nextInt();
				}
			}
			
			Set<Integer> r1 = new HashSet<>();
			Set<Integer> r2 = new HashSet<>();
			r1.addAll(Arrays.asList(m[ans1-1]));
			r2.addAll(Arrays.asList(mm[ans2-1]));
			r1.retainAll(r2);
			
			System.out.printf("Case #%d: " , x+1);
			if(r1.isEmpty())
				System.out.println("Volunteer cheated!");
			else if(r1.size() > 1)
				System.out.println("Bad magician!");
			else
				System.out.println(r1.toArray()[0]);
		}
	}

}
