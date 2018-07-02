package methodEmbedding.Standing_Ovation.S.LYD1094;

import java.io.*;
import java.util.*;

public class Main {

    static Scanner cin = new Scanner(System.in);
    static PrintStream cout = System.out;

    public static void main(String[] args) {
        int ca = cin.nextInt();
        for (int c = 1; c <= ca; c++) {
            int res = 0;
            int n = cin.nextInt();
            String s = cin.next();
            int now = 0;
            for (int i = 0; i <= n; i++) {
                if (now < i) {
                    res += i - now;
                    now = i;
                }
                now += s.charAt(i) - '0';
            }
            cout.println("Case #" + c + ": " + res);
        }
    }
}
