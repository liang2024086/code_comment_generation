package methodEmbedding.Magic_Trick.S.LYD283;

/**
 * Google Code Jam | Round 1A | Problem A
 * 
 * @author Victor Liu
 * @contact victor.liu@rochester.edu
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

    public static final String INPUT_FILE = "C:\\Users\\Victor\\Downloads\\A-small-attempt2.in";
    public static final String OUTPUT_FILE = "C:\\Users\\Victor\\Desktop\\A-small-attempt2.out";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(INPUT_FILE));
        PrintWriter pw = new PrintWriter(OUTPUT_FILE);

        int T = Integer.parseInt(sc.nextLine());
        for (int n = 1; n <= T; n++) {
            int firstAnswer = Integer.parseInt(sc.nextLine());
            int[][] grid1 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                String[] sp = sc.nextLine().split(" ");
                for (int j = 0; j < 4; j++) {
                    grid1[i][j] = Integer.parseInt(sp[j]);
                }
            }
            
            boolean[] possibles = new boolean[17];
            for (int j = 0; j < 4; j++) possibles[grid1[firstAnswer - 1][j]] = true;

            int secondAnswer = Integer.parseInt(sc.nextLine());
            int[][] grid2 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                String[] sp = sc.nextLine().split(" ");
                for (int j = 0; j < 4; j++) {
                    grid2[i][j] = Integer.parseInt(sp[j]);
                }
            }
            
            boolean[] finals = new boolean[17];
            for (int j = 0; j < 4; j++) {
                int possible = grid2[secondAnswer -1][j];
                if (possibles[possible]) finals[possible] = true;
            }
          
            String out = "";
            int count = 0;
            int answer = -1;
            for (int i = 0; i < 17; i++) {
                if (finals[i]) {
                    answer = i;
                    count++;
                }
            }

            if (count == 0) out = "Volunteer cheated!";
            if (count == 1) out = answer + "";
            if (count > 1) out = "Bad magician!";
            
            pw.printf("Case #%d: %s\n", n, out);
        }
        
        pw.close();

    }

}
