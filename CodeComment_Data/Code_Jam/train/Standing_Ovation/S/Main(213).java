package methodEmbedding.Standing_Ovation.S.LYD1716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int trials = Integer.parseInt(in.readLine());
        int maxShyness;
        char[] digits;
        String[] tokens;
        
        StringBuilder output = new StringBuilder();
        
        for(int t = 1; t <= trials; t++)
        {
            tokens = in.readLine().trim().split("\\s+");
            maxShyness = Integer.parseInt(tokens[0]);
            digits = tokens[1].toCharArray();
            
            int friendsNeeded = 0;
            int runningSum = digits[0] - '0';
            
            for(int i = 1; i < digits.length; i++)
            {
                if(runningSum < i)
                {
                    friendsNeeded += i - runningSum;
                    runningSum += i - runningSum;
                }
                runningSum += digits[i] - '0';
            }
            
            output.append("Case #").append(t).append(": ").append(friendsNeeded).append("\n");
        }
        
        System.out.print(output);
    }
}
