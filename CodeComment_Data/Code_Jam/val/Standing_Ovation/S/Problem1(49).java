package methodEmbedding.Standing_Ovation.S.LYD528;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shloak
 */
import java.io.*;
import java.util.*;
public class Problem1 
{
    public static void main (String[] args) throws FileNotFoundException
    {
        File file = new File ("A-small-attempt1.in");
        Scanner scan = new Scanner (file);
        int cases = scan.nextInt();
        for (int i = 1; i <= cases; i++)
        {
            int a = scan.nextInt();  // biggest number
            int counter = 0;
            int totalExtra = 0;
            if (a == 0)
            {
                System.out.println("Case #" + i + ": 0");
                String origNum = scan.next();
            }
            else
            {
                String origNum = scan.next();
                String numberAsString = "";
                int len = origNum.length();
                for (int z = len - 1; z >= 0 ; z-- )
                  numberAsString = numberAsString + origNum.charAt(z);
                int numberAsInt = Integer.parseInt(numberAsString);
                int x = numberAsInt % 10;
                numberAsInt /= 10;
                counter += x;
                for (int k = 1; k <= a; k++)
                {
                    int current = numberAsInt % 10;
                    if (current > 0)
                    {
                        if (counter < k)
                        {
                            int extra = (k-counter);
                            counter += extra;
                            totalExtra += extra;
                        }
                    }
                    counter += current;
                    numberAsInt /= 10;
                }
                System.out.println("Case #" + i + ": " + totalExtra);
            }
        }
    }
}
