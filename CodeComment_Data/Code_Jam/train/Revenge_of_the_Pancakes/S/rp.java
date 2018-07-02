package methodEmbedding.Revenge_of_the_Pancakes.S.LYD744;




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class rp 
{
	static boolean[] list=new boolean[10];
	static int ans1[];
	
	public static void main(String args[])
	{
       int t;
      
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
		t=sc.nextInt();
		
		ans1=new int[t];
		  String s[]=new String[t];
		for(int m=0;m<t;m++)
		  {
			
            s[m]=sc.next();
		  }
		for(int m=0;m<t;m++)
		{
           StringBuffer bs=new StringBuffer(s[m]);
           int n=bs.length();
          
           int loop=0;
           boolean flag=false;
   	
   		 if(n!=1)
   		
   			 {
   			 while(true)
   			 
   		{
   		char c=bs.charAt(0);
   		int count=0;
   		for(int i=1;i<n;i++)
   		{
   			
   			
   			if(c==bs.charAt(i))
   			count++;
   			else
   				break;
   			
   		if(i==n-1&&c=='+')
   		  {
   			flag=true;
   			
   			break;
   		  }
   		}
   		if(!flag)
   		{
   		for(int i=0;i<=count;i++)
   		{
   			
   			
   		char ch=bs.charAt(i);
   		if(ch=='-')
   		  {
   			bs.deleteCharAt(i);
   			bs.insert(i,'+');
   		  }
   		else 
   		  {
   			bs.deleteCharAt(i);
   			bs.insert(i,'-');
   		  }
   		
   		}
   		loop++;
   		}
   		for(int i=0;i<n;i++)
   		   {
   			char ch =bs.charAt(i);
   			if(ch=='-')
   			flag=false;
   	       }
   		
   		if(flag)
   	    break;
   		}
   		
                    
         ans1[m]=loop;
		}
		else
		{
		if(bs.charAt(0)=='-')
		ans1[m]=1;
		else
			ans1[m]=0;
	 }
		}
for(int i=0;i<t;i++)
{
	 System.out.println("Case #"+(i+1)+": "+ans1[i]);
}
		
		
}
}
	

