package methodEmbedding.Standing_Ovation.S.LYD1987;

import java.io.File;
import java.util.Scanner;

public class A {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(new File("A.in"));
		int numcases = in.nextInt();
		in.nextLine();
		int casecount=1;
		while (numcases-- > 0) {
			String[] vals = in.nextLine().split(" ");
			int maxshy = Integer.parseInt(vals[0]);
			int numcount=0;
			int friends=0;
			for(int x=0;x<vals[1].length();x++)
			{
				while(x>numcount)
					{friends++; numcount++;}
				int addS = Integer.parseInt(vals[1].substring(x,x+1));
				numcount+=addS;	
			}
			
			
			System.out.println("Case #"+casecount+": "+friends);
			casecount++;
		}
	}
}
