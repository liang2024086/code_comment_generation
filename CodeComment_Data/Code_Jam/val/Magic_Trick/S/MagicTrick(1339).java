package methodEmbedding.Magic_Trick.S.LYD1541;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(new File("magictrick.in"));
		PrintWriter out = new PrintWriter(new FileWriter("magictrick.out"));
		
		int n = scan.nextInt();
		
		for(int x = 1; x <= n; x++) {
			int q1 = scan.nextInt();
			scan.nextLine();
			HashSet<Integer> first = new HashSet<Integer>();
			for(int i = 0; i < 4; i++)
				if(i==q1-1) {
					for(int j = 0; j < 4; j++)
						first.add(scan.nextInt());
					scan.nextLine();
				}
				else
					scan.nextLine();
			
			int ans = 0;
			int q2 = scan.nextInt();
			scan.nextLine();
			for(int i = 0; i < 4; i++)
				if(i==q2-1) {
					for(int j = 0; j < 4; j++) {
						int num = scan.nextInt();
						if(first.contains(num))
								ans = (ans == 0) ? num : -1;
					}
					scan.nextLine();
				}
				else
					scan.nextLine();
			out.print("Case #"+x+": ");
			if(ans==0)
				out.println("Volunteer cheated!");
			else if (ans==-1)
				out.println("Bad magician!");
			else
				out.println(ans);
		}
		
		out.close();
					
	}

}
