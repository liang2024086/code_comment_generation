package methodEmbedding.Counting_Sheep.S.LYD336;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author yilianz
 */
public class Countingsheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /*
         int flag[] = new int[10];
         int f = 10;
         int k = 0;
         int N = 0;
         //intitilize the array
         for (int j = 0; j < 10; j++) {
         flag[j] = 0;
         }
        
         for (int i = 0; i < 100; i++) {
         N=i*9;
         if (N<10) k=N;
         else {
         k = N-(int)(N/10)*10;
         }
         if (flag[k]==0) {
         flag[k]=1;
         System.out.println("Find digit " + k);
         f--;
              
         System.out.println(N);
         if (f==0) break;
         }
            
         }

         */

        Scanner inFile = new Scanner(new File("file.in"));
        PrintWriter outFile = new PrintWriter(new File("out.file"));

        int caseN = (int) inFile.nextInt();
        inFile.nextLine();
        // TODO code application logic here
        for (int i = 1; i < caseN + 1; i++) {
            int startN = inFile.nextInt();
            int flag[] = new int[10];
            int f = 10;
            int k = 1;
            int N = 0;
            //intitilize the array
            for (int j = 0; j < 10; j++) {
                flag[j] = 0;
            }

            if (startN != 0) {

                while (f != 0) {
                    N = startN * k;
                    while (N > 0) {
                        int digit = N % 10;
                        if (flag[digit] == 0) {
                            flag[digit] = 1;
                            //System.out.println("Find digit " + digit);
                            f--;
                        }
                        N = N / 10;
                    }
                    k++;
                }

                int lastnumber = startN * (k - 1);
                System.out.println("Case #" + i + ": " + lastnumber);
                outFile.println("Case #" + i + ": " + lastnumber);
            }
            else{
                System.out.println("Case #" + i + ": " + "INSOMNIA");
                outFile.println("Case #" + i + ": " + "INSOMNIA");
            }

        }

        //close the file
        inFile.close();
        outFile.close();


    }
}
