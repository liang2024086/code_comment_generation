package methodEmbedding.Magic_Trick.S.LYD31;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String[]Args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("A-small-attempt0 (3).in"));
		PrintWriter out = new PrintWriter(new File("things.out"));
		//Scanner sc = new Scanner(System.in);
		boolean[] things = new boolean[16];
		int t = sc.nextInt(),cc=0;
		while(t-->0){
			Arrays.fill(things, true);
			int i = sc.nextInt()-1;
			for(int  j = 0; j < 4;j++)
				for(int k = 0; k < 4; k++)
					if(j!=i)
						things[sc.nextInt()-1]=false;
					else sc.nextInt();
			i = sc.nextInt()-1;
			for(int  j = 0; j < 4;j++)
				for(int k = 0; k < 4; k++)
					if(j!=i)
						things[sc.nextInt()-1]=false;
					else sc.nextInt();	
			int count = 0;
			int index = 0;
			for(int k = 0; k <16;k++)
				if(things[k]){
					count++;
					index = k+1;
				}
			out.printf("Case #%d: ", ++cc);
			if(count==0)
				out.println("Volunteer cheated!");
			else if(count==1)
				out.println(index);
			else
				out.println("Bad magician!");
		}
		out.close();
	}
}

/*

3
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

*/
