package methodEmbedding.Cookie_Clicker_Alpha.S.LYD725;

import java.util.*;
public class cook
{
    public static void main(String[] argv)
    {
	Scanner in = new Scanner(System.in);
	int t=in.nextInt();
	String[] out= new String[t];
	double c,f,x;
	int i,j;
	j=0;
	for(i=0;i<t;i++)
	    {
	c=in.nextDouble();
	f=in.nextDouble();
	x=in.nextDouble();
	double crate=2;
	double time=0;
	while(c/crate+x/(crate+f)< x/crate)
	    {
		time=time+c/crate;
		crate=crate+f;
	    }
	time=time+x/crate;
	j=i+1;
	out[i]="Case"+" "+"#"+j+":"+" "+time;
	//	System.out.println(time);
	    }
	for(i=0;i<t;i++)
	    {
		System.out.println(out[i]);
	    }
    }
}
