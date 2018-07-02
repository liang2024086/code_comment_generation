package methodEmbedding.Cookie_Clicker_Alpha.S.LYD726;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Helloo {

	public static void main(String[] args) throws Exception {
	
	    int mm=0,j;
	  double c=0,f=0,x=0,t;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		t=Integer.parseInt(br.readLine());
		

		double p[]=new double[100];
		for(j=1;j<=t;j++)
		{
			String str=br.readLine();
			//System.out.print("\n#"+str+"#");	
			
			String[] str1Array =  str.split(" ");
	
			c=Double.parseDouble(str1Array[0]);
			f=Double.parseDouble(str1Array[1]);
			x=Double.parseDouble(str1Array[2]);

		 for(int  i=0;i<10000000;i++)
		     { 
		    	 double a=0,s=0;

		    	 for(int n=0;n<=i;n++)
		    		 a=a+(c/(2+n*f));
		    
		    //	System.out.print("\na="+a);	
		    	 for(int m=0;m<i;m++)
		    		 s=s+(c/(2+m*f));
		   
		    		 
		   
		    //	 System.out.print("\ns="+s);	
		    	double z=a+(x/(2+(i+1)*f));
		    	double k=s+(x/(2+i*f))     ;
double rrrr=k-z;
		    	 System.out.print("\nz="+z);
		    	 System.out.print("\t\tk="+k+ "\t"+rrrr);	
		    	if((c-1)<0.1 && ((i==999999) || rrrr<0.000001))
		    	{	p[mm++]=z; break;}
		    	 else if(z>=k || (k-z)<0.000001)
		    	 {
		    		 p[mm++]=k; 	//System.out.print("\t\tR="+k);	
		    		 break;
		    	  }
		     }   	 	 
		 }
		 
/*double	speed=2,a=0,b=0,d=0,e=0;		
	for(;;)
		{
		a=x/speed;
		
		b=b+c/speed;
		
		if(a<=b
			
		d=b+need/speed;
		
		}
		
		
*/
		 for(j=0;j<t;j++)
		 { 
		
				
		 System.out.print("Case #"+(j+1)+": ");
		 System.out.printf("%.7f\n", p[j]);

		 }
	}

}
