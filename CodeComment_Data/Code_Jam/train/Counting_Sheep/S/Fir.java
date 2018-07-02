package methodEmbedding.Counting_Sheep.S.LYD1300;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Fir {
	public static void main(String args[])throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new  BufferedReader(in);
		
		int n=Integer.parseInt(br.readLine());
		
		Vector v=new Vector(1000,500);
		Vector vec = new Vector(12);
		Vector <Integer> inp=new Vector<Integer>(n);
		for(int q=0;q<10;q++)
		{
			vec.add(new Integer(q));
		}
		for(int i=0;i<n;i++)
		{
			
		 int  h=Integer.parseInt(br.readLine());
		 inp.add(h);
		}
		
		for(int s=0;s<inp.size();s++)
		{
		 Integer b = inp.elementAt(s);
		 if(b==0)
		 {
			 System.out.println("Case #"+(s+1)+": INSOMNIA");
		   }
		 else 
		  {
		   for(int j=1;j<=1000000;j++)
		   {
			 int d=b*j;
			 while(d>0)
			 {
			 int c;
			 c=d%10;
			 v.add(new Integer(c));
			 d=d/10;
			 
			 }
			 
				 if( v.containsAll(vec))
				 {
				  System.out.println("Case #"+(s+1)+": "+b*j);
				  v.clear();
				 break;
				 }
		    }		 
		  }	 
		 }
		
		
		}
		
		
	}


