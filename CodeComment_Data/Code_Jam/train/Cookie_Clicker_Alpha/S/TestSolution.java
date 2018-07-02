package methodEmbedding.Cookie_Clicker_Alpha.S.LYD998;

import java.io.BufferedReader;
import java.io.*;
import java.*;


class TestSolution{

public static void main(String args[]) {
	
	try{	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String inputstring = br.readLine();
			int T=Integer.parseInt(inputstring);
			String[] line=new String[3];
			double[] result=new double[T];

			double C,F,X;
			double totaltime=0.0;
			for(int i=0;i<T;i++)
			{
				inputstring = br.readLine();
				line=inputstring.split(" ");
				C=Double.parseDouble(line[0]);
				F=Double.parseDouble(line[1]);
				X=Double.parseDouble(line[2]);
//				System.out.println(" C, F, X is "+C+" , "+F+" , "+X);
				double cookiecount=0.0;
				double rate=2.0;
				double time=0.0;
				double timeperiod=0.0;
				double timereqnow=0.0;
				double timereqprev=0.0;
				double timebeforebuy=0.0;
				int buyflag=0;
				double finalanswer;
				double timecount=0.0;
				double prevrate=0.0;
				double resulttime=0.0;
				while(cookiecount<X)
				{
					cookiecount=cookiecount+rate;
					time++;
					prevrate=rate;					
					buyflag=0;
					//resulttime+=time;
					if(C>X)
					{
							resulttime=X/prevrate;
					}
					if(cookiecount>=C)
					{
						rate=rate+F;
						if(((X/rate)+(C/prevrate)) < (X/prevrate))
						{
							buyflag=1;
							cookiecount=0;
						//	System.out.println("C/prevrate is "+C/prevrate);
							resulttime=resulttime + (C/prevrate);
							time=0;
						}
						else
						{
							resulttime=resulttime + (X/prevrate);
							//System.out.println("resulttime is "+resulttime);
							finalanswer=resulttime;
							break;
						}

				}
				
			}
			result[i]=resulttime;
		}
		//print result
		for(int r=1;r<=T;r++)
		{
			String s=String.format("Case #%d: %.7f",r,result[r-1]);
			//System.out.println("Case #"+r+": "+result[r-1]);
			System.out.println(s);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	
	}
}
				
					
			
