package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1122;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;



public class CookieClicker {

	public static void main(String[] args) {
	
		BufferedReader reader;
		BufferedWriter writer;
		try {
			reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
			writer= new BufferedWriter(new FileWriter("output.txt"));
			String line = null;
			line = reader.readLine();
			int tot_cases,i,j,k;
			
			tot_cases=Integer.parseInt(line);
			int first_option, second_option;
			//System.out.println("total cases"+ tot_cases);
			for(i=1;i<=tot_cases;i++)
			{
				
				//System.out.println("Case : "+ i + "\n");
							
				String[] input=reader.readLine().split(" ");
				double cookie_rate=2.0;
				
					double c= Double.parseDouble(input[0]);
					double f= Double.parseDouble(input[1]);
					double x= Double.parseDouble(input[2]);
			
					double total_sec=0.0 , farm_time=0.0 , t1=0.0,t2=0.0,p1=0.0,p2=0.0,x2=0.0,x1=0.0,c1=0.0;
					
				
							double cookies=0;
							int u=0;
							
							if(x <= c)
							{
								x1=x/cookie_rate;
							}
							else
							{
							
								while( true)
								{
									t1=total_sec;
									c1=cookie_rate;
									p1=x/c1;
									x1=t1+p1;
									
									farm_time= c/cookie_rate;
									cookie_rate= cookie_rate + f;
									total_sec=total_sec + farm_time;
									p2=x/cookie_rate;
									x2=total_sec+p2;
									
									
								
									cookies = farm_time * cookie_rate;
									u++;
									
								
									if ( x1 < x2)
									{ break; }
									
									//System.out.println("\n Farm "+ u+ " is created...");
									//System.out.println( " Prev Eff " + x1 + "  After farm " + x2);
							
								}
				
								
							   
							}
					
							//System.out.println("\n out of loop \n answer is " +  ( x));	
							
							DecimalFormat numberFormat  = new DecimalFormat("#.0000000");
							String result=numberFormat.format(x1);
							String eol = System.getProperty("line.separator"); 
							writer.append("Case #"+ i+": "+ result +  eol);
					
					System.out.println("Case #"+ i+": "+ result +  eol);
				
			}
			
			writer.close();
			reader.close();
			

			
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	
}

		
		
	

	}
	
	
	

}
