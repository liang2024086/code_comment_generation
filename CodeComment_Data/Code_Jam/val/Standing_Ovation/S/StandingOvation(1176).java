package methodEmbedding.Standing_Ovation.S.LYD2110;

import java.util.*;
import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws Exception {
        if (args.length == 0)
            throw new IllegalArgumentException("Require input file name");
        Scanner sc = new Scanner(new FileReader(args[0]));
        String outFilename = args[0].replaceFirst("[.][^.]+$", "").concat(".out");
        PrintWriter pw = new PrintWriter(new FileWriter(outFilename));
        int caseCnt = Integer.parseInt(sc.nextLine());
        for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
            pw.print("Case #" + (caseNum + 1) + ": ");
            String[] testCase = sc.nextLine().split("\\s+");
            int maxShy = Integer.parseInt(testCase[0]);
            String audiences = testCase[1];
            int stand = 0;
            int addition = 0;
            for (int thres = 0; thres <= maxShy; thres++) {
                int sit = audiences.charAt(thres) - '0';
                if (sit > 0) {
                    if (stand < thres) {
                        int delta = thres - stand;
                        addition += delta;
                        stand += delta;
                    }
                    stand += sit;
                }
            }
            pw.println(addition);
        }
        pw.flush();
        pw.close();
        sc.close();
    }
}
