package methodEmbedding.Standing_Ovation.S.LYD1378;

import java.util.Scanner;

/**
 * Created by hoangtung on 4/11/15.
 */
public class A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        input.nextLine();
        for (int testIdx = 1; testIdx <= nTest; ++testIdx)
        {
            String test = input.nextLine();
            String[] data = test.split("[ \t\n\r]+");
            int sMax = Integer.valueOf(data[0]);
            int[] audi = new int[data[1].length()];
            for (int i = 0; i < audi.length; ++i)
            {
                audi[i] = data[1].charAt(i) - '0';
            }

            int stoodUp = audi[0];
            int invites = 0;
            for (int i = 1; i < audi.length; ++i)
            {
                if (stoodUp >= i)
                {
                    stoodUp += audi[i];
                }
                else
                {
                    invites += i - stoodUp;
                    stoodUp = i + audi[i];
                }
            }

            System.out.println("Case #" + testIdx + ": " + invites);
        }
    }
}
