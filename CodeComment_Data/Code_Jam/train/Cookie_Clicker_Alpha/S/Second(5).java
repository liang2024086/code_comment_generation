package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1577;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) 
	{
		
		try 
		{
			
			BufferedReader bf = new BufferedReader(new FileReader("C:\\input.in")) ;
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\output.txt",true)) ;
			
			int testCase = Integer.parseInt(bf.readLine()) ;
			for(int i=0;i<testCase;i++)
			{
				String str = bf.readLine() ;
				Scanner s = new Scanner(str) ;
				double C = s.nextDouble() ;
				double F = s.nextDouble() ;
				double X = s.nextDouble() ;
				boolean runTill = false ;
				
				double divide = 2 ;
				double time = X/divide ;
				double preTime = 0 ; 
				double totalTime = time+preTime ;
				
				while(!runTill)
				{
					time = X/divide ;
					if(totalTime>=(time+preTime))
					{
						totalTime = time+preTime ;
						preTime += C/divide ;
						divide += F ;
					}
					else
					{
						runTill = true ;
					}
					
					
					
				}
				totalTime += 0.0000001 ;
				writer.write("Case #"+(i+1)+": "+totalTime+"\n");
			}
			
			writer.close();bf.close();
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
