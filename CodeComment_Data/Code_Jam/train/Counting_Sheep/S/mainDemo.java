package methodEmbedding.Counting_Sheep.S.LYD606;

import java.lang.reflect.Array;
import java.util.*;

 
 class mainDemo {
 
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int s=t;
    while(t!=0)
    {
    	t--;
    	int N=sc.nextInt();
    	int flag=0;
    	int a[]={0,1,2,3,4,5,6,7,8,9};
    	int b[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    	
    	for(int i=1;i<100000;i++)
    	{
    		
    	int m=N;
    
    	m=i*N;
    	//System.out.println(m);
    	while(m!=0)
    	{
    		b[m%10]=m%10;
          	m=m/10;
    		
    	}
    	
    	//System.out.println(Arrays.toString(b));
    	if(Arrays.equals(a, b))
    	{
    		flag=1;
    		System.out.println("Case #"+(s-t)+": "+(i)*N);
    		break;
    		
    	}
    }
    	if(flag!=1)
    	System.out.println("Case #"+(s-t)+": "+"INSOMNIA");
    	
    }
    
  }
    
}
