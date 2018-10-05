package methodEmbedding.Standing_Ovation.S.LYD1206;

import java.io.*;
import java.util.*;

//@Autor=Osmar Castillo

public class ProblemA {

	public static void main(String[] args) throws IOException{
		Scanner in= new Scanner(new File ("A-small.in"));
		PrintWriter out =new PrintWriter(new File("A-small.out"));
		int t,max,audienceAcc,friends;
		String audience;
		t=in.nextInt();
		for(int n=0;n<t;n++){
			max=in.nextInt();		
			friends=0;
			audience=in.next();
			audienceAcc=Integer.parseInt(audience.substring(0,1));
			for(int i=1;i<max+1;i++){				
				while(audienceAcc<i && Integer.parseInt(audience.substring(i,i+1))!=0){
						friends++;
						audienceAcc++;						
				}
				audienceAcc+=Integer.parseInt(audience.substring(i,i+1));
								
			}
			out.append("Case #"+(n+1)+": "+friends+"\n");			
		}
		out.flush();
		out.close();
	}

}
