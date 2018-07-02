package methodEmbedding.Cookie_Clicker_Alpha.S.LYD275;

import java.io.*;
import java.util.*;
import java.text.*;

public class Cookies2{
public static void main(String args[]){
	try {
		PrintStream output = new PrintStream( "out.txt" );
		Scanner input=new Scanner(new File("in.txt"));
		String line = input.nextLine();
		//int lines=0;
		
	
	//FileWriter outFile = new FileWriter("output.out");
        //PrintWriter out = new PrintWriter(outFile);
		double farm=0.0, currentRate=2.0, extraRate=0.0, target=0.0, seconds=0.0, cookies=0.0;// n=0, t=0;
		//boolean one=false, two=false; //, start1=0, start2, k=0;
		String[] item;//, result;// = new String[1000];
		boolean success=false;
		//System.out.print("0");
		int cases= Integer.parseInt(line);
		for (int c=1; c<=cases; c++){
			
			line = input.nextLine();
			item = line.split(" ");
			farm = Double.parseDouble(item[0]);
			extraRate = Double.parseDouble(item[1]);
			target = Double.parseDouble(item[2]);
			success = false;
			seconds = 0.0;
			//cookies = 0.0;
			currentRate = (double)2.0;
			double range=target, secondsNoFarm, secondsFarm, steps;
			while (!success)
			{
				
				if (target<farm)
				{
					success = true;
					seconds+=target/currentRate;
				}
				else
				if(((farm/currentRate)+(target/(currentRate+extraRate)))<target/currentRate)
				{
					seconds+=farm/currentRate;
					System.out.println(seconds);
					currentRate+=extraRate;
				
				}
				else
				{
					success = true;
					seconds+=target/currentRate;
				}
				
			}
			
			DecimalFormat df1 = new DecimalFormat("0.0000000");
			DecimalFormat df2 = new DecimalFormat("00.0000000");
			DecimalFormat df3 = new DecimalFormat("000.0000000");
			DecimalFormat df4 = new DecimalFormat("0000.0000000");
			String Sseconds = "";
			if (seconds<10)
				Sseconds = df1.format(seconds);
			else if (seconds<100)
				Sseconds = df2.format(seconds);
			else if (seconds<1000)
				Sseconds = df3.format(seconds);
			else 
				Sseconds = df4.format(seconds);
			output.print( "Case #" + c + ":");
			output.print(" " + Sseconds);
			output.println();
			//}
		}//for        	
		output.close();
			
	}//try
      
	catch (FileNotFoundException e){
	
		// If another exception is generated, print a stack trace
			//e.getMessage();
         	 e.printStackTrace();
      
	}//catch
}//main
}//class
