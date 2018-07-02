package methodEmbedding.Standing_Ovation.S.LYD2101;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Chameera
 */
public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedReader in=new java.io.BufferedReader(new java.io.FileReader("C:\\Users\\Chameera\\Desktop\\A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Chameera\\Desktop\\A-small-attempt0.out")));

        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            int a = Integer.parseInt(st.nextToken());

            String s = st.nextToken();

            int count = 0;
            int ans = 0;
            for (int j = 0; j < s.length(); j++) {
                int b = s.charAt(j) - '0';
                if (b > 0 && j > count) {
                    ans += j - count;
                    count += j - count;
                }
                count += b;
            }

            System.out.println("Case #" + (i + 1) + ": " + ans);
            out.println("Case #" + (i + 1) + ": " + ans);
        }
        out.close();
    }
}
