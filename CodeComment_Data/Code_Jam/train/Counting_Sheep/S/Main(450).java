package methodEmbedding.Counting_Sheep.S.LYD344;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;
        try {
            //these variables handle input and output from plain text files
            in = new Scanner(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");

            int testCases = in.nextInt();
            int N;
            int[] digits = new int[10];
            int digitsFilled = 0;
            int d;
            int M;
            int n;
            for (int testCase = 1; testCase <= testCases; testCase++) {

                N = in.nextInt();
                if(N==0){
                    out.printf("Case #%d: INSOMNIA\n", testCase);

                }else {
                    int adjust = 0;
                    while(N % 10 ==0){
                        N /= 10;
                        adjust++;
                    }

                    n=N;
                    for (int i = 0; i < 10; i++) {
                        digits[i] = 0;
                    }
                    digitsFilled = 0;

                    if(adjust>0){
                        digits[0]=1;
                        digitsFilled++;
                    }
                    while (digitsFilled<10) {

                        M = n;
                        while(M>0){
                            d =  M % 10;
                            if(digits[d]==0){
                                digits[d] = 1;
                                digitsFilled++;
                            }
                            M /= 10;
                        }//end checking digits loop
                        n += N;

                    }//end while awake

                    n -= N;
                    for (int i = 1; i <= adjust ; i++) {
                        n *= 10;
                    }

                    out.printf("Case #%d: %d\n",testCase, n);
                }//end if n=0
                out.flush();

            }//end for testCase


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }
}
