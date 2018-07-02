package methodEmbedding.Cookie_Clicker_Alpha.S.LYD997;


	import java.util.*;
	import java.io.*;
	
	public class CookieClickerAlpha{
	
		public static void main(String args[])throws IOException{
		
			Scanner kbd = new Scanner(new FileInputStream("B-small-attempt0.in"));
			
			FileWriter f = new FileWriter(new File("CookieClickerAlphaOutput.txt"));
			
			int T = kbd.nextInt();
			
			for(int t=1;t<=T;t++){
			
				double D = 2.0;
				double C = kbd.nextFloat();
				double F = kbd.nextFloat();
				double X = kbd.nextFloat();
				
				double total_time_taken = 0.0;
				
				while(true){
					if(X/D>(C/D+X/(D+F))){
						total_time_taken += C/D;
						D = D+F;
					}
					else
						break;
				}
				
				total_time_taken += X/D;
				
				f.write("Case #"+t+": "+total_time_taken+"\n");
			}
			
			f.close();
		}
	}
