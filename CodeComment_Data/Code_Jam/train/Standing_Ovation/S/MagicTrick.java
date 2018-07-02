package methodEmbedding.Standing_Ovation.S.LYD1884;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("test.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int T = in.nextInt();
		//System.out.println("external loop is :"+T);
		
		for (int i=0 ; i<T ; i++){
			
			int n = in.nextInt();
			//System.out.println("next line 1 : "+n);
			
			String s = in.next();
			//System.out.println("next line 2 : "+s);
			
			int nps = 0 ;
			
			int fn = 0;
			
			for (int j=0 ; j< (n+1) ; j++){

				int posint = Integer.parseInt(s.charAt(j)+"");
				//System.out.println("point data : "+posint);
				
				if(j == 0){
					nps = posint;
				}else{
					
					if(nps >= j){
						nps = nps + posint;
					}else if((nps < j) && (posint != 0)){
						
						fn = fn + (j - nps);
						nps = nps + (j - nps) + posint;
						
					}
				}
			}
			System.out.printf("Case #%d: %d",i+1,fn);
			System.out.println();
		}
	}
}
