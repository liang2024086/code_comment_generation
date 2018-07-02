package methodEmbedding.Cookie_Clicker_Alpha.S.LYD413;

import java.io.*;
import java.text.*;


public class CookieClickerAlpha {

	public static void main(String[] args) {

      try {
			
			FileReader Reader = new FileReader("input.txt");
			BufferedReader Input= new BufferedReader(Reader);
			PrintWriter PW = new PrintWriter ("output.txt","UTF-8");
			DecimalFormat OutputFormat = new DecimalFormat("#0.0000000");
			int T,i1;
			double R,C,F,X,TotalTime;
			String Str1;
			String [] Str2=null;
			
			T=Integer.parseInt(Input.readLine());
			
			for(i1=1; i1<=T; i1++) {
				
				R=2;
				C=0;
				F=0;
				X=0;
				TotalTime=0;
				
				Str1= Input.readLine();	
				Str1=Str1.trim();						
				Str2=Str1.split("\\s+"); 
					    
				C=Double.parseDouble(Str2[0]);
				F=Double.parseDouble(Str2[1]);
				X=Double.parseDouble(Str2[2]);
				
				while((X/R)>((C/R)+(X/(R+F)))) {
					
					TotalTime=TotalTime+(C/R);
					R=R+F;	
				}
					
				TotalTime=TotalTime+(X/R);
				
				PW.println("Case #"+i1+": " + OutputFormat.format(TotalTime));
			}
			
			Input.close();
			PW.close();
			
		}
			
		catch (IOException e) {

			e.printStackTrace();
		}
			  
     }
		
}

