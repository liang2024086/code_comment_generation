package methodEmbedding.Standing_Ovation.S.LYD1143;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Standing_Ovation {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:\\vikas_eclipse\\ovation_out" + ".out")));
		Scanner in = new Scanner(new File("D:\\vikas_eclipse\\ovation_in" + ".in"));
		int T = in.nextInt();
		for(int t=1; t<=T; t++) {
			
			int output=0;
			int max_shy = in.nextInt();
			String msg=in.nextLine();
			msg=msg.trim();
			
			int sum=0;
			int counter=0;
			
			
			while(counter<max_shy) {
				//System.out.println(" msg.charAt(counter)  "+(msg.charAt(counter)));
				
				sum=sum+ (msg.charAt(counter) -48);
			
			if((sum<counter+1) && (msg.charAt(counter+1)>'0')){
				output=output+(counter+1-sum);
			    sum=sum+(counter+1-sum);
			}
			++counter;
		  }
			System.out.printf("Case #%d: %d\n", t, output);
			out.println("Case #"+t+": "+output);
		}
		out.close();
	}
}
