package methodEmbedding.Counting_Sheep.S.LYD456;


import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        int lastNumSeen = 0;

        for (int i = 1; i <= t; ++i)
        {

            int inputNum = in.nextInt();
            if (inputNum==0)
            {
                System.out.println("Case #" + i + ": " + "INSOMNIA" );
                continue;
            }

            Set seenNumberSet = new HashSet<Integer>();
            int c = 1;
            while (true)
            {
                int countNum = c * inputNum;
                String intToString = Integer.toString(countNum);

                for(char intChar : intToString.toCharArray())
                {
                    int convert = Character.getNumericValue(intChar);
                    seenNumberSet.add(convert);
                }
                if(seenNumberSet.size() == 10)
                {
                    lastNumSeen = countNum;
                    break;
                }

                c++;
                if(c == 1000000)
                {
                    System.out.println("Case #" + i + ": " + "INSOMNIA " );
                    break;
                }
            }

            System.out.println("Case #" + i + ": " + (lastNumSeen) );
        }
    }
}
