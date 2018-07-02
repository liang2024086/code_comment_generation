package methodEmbedding.Standing_Ovation.S.LYD1711;

import java.util.Scanner;
import java.io.*;

public class A {
    public static void main(String... args) throws Exception{
        Scanner fin = new Scanner(new File(args[0]));
        fin.useDelimiter("");
        
        PrintWriter out = new PrintWriter("A.out");
        
        int[][] nums = new int[Integer.parseInt(fin.nextLine())][];
        for(int line = 0; line < nums.length; line++) {
            nums[line] = new int[fin.nextInt() + 1];
            fin.next();
            for(int n = 0; n < nums[line].length; n++) {
                nums[line][n] = Integer.parseInt(fin.next());
            }
            if(fin.hasNextLine()) fin.nextLine();
        }
        
        for(int k = 0; k < nums.length; k++) {
            int total = 0;
            int extra = 0;
            for(int i = 0; i < nums[k].length; i++) {
                if(i > total) {
                    extra = extra + (i - total);
                    total = total + (i - total);
                }
                total = total + nums[k][i];
            }
        
            out.printf("case #%d: %d\n", k + 1, extra);
        }
        out.close();
        fin.close();
    }
}
