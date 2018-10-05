package methodEmbedding.Counting_Sheep.S.LYD116;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by macbook on 9.04.2016.
 */
public class CountingSheep
{
    public static void main(String[] args)
    {
        String inputFileName = "CountingSheep_in.txt";
        String outputFileName = "CountingSheep_out.txt";
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try
        {
            scanner = new Scanner(new File(inputFileName));
            printWriter = new PrintWriter(outputFileName);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        int t = scanner.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n = scanner.nextInt();
            if(n == 0)
            {
                printWriter.println("Case #" + i + ": " + "INSOMNIA");
                continue;
            }
            HashSet<Integer> hashSet = new HashSet<Integer>();
            for(int j=0;j<=9;j++)
                hashSet.add(j);
            int counter = 1;
            while(hashSet.size() != 0)
            {
                int tmpN = n * counter;
                while(tmpN > 0)
                {
                    if(hashSet.contains(tmpN % 10))
                        hashSet.remove(tmpN % 10);
                    tmpN /= 10;
                }
                counter++;
            }
            printWriter.println("Case #" + i + ": " + n * (counter - 1));
        }
        scanner.close();
        printWriter.close();
    }
}
