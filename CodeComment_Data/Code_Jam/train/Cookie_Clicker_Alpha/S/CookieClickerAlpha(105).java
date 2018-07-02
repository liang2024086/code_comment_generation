package methodEmbedding.Cookie_Clicker_Alpha.S.LYD308;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClickerAlpha {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("C:/Nandan/eclipse/workspace/GoogleCodeJam-2014/src/CookieClickerAlpha/Small.in"));
			int T = sc.nextInt();
			for(int i=1; i<=T; i++){
				double C = sc.nextDouble();
				double F = sc.nextDouble();
				double X = sc.nextDouble();
				
				double cookiePerSecond = 0.0;
				double totalTime = 0.0;
				
				DecimalFormat df = new DecimalFormat("#0.0000000");
				if(C > X){
					System.out.println("Case #"+i+": "+df.format(X/2));
				}else{
					for(int j=1; j<=X; j++){
						if(j == 1){
							cookiePerSecond = 2.0;
						}else{
							cookiePerSecond = cookiePerSecond + F;
						}
						
						double buyTime = C/cookiePerSecond;
						double tempTime = buyTime+(X/(cookiePerSecond+F));
						double tempWinTime = X/cookiePerSecond;
						if(tempTime > tempWinTime){
							totalTime = totalTime+tempWinTime;
							break;
						}else{
							totalTime = totalTime+buyTime;
						}
					}
					
					
					
					
					System.out.println("Case #"+i+": "+ df.format(totalTime));
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
