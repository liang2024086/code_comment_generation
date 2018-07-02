package methodEmbedding.Cookie_Clicker_Alpha.S.LYD697;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;

/***/
public class CookieClickerAlpha {

	/***/
	public static void main(String[] args) {
		
		try{
			
			LineNumberReader reader=new LineNumberReader(new FileReader(new File(args[0]))); // Input File.
			PrintStream printer=new PrintStream(new File(args[1])); // Output File.
			
			NumberFormat nf=NumberFormat.getInstance(Locale.ENGLISH); 
			nf.setMinimumFractionDigits(7);
			nf.setMaximumFractionDigits(7);
			
			/** Small */			
			int nTestCases=Integer.valueOf(reader.readLine().trim()).intValue();
			for(int i=0;i!=nTestCases;i++){
				int caseId=i+1;
				
				String[] s=reader.readLine().split(" ", 3);
				Double[] d=new Double[3];
				for(int j=0;j!=3;j++) 
					d[j]=Double.valueOf(s[j]);
				
				Double cookies=(double)0;
				Double perSecond=(double)2;
				Double dTime=(double)0;
				while(cookies<d[2]){
					if(cookies<d[0]){ // waits for cookies ...
						
						Double targetCookies=Math.min(d[0], d[2]-cookies);
						Double waitTime=(targetCookies- cookies)/perSecond;
						dTime+=waitTime;
						cookies+=targetCookies;
						// System.err.println("Wait ... "+nf.format(waitTime)+", Cookies="+cookies+", X="+d[2]);
						
					}else{
						
						Double timeNoBuy=(d[2]-cookies)/perSecond;
						Double timeBuy=d[2]/(perSecond+d[1]);
						
						if(timeNoBuy<timeBuy){ // only wait for cookies ... 
							
							dTime+=timeNoBuy;
							cookies+=(timeNoBuy*perSecond);
							// System.err.println("Wait ... "+nf.format(timeNoBuy)+", Cookies="+cookies+", X="+d[2]);
							
						}else{ // buy farm
							
							cookies-=d[0];
							perSecond+=d[1];
							// System.err.println("Buy ... Cookies="+cookies+", F="+perSecond);													
						}
												
					}
				}
				
				System.err.println("Case #"+caseId+": "+nf.format(dTime));
				printer.println("Case #"+caseId+": "+nf.format(dTime));
			}
			
			reader.close();
			printer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
							
	}
}
