package methodEmbedding.Counting_Sheep.S.LYD866;

/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * @author Ativ
 *
 */
public class Main {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    
	    int T,N;
	    boolean f=false;
	    T=in.nextInt();
	    for(int i=0;i<T;i++)
	    {
	    	int arr[] = new int[10];
//	    	System.out.println("i=" + i);
	    	f=false;
	    	N=in.nextInt();
	    	if(N == 0)
	    	{
	    		System.out.println("Case #" + (i+1) + ": INSOMNIA");
	    	}
	    	else
	    	{
	    		for(int j=1;;j++)
	    		{
//	    	    	System.out.println("j=" + j);
	    			int temp = j*N;
	    			while(temp!=0)
	    			{
//	    				System.out.println("w");
	    				arr[temp%10]=1;
	    				temp=temp/10;
	    			}
	    			
	    			for(int k=0;k<10;k++)
	    			{
//	    		    	System.out.println("k=" + k);

	    		    	f=true;
	    				if(arr[k]==0)
	    				{
	    					f=false;
	    					break;
	    				} 
	    			}
	    			
	    			if(f==true)
	    			{
	    				System.out.println("Case #" + (i+1) + ": " + (j*N));
	    				break;
	    			}
	    		}
	    		
	    	}
	    }
	}
}
