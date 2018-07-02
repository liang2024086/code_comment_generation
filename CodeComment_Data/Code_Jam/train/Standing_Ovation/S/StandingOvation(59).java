package methodEmbedding.Standing_Ovation.S.LYD887;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//to print the input I use bash script... 
// run in terminal java class > output.txt

public class StandingOvation {

	public static void main(String [] args) throws FileNotFoundException {
		Scanner fsn = new Scanner(new File("/cs/home/as362/codejam/input.txt"));
		int tc = fsn.nextInt();
		//System.out.println(tc);
		for(int i = 1 ; i <= tc; i++) {
			int total  = fsn.nextInt();
			int sum = 0; int totpep = 0;
			String c = fsn.nextLine().trim();
			//System.out.println(c + "bummer" + " " + total);
			
			for(int k=0; k < c.length(); k++) {
				int np =(int) Character.getNumericValue(c.charAt(k));
				//System.out.println(np + " np " + sum);
				if(sum < k && np!= 0 )  {
					totpep += k-sum;
					sum += totpep;
				}
				sum += np;
				//System.out.println(sum + " " + np + " " + totpep );
//				//temp[i] = np;
				
			}
			System.out.println( "Case #" + i+ ": " + totpep);
		}

		
		
	}
	
}

