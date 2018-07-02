package methodEmbedding.Counting_Sheep.S.LYD1348;

import java.util.*;
import java.io.*;

public class a
{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int start, n;
        
        for (int i = 0; i < cases; i++)
        {
        	boolean asleep = false;
            boolean array[] = new boolean[10];
            start = sc.nextInt();            
            
            for (int j = 1; j < 1000; j++)
            {   
                n = start * j;
                                
                while (n > 0)
                {
                   array[n % 10] = true;
                   n = n / 10;                  
                   
                }
                asleep = true;
                for (int k = 0; k < 10; k++)
                {                    
                    if (array[k] == false)
                    {
                        asleep = false;
                    }
                }
                
                if (asleep)
                {
                    System.out.println("Case #" + (i+1) + ": " + (start * j));
                    break;
                }
            }
            
            if (asleep == false)
            {
            	System.out.println("Case #" + (i+1) + ": INSOMNIA");
            }
            
        }
        
        
    }
}
