package methodEmbedding.Counting_Sheep.S.LYD1466;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    static Scanner in;
    static BufferedWriter out;


    public static void main(String[] args) throws IOException {
        
        in = new Scanner(new File("counting_sheep.in"));
        out = new BufferedWriter(new FileWriter("counting_sheep.out"));

        int testi = in.nextInt();

        for (int i = 0; i < testi; i++) {
            out.write("Case #" + (i+1) + ": ");
            long n = in.nextInt();

            if (n == 0) {
                out.write("INSOMNIA" + "\n");
                continue;
            }

            HashSet<Long> set = new HashSet<Long>();

            long counter = 1;
            while (set.size() != 10) {
                long result = counter * n;
                //System.out.println(result);
                while (result > 0) {
                    set.add(result%10);
                    result /= 10;
                }
                counter++;
            }
            out.write((counter-1)*n + "\n");
        }

        in.close();
        out.close();
    }

}    
