package methodEmbedding.Standing_Ovation.S.LYD577;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class kjfndkjf {

	public static void main(String args[]) throws Exception {
		//Scanner in = new Scanner(System.in);
	
		
		Scanner in = new Scanner(new File("input.in"));
		
		PrintWriter writer = new PrintWriter(new FileOutputStream("B.out"));
		int T = in.nextInt();
		//System.out.println(T);
		in.nextLine();
		
		for (int i = 0; i < T; i++) {
			int max= in.nextInt();
			int[] number= new int[max];
			String charnumber=in.nextLine().trim(); 
				int totalp=0;
				int ans=0;
			for (int j = 0; j <= max; j++) {
				int x= Character.getNumericValue(charnumber.charAt(j));
				
				totalp=totalp+x;
				
				if (totalp>j) {	
				}else {
					ans++;
totalp++;
				}
				//System.out.println(ans+"    "+totalp);
			}
			System.out.println("Case #"+(i+1)+": "+ans);
			writer.println("Case #"+(i+1)+": "+ans);
			
		}
		//in.close();
		writer.close();
	}
}
