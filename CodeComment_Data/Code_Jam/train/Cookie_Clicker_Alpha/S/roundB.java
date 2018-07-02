package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1603;

import java.util.*;
import java.io.*;

public class roundB {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc;
		
		sc = new Scanner(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		double C,F,X,time=0.0,rate=2.0,t4f,total=0;
	
		int caseCnt = sc.nextInt();
		int factory=0;
		
		for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
			pw.print("Case #" + (caseNum + 1) + ": ");
			rate=2;
			time=0.0;
			C= sc.nextDouble();
			F= sc.nextDouble();
			X= sc.nextDouble();
			t4f= C/rate;
			
			
			
			
			while(time+t4f+(X/(rate+F))<((X/rate)+time))
			{
				
				time=time+t4f;
				rate=rate+F;
				t4f= C/rate;
				
			}
				
			
			time=time+X/rate;
			
			pw.println(time);
			
			
		}					
		   
			pw.flush();
			pw.close();
			sc.close();
			
		
	}

}
