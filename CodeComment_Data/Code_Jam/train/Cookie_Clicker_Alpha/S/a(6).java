package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1559;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double f,c,x,r=2.0,pt,nt,nwr,tt=0;
        int t,i=0;
        Scanner w=new Scanner(System.in);
        t=w.nextInt();
        while(t>0)
                {	t--;
                ++i;
                r=2.0;
                tt=0;
                    c=w.nextDouble();//cost of farm	
                    f = w.nextDouble();//increase in rate
                    x= w.nextDouble();//total money needed
            	// System.out.printf("%.7f",c);
                    while(true)
                    {
                    	pt=x/r;
                    	
                    	// System.out.println("present time taken"+pt);
                    	nwr=r+f;
                    	//System.out.println("new rate"+nwr);
                    	nt=(c/r)+(x/nwr);
                    	 //System.out.println("new time taken"+nt);
                    	tt+=(c/r);
                    	// System.out.println(tt);
                    	if(nt>pt){
                    		tt-=(c/r);
                    		tt+=pt;
                    	break;}
                    	else
                    	{
                    		r+=f;
                    	}
                    	 
                    }
                    System.out.printf("Case #%d: %.7f\n",i,tt);
                }
	}
}
