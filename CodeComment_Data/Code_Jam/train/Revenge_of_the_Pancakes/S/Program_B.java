package methodEmbedding.Revenge_of_the_Pancakes.S.LYD753;

import java.util.*;
import java.io.*;
public class Program_B
{
    public static void main(String filename) throws IOException
    {
        try{
        File inp = new File(filename);
        Scanner file = new Scanner(inp);
        PrintWriter writer = new PrintWriter("output.txt");
        int n = file.nextInt();
        int i=0,j=0,k=0;
        for(i=0;i<n;i++)
        {
            boolean f = false;
            String pan=file.next(); 
            int count = 0;
            while(!f)
            {
                 j= pan.lastIndexOf('-');
                    if(j==-1)
                    {break;}
                    String pan1= pan.substring(0,j+1);
                    pan1= pan1.replace('+','?');
                    pan1= pan1.replace('-','+');
                    pan1= pan1.replace('?','-');
                    pan = pan1+pan.substring(j+1);
                    count++;
                    
            
        }
            writer.print("Case #"+(i+1)+": "+count);
            writer.println();
        }
        file.close();
        writer.close();
    }
    catch(Exception e)
    {
        System.err.println(e);
    }
    }
}
