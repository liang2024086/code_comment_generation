package methodEmbedding.Counting_Sheep.S.LYD499;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("A-small-attempt2.in.");
        PrintWriter writer = new PrintWriter("output2.txt", "UTF-8");
        Scanner s = new Scanner(file);
        int total = s.nextInt();
        for(int i = 0; i < total; i++)
        {
            int num = s.nextInt();
            if(num == 0 )
            {
                writer.println("Case #" + (i+1) + ": INSOMNIA");
                continue;
            }
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for(int j = 0; j < 10; j++)
            {
                nums.add(j);
            }
            int loops = 1;
            boolean run = true;
            while(run)
            {
                int working = loops * num;
                String numAsString = new String(working + "");
                ArrayList<Integer> toRemove = new ArrayList<Integer>();
                for(int k : nums)
                {
                    if(numAsString.indexOf(new String(k + "")) != -1)
                    {
                       toRemove.add(k);
                    }
                }
                for(int l : toRemove)
                {
                    nums.remove(new Integer(l));
                }
                if(nums.isEmpty())
                {
                    writer.println("Case #" + (i+1) + ": " + numAsString+ "");
                    run = false;
                }
                else if(loops > 1000)
                {
                    writer.println("Case #" + (i+1) + ": INSOMNIA");
                    run = false;
                }
                loops++;
            }
        }
        writer.close();
    }
}
