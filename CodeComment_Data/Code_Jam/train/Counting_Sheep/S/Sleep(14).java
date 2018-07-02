package methodEmbedding.Counting_Sheep.S.LYD818;

import java.util.Scanner;
public class sleep {
public static void main(String[] args)
{
	int tc,a[],n[];
    Scanner sc=new Scanner(System.in);
    tc=sc.nextInt();
    n=new int[100];
    a=new int[20];
   
    for(int i=0;i<tc;i++)
    {
        
    	n[i]=sc.nextInt();
    	
    
    }
    
        
    
    for(int i=0;i<tc;i++)
    {
    	
    	int temp=n[i],flag=-1,lasttemp = 0;
    	int c=i+1;
        int j=1;
        if(temp==0)
        {
        	 System.out.println("Case #"+c+": "+"INSOMNIA");
        }
        else
        {
        	 
            for(int k=0;k<10;k++)
            {
            a[k]=k;
            }
            
        while(temp!=0)
        {
        	
            
            int num=temp%10;
            
            
            for(int l=0;l<10;l++)
            {
            
            	if(num==a[l])
                {
                	
                    a[l]=-2;
                    
                }
            
            }
            
                
             //to check all the ten digit exist or not   
               int count=1;
                
                for( int m=0;m<10;m++)
                 {
                	
                	            
                        if(a[m]==-2)
                       ++count;
                 }
                
                
                temp=temp/10;
            
                
                
                if(count==11)
                {
                System.out.println("Case #"+c+": "+lasttemp);
                flag=0;
                break;
                }
                
                else if(temp==0)
                
                {   
                	
                j++;
                temp=n[i]*j;
                lasttemp=temp;
               
                }   
                 
                if(flag==0)
                break;
                
        }
        }
    }
}
}
