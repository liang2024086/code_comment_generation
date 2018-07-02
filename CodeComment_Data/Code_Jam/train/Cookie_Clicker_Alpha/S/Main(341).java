package methodEmbedding.Cookie_Clicker_Alpha.S.LYD448;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
 

 
 
		
		public static void main (String[] args)  throws Exception
		{
		 
			FileWriter writer=new FileWriter("d:/CCAOutput1.txt");
			Scanner scanner=new Scanner(new FileInputStream("d:/B-small-attempt1.in"));
		    
			double count_case_d = scanner.nextDouble();
			
			long count_case = (long)count_case_d;
			
			//System.out.println("case count "+count_case);
			 
			
			for (long i =0;i<count_case;i++)
			{
				double c =  scanner.nextDouble();
				double f =  scanner.nextDouble();
				double x =  scanner.nextDouble();
				double result = 0;

				if (c>=x)
				{
					String result_s = String.format("%.7f", x/2); 
					writer.write("Case #"+(i+1)+": "+result_s+"\n");
					continue;
				}
				long n = 1;
				double t = x/2;
				double t_1 = 0;
				double x_1 = x/2;
				while (true)
				{
					t_1 = t;
					t += c/(2+f*(n-1))+x/(2+f*n)-x_1;
					x_1 = x/(2+f*n);
					if (t_1 <= t)
					{
						String result_s = String.format("%.7f", t_1); 
						writer.write("Case #"+(i+1)+": "+result_s+"\n");
						break;
					}
					n++;
				}
				
				
				
				 
			 
				 
			    
				
			}
			
			writer.close();
		}
		

 

}
