package methodEmbedding.Magic_Trick.S.LYD1336;

import java.io.*;
import java.util.*;

class A
{
    public static void main(String args[]) throws IOException
    {
        
        	try{
        		Scanner ab = new Scanner(new FileReader("c:\\code\\A-small-attempt0.in"));
        		//Scanner ab = new Scanner(System.in);
        	
        	    FileWriter wr=new FileWriter(new File("c:\\code\\output.txt"));
        	
        	int N=ab.nextInt();
        	int x=0;
        	int case1[][]=new int[4][4];
        	int ansa,ansb;
        	int case2[][]=new int[4][4];
        	
        	
        	int c=0,z=0;
        	
		     

       


        while(x<N)
        {
        	ansa=ab.nextInt();
        	for(int i=0;i<4;i++)
        	{
        		for(int j=0;j<4;j++)
        		{
        			case1[i][j]=ab.nextInt();
        		}
        	}
        	ansb=ab.nextInt();
        	for(int i=0;i<4;i++)
        	{
        		for(int j=0;j<4;j++)
        		{
        			case2[i][j]=ab.nextInt();
        		}
        	}
        	c=0;
        	for(int i=0;i<4;i++)
        	{
        		for(int j=0;j<4;j++)
        		{
        			if(case1[ansa-1][i]==case2[ansb-1][j])
        			{
        				c++;
        				z=case1[ansa-1][i];
        				
        			}
        		}
        	}
        	
        	if(c==1)
        	{
        		wr.write("Case #"+x+": "+z+"\n");
        	}
        	else if(c>1)
        	{
        		wr.write("Case #"+x+": Bad magician!\n");
        	}
        	else
        	{
        		wr.write("Case #"+x+": Volunteer cheated!\n");
        	}
        	
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

