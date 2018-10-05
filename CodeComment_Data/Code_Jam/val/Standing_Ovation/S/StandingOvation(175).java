package methodEmbedding.Standing_Ovation.S.LYD369;

import java.io.*;
import java.util.*;
/**
 * Write a description of class Even_Fibonacci_Numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandingOvation
{
    public static void main(String[] args) throws IOException
    {
        Scanner reader= new Scanner(new File("data.in"));
        int total= reader.nextInt();
        reader.nextLine();
        for(int i=0; i<total; i++)
        {            
            String line= reader.nextLine();
            int maxS= Integer.parseInt(line.substring(0,1));
            String people= line.substring(2);            
            String[] arr = people.split(""); 
            int[] ppl= new int[arr.length-1];
            for(int j=0; j<ppl.length; j++)
            {
                ppl[j]=Integer.parseInt(arr[j+1]);
            }
            System.out.print("Case #"+(i+1)+": ");      
            int needed=0;
            int peeps=ppl[0];           
            for(int j=1; j<ppl.length; j++)
            {          
                if(peeps+needed<j)
                {
                    needed++;
                }             
                peeps+=ppl[j];
            }            
            System.out.println(""+needed);
        }
    }
}
