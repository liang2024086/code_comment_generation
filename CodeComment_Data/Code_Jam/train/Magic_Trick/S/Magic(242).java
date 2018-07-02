package methodEmbedding.Magic_Trick.S.LYD682;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author test5
 */
public class Magic {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new File("src/out.txt"));
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int row1 = sc.nextInt();
            int b1[][] = new int[4][4];
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    b1[r][c] = sc.nextInt();
                }
            }
            int row2 = sc.nextInt();
            int b2[][] = new int[4][4];
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    b2[r][c] = sc.nextInt();
                }
            }

            int count = 0;
            int card = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (b1[row1-1][i] == b2[row2-1][j]) {
                       // System.out.println(i+" "+j+" "+b1[row1-1][i]); 
                        count++;
                        card = b1[row1-1][i];
                    }
                }
            }
            String msg = "" + card;
            if (count == 0) {
                msg = "Volunteer cheated!";
            }
            if (count > 1) {
                msg = "Bad magician!";
            }
            System.out.println("Case #" + (tc + 1) + ": " + msg);
            pw.println("Case #" + (tc + 1) + ": " + msg);
        }
        pw.close();
    }

}
