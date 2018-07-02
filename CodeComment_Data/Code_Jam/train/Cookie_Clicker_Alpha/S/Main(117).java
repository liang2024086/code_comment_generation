package methodEmbedding.Cookie_Clicker_Alpha.S.LYD898;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ParseException, IOException  {
		// TODO Auto-generated method stub
	
		
		BufferedReader br = new BufferedReader(new FileReader(new File("B-small-attempt0.in")));
		
		String firstLine = br.readLine();
		if(firstLine==null)
			return;
		
		int numberOfTestCases = Integer.valueOf(firstLine);
		String[] cases = new String[numberOfTestCases];

		int counter =0;
		for(String line; (line=br.readLine())!=null;)
		{
			cases[counter] = line;
			counter ++;
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("B-small-attempt0.out")));

			

	
	
		
		for(int i =0;i<counter;i++)
		{
			String[] temp  = cases[i].split(" ");
			
			double c= Double.valueOf(temp[0]);//30.0, f= 1.0, x=  2.0;
			double f= Double.valueOf(temp[1]);
			double x= Double.valueOf(temp[2]);
			
			double sum1 =0.0 ,sum1a = 0.0;
			double sum2 =0.0 ;
			
			// sum1 will contain proper contruction sum
			// sum1a will contain buying stuff
			
			double rate = 2.0 ;
			double finalSum = 0.0;
			
			sum1 = x/rate;
			sum1a = c/rate;
			while(true)
			{
				//change sum1
				//calculate sum2
				rate = rate+f;
				sum2 = sum1a + (x/rate);
				
				if(sum2>sum1) //alert, pick sum1
				{
					finalSum = sum1;
					break;
				}
				sum1a= sum1a+ c/rate;
				sum1 = sum2;
			}
			
		
			DecimalFormat df=new DecimalFormat("0.0000000");
			
			String formate = df.format(finalSum); 
			double finalValue;
				if( (df.parse(formate)) instanceof Double)
				{
					finalValue = (Double)df.parse(formate);
				}
				else			
				{
					
				finalValue = Double.valueOf(finalSum);
				
				}
			
			
			//System.out.println(finalValue);
			bw.write("Case #"+(i+1)+": "+String.valueOf(finalValue)+"\n");
			
			
		}
		
		
	
		bw.close();
		
		
	}

}
