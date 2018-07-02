package methodEmbedding.Counting_Sheep.S.LYD342;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String args[] ) throws Exception {
        BufferedInputStream buf = new BufferedInputStream(System.in);
        BufferedReader r = new BufferedReader(new InputStreamReader(buf, StandardCharsets.UTF_8));
        int t = Integer.parseInt(r.readLine()); //reads the first line, which is usually the num inputs
        int caseCount = 1;
        Boolean[] seenDigits = new Boolean[10];
        while(t>0) {
            int nextN = Integer.parseInt(r.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append("Case #" + caseCount++ + ": ");
            if (nextN == 0)
            {
                sb.append("INSOMNIA");
            }
            else
            {
                int multiplier = 1;
                int numSeenDigits = 0;
                int currInt = 0;
                
                while (numSeenDigits != 10)
                {
                    currInt = nextN * multiplier++;
                    int tempInt = currInt;
                    while (tempInt > 0)
                    {
                        int remainder = tempInt % 10;
                        tempInt /= 10;
                        if (seenDigits[remainder] == null) 
                        {
                            seenDigits[remainder] = true;
                            numSeenDigits++;
                        }
                        
                        if (numSeenDigits == 10)
                        {
                            seenDigits = new Boolean[10];
                            break;
                        }
                    }
                }
                
                sb.append(currInt);
            }
            
            System.out.println(sb.toString());
            
            t--;
        }
    }

}
