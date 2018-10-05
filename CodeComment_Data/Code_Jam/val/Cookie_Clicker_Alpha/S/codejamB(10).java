package methodEmbedding.Cookie_Clicker_Alpha.S.LYD770;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class codejamB {

	public static void main(String[] args) throws IOException {
		Scanner x = new Scanner(new File("A.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("resA.txt"));
		int tc=x.nextInt();
		int counter=1;
		while(tc--!=0){
			double ccc=x.nextDouble();
			double f=x.nextDouble();
			double X=x.nextDouble();			
			double firstans=(X/2);			
			double prev=Double.MAX_VALUE;
			double gain=2;
			double temp=0;
			double prevtime=0.0;
			double time=0;
			while(true){				
				time=ccc/gain;
			temp=time+((X/(gain+f)))+prevtime;					
			gain+=f;				
			prevtime+=time;
						if(temp<prev){
				prev=temp;
			}
			else if(firstans<prev){
				prev=firstans;
			}			
			
			else{
				break;
			}	
											}
					
			out.printf("Case #"+counter+": "+"%.7f",prev);
			out.println();
					
		counter++;	
		}
		
		out.close();
		
		
	}

}
