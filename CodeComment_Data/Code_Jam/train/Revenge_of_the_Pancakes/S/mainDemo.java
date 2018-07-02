package methodEmbedding.Revenge_of_the_Pancakes.S.LYD394;

import java.lang.reflect.Array;
import java.util.*;

import javax.swing.plaf.SliderUI;

 
 class mainDemo {
 
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int s=t;
    int co=0;
    while(t!=0)
    {
    	t--;
    	int flag=1,count=0;
    	
    	StringBuffer sb=new StringBuffer(sc.next());
    	while(flag==1)
    	{
    		for(int i=0;;)
    		{
    			if(sb.toString().contains("-")==false)
    				{
    				flag=0;
    				break;
    				}
    			if(sb.toString().contains("+")==false)
				{
					flag=0;
					count++;
					break;
				}
    			i=sb.indexOf("+")<sb.indexOf("-")?sb.indexOf("-"):sb.indexOf("+");	
    				
    			if(sb.toString().compareTo("-")==0)
    				i=0;
    				
    			//System.out.println(sb.toString());
    				for(int j=0;j<(i-1)/2;j++)
    				{
    					char ch=sb.charAt(j);
    				//	System.out.print(i-j-1);
    					sb.setCharAt(j,sb.charAt(i-j-2));
    					sb.setCharAt(j, ch);
    					
    				}
    				
    				for(int j=0;j<i;j++)
    				{
    					if(sb.charAt(j)=='-')
    						sb.setCharAt(j,'+');
    					else
    						sb.setCharAt(j,'-');
    				}
    				count++;
    				
    				
    	//	System.out.println(sb.toString());
    			
    			
    		}
    	}
    	System.out.print("Case #"+(s-t)+": ");
    	System.out.println(count);
    			
    }
    
    }
}
