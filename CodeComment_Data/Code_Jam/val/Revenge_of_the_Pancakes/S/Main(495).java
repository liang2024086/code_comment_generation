package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1037;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedInputStream buf = new BufferedInputStream(System.in);
        BufferedReader r = new BufferedReader(new InputStreamReader(buf, StandardCharsets.UTF_8));
        int t = Integer.parseInt(r.readLine()); //reads the first line, which is usually the num inputs
        int caseCount = 1;
        while(t>0) {
            String nextLine = r.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append("Case #" + caseCount++ + ": ");
            boolean plusWindow = true;
            boolean negWindow = false;
            int numPlus = 0;
            int numNeg = 0;
            int numFlips = 0;
            char[] array = nextLine.toCharArray();
            for (int i = 0; i < nextLine.length(); i++)
            {
                if (array[i] == '+')
                {
                    if (plusWindow)
                    {
                        numPlus++;
                    }
                    else
                    {
                        //was at a series of negatives, must convert to pluses
                        numPlus++;
                        numFlips++;
                        numNeg = 0;
                        negWindow = false;
                        plusWindow = true;
                    }
                }
                else
                {
                    if (i == nextLine.length()-1)
                    {
                        numFlips++;
                    }
                    
                    if (plusWindow)
                    {
                        numNeg++;
                        numPlus = 0;
                        if (i != 0) 
                        {
                            numFlips++;
                        }

                        negWindow = true;
                        plusWindow = false;
                    }
                    
                    else
                    {
                        numNeg++;
                    }
                }
                
            }
            
            sb.append(numFlips);
            System.out.println(sb.toString());
            t--;
        }
    }
}
