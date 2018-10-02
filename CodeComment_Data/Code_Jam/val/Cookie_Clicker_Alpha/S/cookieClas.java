package methodEmbedding.Cookie_Clicker_Alpha.S.LYD523;

import java.util.Scanner;
import java.io.*;

public class cookieClas {
	public static void main(String[] args) throws IOException {
		FileInputStream input =null;
		PrintWriter output =null;

		try {
		
			input=new FileInputStream ("/Users/dhruvramani/Documents/GoogleCS/codejam-commandline-1.2-beta1/source/B-small-attempt2.in");
			output=new PrintWriter (new FileWriter("/Users/dhruvramani/Documents/GoogleCS/codejam-commandline-1.2-beta1/source/B-small.out"));

			Scanner scan=new Scanner (input);
			
			String test=scan.nextLine();
		
			double t=Double.parseDouble(test);
		
			double C,F,X;
	     	
			for (int i=0;i<t;i++)
			{
				String testsq=scan.nextLine();
				String[] splitString=testsq.split(" ");
			 
				C=Double.parseDouble(splitString[0]);
				F=Double.parseDouble(splitString[1]);
				X=Double.parseDouble(splitString[2]);
				
					int n;
					double RtoInt=(X/C)-(2/F)+1;
					n=(int)RtoInt;
					if (n<=0)
					{
						n=1;
					}
					double SumOfTime=0,ToDevideBy=2;
			 
					for (int p=0;p<n-1;p++)
					{
						SumOfTime=SumOfTime+(C/ToDevideBy);
						ToDevideBy=ToDevideBy+F;
					}
					SumOfTime=SumOfTime+(X/ToDevideBy);
			 
					output.print("Case#");
					output.print(i+1);
					output.print(": ");
					output.print(String.valueOf(SumOfTime));
					output.println("");
				    //output.flush();
					
					
			}
			output.close();

		} catch (FileNotFoundException e) {
            e.printStackTrace();
            
        }
			
	}

}
