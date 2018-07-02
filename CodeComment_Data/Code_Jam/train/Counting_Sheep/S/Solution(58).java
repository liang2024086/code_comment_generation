package methodEmbedding.Counting_Sheep.S.LYD1512;


import com.javafx.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tn = sc.nextInt();
        for (int ti=1;ti<=tn;ti++) {
            int n = sc.nextInt();
            if (n==0) {
                System.out.println("Case #"+ti+": "+"INSOMNIA");
                continue;
            }
            HashSet<Integer> set = new HashSet<Integer>();
            int m = n;
            int kx = n;
            while (kx>0) {
                set.add(kx%10);
                kx = kx / 10;
            }
            while (set.size()<10) {
                m = m + n;
                kx = m;
                while (kx>0) {
                    set.add(kx%10);
                    kx = kx / 10;
                }
            }
            System.out.println("Case #"+ti+": "+m);
        }
    }
}
