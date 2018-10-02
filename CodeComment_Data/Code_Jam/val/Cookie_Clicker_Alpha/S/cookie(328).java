package methodEmbedding.Cookie_Clicker_Alpha.S.LYD537;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

 
public class cookie {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("D:\\eclipse_pro\\Code_Jam\\src\\B-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		 
	 
		String line=null;
		String [] splits=null;
	 
		int num=Integer.valueOf(reader.readLine());
		System.out.println(num);
		for(int i=1;i<=num;i++)
		{
		
			
			Double C=null;
			Double F=null;
			Double X=null;
		
			Double current_rate=2.0;
			Double fact_t=0.0;
			Double time1=null;
			Double time2=null;
			Double total_t=0.0;
		     
			
		 
			line=reader.readLine();
			splits=line.split("\\s");
			 
				C=Double.valueOf(splits[0]);
				F=Double.valueOf(splits[1]);
				X=Double.valueOf(splits[2]);
			
		 while(true)
		 {			
			time1=X/current_rate;
			fact_t=C/current_rate;
			
			time2=fact_t+(X/(current_rate+F));
			
			if(time1<=time2)
			{
				total_t=(X/current_rate) + total_t;
			    break;
			}
			else
			{
				current_rate=F+current_rate;
				total_t=fact_t+total_t;
				
			}
		 }
		writer.println("Case #"+i+": "+total_t);
		System.out.println("Case #"+i+": "+total_t);
		}
		
		
		
		
				writer.close();
	
	}
}
