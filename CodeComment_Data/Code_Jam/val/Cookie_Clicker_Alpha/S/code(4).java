package methodEmbedding.Cookie_Clicker_Alpha.S.LYD302;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

public class code{
	public static void main(String args[]) throws IOException{
		String input;
		int ncase=0;
		double C=0.0, F=0.0, X=0.0 , Fi=0.0;
                double current = 0.0, next = 0.0, time; 
		StringTokenizer token ;
		FileReader file = new FileReader("B-small-attempt0.in");
		BufferedReader inFile = new BufferedReader(file);

                FileWriter wr = new FileWriter("output");
		BufferedWriter bw = new BufferedWriter(wr);
		PrintWriter out = new PrintWriter(bw);

		DecimalFormat df = new DecimalFormat("#.#######");

		input = inFile.readLine();
		ncase = Integer.parseInt(input);
		for(int i=1; i<=ncase ; i++){
			Fi = 2.0;
                        time = 0.0;
			input = inFile.readLine();
			token = new StringTokenizer(input);
			C = Double.parseDouble(token.nextToken());
			F = Double.parseDouble(token.nextToken());
			X = Double.parseDouble(token.nextToken());
			if( X<=C ){
				out.println("Case #" + i + ": " + df.format(X/Fi));				
			} else {
                             while(true){
			   	current = X/Fi;  
				next = C/Fi + X/(Fi+F);
                                if(next>=current) {
			          time = time + X/Fi;
                                     break;
				}
				else {
					time = time + C/Fi;
					Fi = Fi + F;
				}
                               
			    }
                            out.println("Case #" + i + ": " + df.format(time)); 
			}
		} 
              inFile.close(); out.close();
	}

}
