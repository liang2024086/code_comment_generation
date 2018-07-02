package methodEmbedding.Standing_Ovation.S.LYD1006;

import java.io.*;
import java.util.*;

public class StandingOvation {
    public static void main(String[] args) {
       // PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
       // System.setOut(out);
        String filename = args[0];
        Scanner in;
        try {in = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }
        int T = in.nextInt();
        in.nextLine();
        
        for (int i = 1; i <= T; i++) {
            String digits = in.nextLine();
            //System.out.println(digits);
            //int max = in.nextInt();
            int sum = 0;
            int num = 0;
            if (digits.length() < 2) {
                System.out.println ("Case #" + i + ": " + num);
                continue;
            }
            int[] shy = new int [digits.length() - 3];
            //System.out.println(digits.length());
            for (int s = 0; s < digits.length() - 3; s++) {
                shy[s] = Character.getNumericValue(digits.charAt(s + 2));
                sum += shy[s];
                while (s + 1 > sum) {
                    sum++;
                    num++;
                }
               // System.out.println("Sum for # " + i + " " + sum);
            }
            System.out.println("Case #" + i + ": " + num);
            
            
        }
    }
}
