package method_all.GoroSort.S.LYD83;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PQD {

        static int MAX = 1000;

        public static void main(String[] args) throws Exception{

                String problema = "D-small-attempt0";
                Scanner in = new Scanner(new File("./" + problema + ".in"));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./" + problema + ".out")));

                int T = in.nextInt();
                float numbersOut = 0.f;
                int size;

                for (int i = 1; i <= T; i++){
                		numbersOut = 0.f;
                        size = in.nextInt();

                        for (int c = 1; c <= size; c++){
                                if(in.nextInt() != c)
                                	numbersOut++;
                        }

                    
                        out.printf("Case #%d: %.6f\n",i,numbersOut);
                        System.out.printf("Case #%d: %.6f\n",i,numbersOut);
                }
                out.close();
                System.exit(0);
        }

}
