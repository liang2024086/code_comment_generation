package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1158;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class CookieClickerAlphaS {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		try {
			
////////////////////////////Open Input File /////////////////////////////////////////////////////////////

				FileReader inputFile = new FileReader("B-small-attempt0.in");
				Scanner sc = new Scanner(inputFile);
				sc.useLocale(Locale.ENGLISH);


////////////////////////////Open Output File /////////////////////////////////////////////////////////////			

				PrintWriter outputFile = new PrintWriter("outputFileBS.txt");

///////////////////////////// Read Number of Cases /////////////////////////////////////////////////////////////

				int numberOfCases = sc.nextInt();


/////////////////////////////   Iterate on Cases     ////////////////////////////////////////////////////////////			

					for(int i=1;i<=numberOfCases;i++)
					{

					Double c=0.0;
					Double f=0.0;
					Double x=0.0;
					Double r=2.0;
					Double t=0.0;
					
					
					c=sc.nextDouble();
					f=sc.nextDouble();
					x=sc.nextDouble();
					
					while (((c/r)+(x/(r+f))) < (x/r) )
					{
						
						t=t+(c/(r));
						r=r+f;
						
					}
					
					t=t+(x/r);
	



	
	
/////////////////////// Add Result to OutPut File
				
						outputFile.println("Case #"+i+": "+t);

					} ///// Iterating on Cases close 

///////////////////////////////////// Close OutPut File  //////////////////////////////////////////////// 			

			outputFile.close();


		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
		
	} /// Main Close

}
