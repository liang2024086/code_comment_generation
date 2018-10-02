package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1353;

import java.util.*;
import java.lang.*;
import java.io.*;

class cookie
{
    public static void main(String args[])
    {
	try
	{
	    PrintWriter pw=new PrintWriter("out.txt"); 
	    //creating file reader instance and reading first line
	    BufferedReader br=new BufferedReader(new FileReader(args[0]));
	    String line=br.readLine();
	    int T=Integer.parseInt(line); //number of test cases T
	    //-------------------------

	    //processing each test case
	    for(int i=0;i<T;++i)
	    {
		String[] testcase=br.readLine().split(" ");
		double C, F, X;
		C = Double.parseDouble(testcase[0]);
		F = Double.parseDouble(testcase[1]);
		X = Double.parseDouble(testcase[2]);
		//		System.out.println("CFX=" + C +" " + F + " " + X);
		double Twin = 0.0;
		double rate = 2.0;
		while(true) {
		    double t_cashout = X/rate;
		    double t_buy_cashout = (C/rate) + (X/(rate+F));
		    //System.out.println("t_cashout="+t_cashout);
		    //System.out.println("t_buy_cashout="+t_buy_cashout);
		    if(t_cashout < t_buy_cashout) {
			Twin = Twin + t_cashout;
			//System.out.println("Breaking..."+Twin);
			break;
		    } else {
			Twin = Twin + (C/rate);
			rate = rate + F;
			//System.out.println("else.."+Twin+"..."+rate);			
		    }
		    //System.out.println();
		}

		pw.printf("Case #"+(i+1)+": %.7f\n",Twin);
		//System.out.println("case over*******");
		/*------------------------**/
	    }
	    br.close();
	    pw.close();
	}//end of try
	catch(Exception e)
	{
	    System.out.println("Exception caught: "+e);
	}	
   } 
}
