package methodEmbedding.Standing_Ovation.S.LYD698;

import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(
                        System.in)));

        int T = sc.nextInt(); sc.nextLine();
        for (int t = 1; t <= T; t++) {
            String[] line = sc.nextLine().split(" "); 
            int smax = Integer.parseInt(line[0]);

            int[] shyNum = new int[line[1].length()];

            String[] shyness = line[1].split("");
            for (int i = 0; i < line[1].length(); i++) {
                shyNum[i] = Integer.parseInt(shyness[i]);
            }

            int friendNum = 0;
            int s = 0;
            for (int i = 0; i < shyNum.length; i++) {
                if (s >= i) {
                    s += shyNum[i];
                } else {
                    int diff = i - s;
                    friendNum += diff;
                    s += diff + shyNum[i];
                }
            }
            System.out.printf("Case #%d: %d\n", t, friendNum);
            System.out.flush();
        }
    }
}
