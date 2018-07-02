package methodEmbedding.Counting_Sheep.S.LYD196;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author tezk
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        int caseArray[] = new int[cases];
        for (int i=0; i<cases; i++)
            caseArray[i]=s.nextInt();
        
        for (int outerCount = 1; outerCount <= cases; outerCount++) {
            int myArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int loop = 1;
            boolean flag = false;
            int tally = 0;

            BigInteger firstInt = BigInteger.valueOf(caseArray[outerCount-1]);
            BigInteger currentInt = firstInt;
            BigInteger nextInt = firstInt;
            BigInteger ten = BigInteger.valueOf(10);
            do {
                nextInt = currentInt;
                while (currentInt.longValue() != 0) {
                    int val = (currentInt.mod(ten).intValue());
                    myArray[val] = 1;
                    currentInt = currentInt.divide(ten);
                }
                tally = 0;
                for (int x = 0; x < 10; x++) {
                    tally += myArray[x];
                }
                if (tally == 10) {
                    flag = true;
                } else {
                    loop++;
                    currentInt = firstInt.multiply(BigInteger.valueOf(loop));
                }
            } while (flag == false && loop < 1000);
            System.out.print("Case #"+outerCount+": ");
            if (tally == 10) {
                System.out.println(nextInt);
            } else {
                System.out.println("INSOMNIA");
            }
        }
    }
}
