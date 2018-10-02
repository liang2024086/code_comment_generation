package methodEmbedding.Cookie_Clicker_Alpha.S.LYD143;



import java.util.*;
import java.lang.*;
import java.io.*;


class chck
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double c,x,f,reck=2.0,vb,newx,newer,sham=0;
        int test,i=0;
        Scanner xx=new Scanner(System.in);
        test=xx.nextInt();
        while(test>0)
                {	test--;
                ++i;
                reck=2.0;
                sham=0;
                    c=xx.nextDouble();
                    f = xx.nextDouble();
                    x= xx.nextDouble();

                    while(true)
                    {
                    	vb=x/reck;


                    	newer=reck+f;

                    	newx=(c/reck)+(x/newer);

                    	sham+=(c/reck);

                    	if(vb<newx){
                    		sham-=(c/reck);
                    		sham+=vb;
                    	break;}
                    	else
                    	{
                    		reck+=f;
                    	}

                    }
                    System.out.printf("Case #%d: %.7f\n",i,sham);
                }
	}
}
