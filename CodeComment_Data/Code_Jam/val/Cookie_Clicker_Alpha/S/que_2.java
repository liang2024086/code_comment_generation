package methodEmbedding.Cookie_Clicker_Alpha.S.LYD731;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class que_2
{
	public static void main(String args[]) throws Exception
	{
			int nt,k;
			double c,f,x;
			double T=0.0,t1,t2,t3,tf,cps=2;
			DecimalFormat rou = new DecimalFormat("#.0000000");
            Scanner s =new Scanner(new FileReader("B-small-attempt0.in"));
			PrintWriter pw=new PrintWriter("out.in");
			
			nt=s.nextInt();

			for(k=0;k<nt;k++)
				{	
			        c=s.nextDouble();
					f=s.nextDouble();
					x=s.nextDouble();
					
					if(c>x)
					{
						T=x/cps;
					}
					else
					{
						while(true)
						{
							t1=c/cps;
							
							t2=(x-c)/cps;
							
							t3=x/(cps+f);
							
							if(t2>t3)
							{
								T=T+t1;
								
								cps=cps+f;
							}
								
							else
								break;
						}
						
						tf=x/cps;
						
						T=T+tf;
						
					}
						
					
				     pw.println("Case #"+(k+1)+": "+rou.format(T));
					 
					 pw.flush();
					 
					 T=0.0;
					 cps=2;
					 
					 
			    }
				
				pw.close();
				s.close();
				
}

}


		
			
					
						
					
					
					
