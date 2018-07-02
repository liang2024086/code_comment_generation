package methodEmbedding.Counting_Sheep.S.LYD708;

//Problem Name: 

import java.util.*;
import java.io.*;
public class q1 { 
  public static void main(String[] args)throws IOException, Exception 
  {
    	
    	Scanner kb = new Scanner(new FileInputStream(args[0]));
    	PrintWriter out = new PrintWriter(new File("small_output.txt"));

    	int test = kb.nextInt();
    	
    	
    	for(int p = 0; p < test; p++)
    	{
    			int input = kb.nextInt();
    			boolean check = false;
    			if(input == 0)
    			{
    				out.println("Case #" + (p+1) + ": INSOMNIA");
    				continue;
    			}
    		
    		

    			int[] array = new int[10];
    			for(int i = 0; i < array.length; i++)
    			{
    				array[i] = 0;
    			}

    		int count = 0;
    		int temp = 1;
    	
    		do
    		{
    			temp = input*(++count);
    			
    			char[] c = (""+temp).toCharArray();
    		
    			for(int i = 0;i < c.length; i++)
    			{
    				array[((int)c[i]) - 48]++;
    			
    			}
    			check = true;
    			for(int i = 0; i < array.length; i++)
    			{
    				if(array[i] == 0)
    				{	
    					check = false;
    					break;
    				}	
    			}
    		}while(!check);

    		out.println("Case #" + (p+1) + ": " + temp);
		}

    

    	out.close();
  	}
}
