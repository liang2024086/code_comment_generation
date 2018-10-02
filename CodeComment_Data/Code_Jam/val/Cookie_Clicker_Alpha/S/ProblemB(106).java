package methodEmbedding.Cookie_Clicker_Alpha.S.LYD168;

import java.io.*;
import java.util.*;
import java.math.*;

public class ProblemB {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        try {
            int totalCases = sc.nextInt();
    
            for (int caseNum=1; caseNum <= totalCases; ++caseNum) {
                double C = sc.nextDouble();
                double F = sc.nextDouble();
                double X = sc.nextDouble();

                double rate = 2, time = 0, waitTime = 0, hurryTime = 0;

                while (X > 0) {
                    waitTime = X / rate;
                    hurryTime = (C / rate) + (X / (rate + F));
                    if (waitTime < hurryTime) {
                        time += waitTime;
                        X = 0;
                    } else {
                        time += (C / rate);
                        rate += F;
                    }
                }

                pw.println(String.format("Case #%d: %1.7f", caseNum, time));
            }
        }
        finally {
            pw.flush();
            pw.close();
            sc.close();
        }
    }
}
