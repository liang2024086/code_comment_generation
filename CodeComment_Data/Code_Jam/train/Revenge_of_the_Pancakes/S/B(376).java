package methodEmbedding.Revenge_of_the_Pancakes.S.LYD640;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class B
{
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(new File("./input_small.txt"));
        PrintWriter writer = new PrintWriter("./output_small.txt");
        int nTests = scanner.nextInt();
        scanner.nextLine(); //skip line (i.e., next line)
        String panStack;
        int output;
        char curPan;
        char nextPan;
        int nPans;
        
        for(int i = 0; i < nTests; i++)
        {
            output = 0;
            panStack = scanner.nextLine();
            nPans = panStack.length();
            
            curPan = panStack.charAt(0);
            for(int j = 1; j < nPans; j++)
            {
                nextPan = panStack.charAt(j);
                if(nextPan != curPan) output++;
                curPan = nextPan;
            }
            
            if(panStack.charAt(nPans - 1) == '-') output++;

            writer.println("Case #" + (i+1) + ": " + output); 
        }
        
        scanner.close();
        writer.close();
        long finish = System.currentTimeMillis();
        System.out.println("Time=" + (finish - start) + "ms");
    }
}
