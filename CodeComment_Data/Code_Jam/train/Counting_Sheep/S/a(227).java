package methodEmbedding.Counting_Sheep.S.LYD950;



import java.util.*;
import java.lang.*;
import java.io.*;

class abc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++)
		{
		    Boolean[] array = new Boolean[10];
            Arrays.fill(array, Boolean.FALSE);
		    int a=in.nextInt();
		    if(a==0)
		    {
		        System.out.println("Case #"+(i+1)+": INSOMNIA");
		        
		    }
		    else
		    {
		        for(int j=1;;j++)
		        {
		            int x=a*j;
		            int z=x;
		            for(;x!=0;)
		            {
		               int k=x%10;
		               array[k]=true;
		               x=x/10;
		            }
		            if(Arrays.asList(array).contains(false))
		            {
		                
		            }
		            else
		            {
		                System.out.println("Case #"+(i+1)+": "+z);
		                break;
		            }
		        }

		    }
		    
		    
		}
	}
}
