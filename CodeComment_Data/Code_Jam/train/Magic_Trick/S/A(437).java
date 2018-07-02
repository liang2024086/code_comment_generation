package methodEmbedding.Magic_Trick.S.LYD1087;

/*
 * Copyright (c) 2009-2014, Inmite s.r.o. (www.inmite.eu). All rights reserved.
 *
 * This source code can be used only for purposes specified by the given license contract
 * signed by the rightful deputy of Inmite s.r.o. This source code can be used only
 * by the owner of the license.
 *
 * Any disputes arising in respect of this agreement (license) shall be brought
 * before the Municipal Court of Prague.
 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by tomas on 12.04.14.
 */
public class A {

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int a1 = sc.nextInt();
            Set<Integer> ans = new HashSet<Integer>();
            for (int j = 0; j < 16; j++) {
                int tmp = sc.nextInt();
                if (j >= (a1-1)*4 && j < a1*4) {
                    ans.add(tmp);
                }
            }

            int b1 = sc.nextInt();
            for (int j = 0; j < 16; j++) {
                int tmp = sc.nextInt();
                if (j < (b1-1)*4 || j >= b1*4) {
                    ans.remove(tmp);
                }
            }

            String ansStr;
            if (ans.size() == 1) {
                ansStr = ans.iterator().next().toString();
            } else if (ans.size() > 1) {
                ansStr = "Bad magician!";
            } else {
                ansStr = "Volunteer cheated!";
            }

            System.out.println("Case #" + i + ": " + ansStr);
        }
    }
}
