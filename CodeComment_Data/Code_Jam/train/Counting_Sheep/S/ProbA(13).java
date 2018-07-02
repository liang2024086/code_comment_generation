package methodEmbedding.Counting_Sheep.S.LYD1275;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mkg
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class ProbA {

    private static final String INPUT = "C:\\Users\\mkg\\Desktop\\Code Jam Qualification Round 2016\\A-small-attempt0.in";
    private static final String OUTPUT = "C:\\Users\\mkg\\Desktop\\Code Jam Qualification Round 2016\\A-small-attempt0.out";

    public static void main(String[] args) {
        FileInputStream instream = null;
        PrintStream ostream = null;
        try {
            instream = new FileInputStream(INPUT);
            System.setIn(instream);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            ostream = new PrintStream(new FileOutputStream(OUTPUT));
            System.setOut(ostream);
        } catch (Exception e) {
            System.out.println(e);
        }
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int Test = cin.nextInt();
        int color[], sum;
        long N, R;
        for (int i = 0; i < Test; i++) {
            N = cin.nextLong();
            if (N == 0) {
                cout.println("Case #" + (i + 1) + ": INSOMNIA");
                continue;
            }
            color = new int[10];
            Arrays.fill(color, 0);
            sum = 0;
            R = N;
            while (R > 0) {
                int id = (int) (R % 10);
                R = R / 10;
                if (color[id] == 0) {
                    color[id] = 1;
                }
            }
            for (int j = 0; j < 10; j++) {
                sum += color[j];
            }
            int j=2;
            for (; sum < 10; j++) {
                R = N * j;
                while (R > 0) {
                    int id = (int) (R % 10);
                    R = R / 10;
                    if (color[id] == 0) {
                        color[id] = 1;
                    }
                }
                sum = 0;
                for (int K = 0; K < 10; K++) {
                    sum += color[K];
                }
            }
            cout.println("Case #" + (i + 1) + ": " + N*(j-1));
        }
        cin.close();
        cout.close();
    }
}
