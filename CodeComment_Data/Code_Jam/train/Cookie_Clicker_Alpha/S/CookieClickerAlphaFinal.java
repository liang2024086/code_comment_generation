package methodEmbedding.Cookie_Clicker_Alpha.S.LYD115;

import java.util.Scanner;
public class CookieClickerAlphaFinal {
	/**
	 * Teerapun Jaikla 
	 * XxYeSiSaexX@Gmail.com
	 */
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		int t = kb .nextInt();
		for(int i=0;i< t ;i+=1){
			double c = kb.nextDouble();
			double f = kb.nextDouble();
			double x = kb.nextDouble();
			double cookieRate = 2.0;
			double time = 0.0000000;
			double temp = (double)Double.MAX_VALUE;				
			if(x/c<1){				
				System.out.printf("Case #%d: %.7f\n",(i+1),x/cookieRate);				
			}else{
				temp = (double)Double.MAX_VALUE;	
				int n = (int)(x/c);
				for(int k=1;;k+=1){		
					cookieRate = 2.0;
					time = 0.0000000;
					for(int j=1;j<=k-1;j+=1){
						time += c/cookieRate;
						cookieRate += f;
					}
					time += x/cookieRate;
					if(temp>time)
						temp = time;
					else
						break;
										
				}										
				System.out.printf("Case #%d: %.7f\n",(i+1),temp);		
			}
		}
	}

}
