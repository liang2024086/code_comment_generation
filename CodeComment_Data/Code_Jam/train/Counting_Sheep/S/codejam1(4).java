package methodEmbedding.Counting_Sheep.S.LYD847;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class codejam1 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		int t,a[],n,num,rem,c=1,out,exit=1,k=1,j;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			t=Integer.parseInt(br.readLine());

		       while(t!=0)
		        { 
		    	   a=new int[11];
		          exit=1;
		          n=Integer.parseInt(br.readLine());

		          if(n==0)
		            System.out.println("Case #"+c+": INSOMNIA");
		          else
		    	    { 
		    		  for(k=1,j=0;exit!=0;k++)
		    	      {
		    			  num=k*n;
		    			  
		    	        while(num!=0)
		    	        { 
		    	        	rem=num%10;
		    			    if(a[rem]==0) 
		    	            { 
		    			    	j++;
		    	              a[rem]=1;
		    			    }
		    	            
		    	            if(j==10)
		    	            { 
		    	            	exit=0;
		    	              break;
		    				}
		    				num=num/10;
		    			}
		    			
		    		  }
		    		  n=(k-1)*n;
		    		  
		    		  System.out.println("Case #"+c+": "+n);
		    		}  
		            c++;
		            t--;
		            
		    	}			}
}
