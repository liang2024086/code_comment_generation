package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1201;



import java.util.*;
import java.lang.*;
import java.io.*;


class Aone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double c,x,f,rate=2.0,p,nt,nwr,time=0;
        int test,i=0;
        Scanner wow=new Scanner(System.in);
        test=wow.nextInt();
        while(test>0)
                {	test--;
                ++i;
                rate=2.0;
                time=0;
                    c=wow.nextDouble();	
                    f = wow.nextDouble();
                    x= wow.nextDouble();
            	
                    while(true)
                    {
                    	p=x/rate;
                    	
                    	
                    	nwr=rate+f;
                    	
                    	nt=(c/rate)+(x/nwr);
                    	
                    	time+=(c/rate);
                    	
                    	if(p<nt){
                    		time-=(c/rate);
                    		time+=p;
                    	break;}
                    	else
                    	{
                    		rate+=f;
                    	}
                    	 
                    }
                    System.out.printf("Case #%d: %.7f\n",i,time);
                }
	}
}
