package methodEmbedding.Counting_Sheep.S.LYD647;

     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Ideone
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		long t,n,i;
    		Scanner sc = new Scanner(System.in);
    		t=sc.nextLong();
     
    		for(i=0;i<t;i++){
    			n=sc.nextLong();
    				long[] a=new long[10];
    			if(n==0){
    				long q = i+1;
    				System.out.println("Case #"+q+": INSOMNIA");
    				continue;
    			}
    			long j=1,count=0;
    			while(true){
    				if(count==10)
    				break;
     
    				long k,v;
    				k=n*j;
    				j++;
    				char c[]=String.valueOf(k).toCharArray();
    				for(v=0;v<c.length;v++){
    					if(a[c[(int)v]-'0']!=1){
    						a[c[(int)v]-'0']=1;
    						count++;
    					}
    				}
    			}
    			long q=i+1;
    		System.out.println("Case #"+q+": "+(j-1)*n);
    		}
     
    	}
    }
