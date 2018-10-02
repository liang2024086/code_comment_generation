package methodEmbedding.Magic_Trick.S.LYD2160;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sidharth
 */
class MagicTrick {

    public static void main(String[] arg) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
        PrintWriter pw = new PrintWriter(new File("A-small.out"));
        StringTokenizer tokenizer;

        int T = Integer.parseInt(reader.readLine());
        int a1, a2;

        for (int i = 1; i <= T; i++) {
            a1 = Integer.parseInt(reader.readLine());
            int[] cards1 = new int[4];
            for (int j = 1; j <= 4; j++) {
                if (j == a1) {
                    tokenizer = new StringTokenizer(reader.readLine());
                    for (int x = 0; x < 4; x++) {
                        cards1[x] = Integer.parseInt(tokenizer.nextToken());
                    }
                } else {
                    reader.readLine();
                }
            }
            a2 = Integer.parseInt(reader.readLine());
            int[] cards2 = new int[4];
            for (int j = 1; j <= 4; j++) {
                if (j == a2) {
                    tokenizer = new StringTokenizer(reader.readLine());
                    for (int x = 0; x < 4; x++) {
                        cards2[x] = Integer.parseInt(tokenizer.nextToken());
                    }
                } else {
                    reader.readLine();
                }
            }

            int common = 0;
            int result = 0;

            for (int j = 0; j < 4; j++) {
                for (int x = 0; x < 4; x++) {
                    if (cards1[j] == cards2[x]) {
                        common++;
                        result = cards1[j];
                    }
                }
            }
            if (common == 1) {
                pw.println("Case #" + i + ": " + result);
            } else if (common > 1) {
                pw.println("Case #" + i + ": Bad magician!");
            } else {
                pw.println("Case #" + i + ": Volunteer cheated!");
            }

        }
        pw.close();
    }

}
