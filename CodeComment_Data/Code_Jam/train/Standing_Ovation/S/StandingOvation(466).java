package methodEmbedding.Standing_Ovation.S.LYD1833;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		PrintStream ps = new PrintStream(new File("output.txt"));
		
		int T = scan.nextInt();
		
		for(int i=1; i<=T; i++){
						
			int result = 0;
			int sMax = scan.nextInt();
			
			int bound = sMax+1;
			
			char[] shyness = new char[bound];
			shyness = scan.next().toCharArray();
			
			int[] sX = new int[bound];
			for(int j=0; j<bound; j++)
				sX[j] = Integer.valueOf(shyness[j]+"");
			
			int current = 0;
			int missing = 0;
			for(int j=0; j<bound; j++){
				current += sX[j];
				for(int k=j+1; k<bound; k++){
					if(current+missing<k && sX[k]>0){
						missing += (k-(current+missing));
						j = k-1;
						break;
					}
					current += sX[k];
				}
			}
			
			result = missing;
			
			ps.println("Case #" + i + ": " + result);
			
		}
		
		scan.close();
		
	}
	
}
