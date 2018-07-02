package methodEmbedding.Standing_Ovation.S.LYD849;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("A-small.in"));
        int cases = sc.nextInt();
        for (int n=1;n<=cases ;n++){
            int s_max = sc.nextInt();
            int audience[] = new int[s_max+1];
            int standing = 0;
            int pad = 0;
            String temp = sc.nextLine().trim();
            for (int i=0; i<=s_max; i++){
                int c=Integer.parseInt(String.valueOf(temp.charAt(i)));
                if (standing+pad >= i) {
                    standing += c;
                } else {
                    pad += i-standing-pad;
                    standing += c;
                }
            }
            System.out.println("Case #"+n+": "+pad);
        }
    }
}
