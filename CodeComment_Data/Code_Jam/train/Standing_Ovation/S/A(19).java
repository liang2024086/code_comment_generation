package methodEmbedding.Standing_Ovation.S.LYD713;

import java.io.*;
import java.util.*;

class A
{
    public static void main(String args[]) throws IOException
    {
        
        	try{
        		Scanner ab = new Scanner(new FileReader("c:\\codeJam\\input.in"));
        		//Scanner ab = new Scanner(System.in);
        	
        	    FileWriter wr=new FileWriter(new File("c:\\codeJam\\output.txt"));
        	
        	int N=ab.nextInt();
        	int x=0;
        	int max_shyness=0;
            String shyness;
            int r=0;
            int m=0;int a; 	
        	
        	
		     

       


        while(x<N)
        {


            max_shyness=ab.nextInt();
            shyness=ab.next();
            r=0;
            m=0;
            for(int i=0;i<=max_shyness;i++)
            {
                a=(int)(shyness.charAt(i)-'0');
               // System.out.println(""+a);
                
                if(a!=0)
                {
                
                if((i-m)>0)
                {r+=i-m;}
                
                if(a+i>m)
                {
                m=a+i;}
                else
                {
                    m=m+a;
                }
            
            }

            }
            
            
            
            
            
            
            
        	
        	
        	
        	
        		wr.write("Case #"+(x+1)+": "+r+"\n");
        	
        	
        	
        x++;	
        	
        }
        
       wr.flush();
       wr.close();
        return;
    }catch( Exception e)
    {
    	return;
    }
    }

}

