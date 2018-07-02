package methodEmbedding.Counting_Sheep.S.LYD770;

import java.util.*;
import java.io.*;

public class CountingShip {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            Long n = in.nextLong();


            boolean flag = true;
            Long cont = 1L;
            String finalString ="";
            while (flag)
            {
                if (n==0)
                    break;
                Long iterateNumber = cont*n;
                String partialString = iterateNumber.toString();
                char [] arrayPartialString = partialString.toCharArray();
                for (char c : arrayPartialString) {
                    if(finalString.indexOf(c) == -1)
                        finalString = finalString + c;
                }
                cont++;
                if (finalString.length() == 10)
                    flag = false;
            }
            Long resultLong = ((cont-1)*n);
            String finalResult = resultLong.toString();
            if (n==0)
                finalResult = "INSOMNIA";

            System.out.println("Case #" + i + ": " + finalResult);
        }
    }
}
