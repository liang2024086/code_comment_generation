package methodEmbedding.Standing_Ovation.S.LYD530;

/*
 * Copyright (c) 2015. Made just for fun.
 */


import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Tomik
 */
public class A {

    private static final Pattern SHYNESS = Pattern.compile("[0-9]+");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int S = sc.nextInt();
            String shyness = sc.next(SHYNESS);
            int count = shyness.charAt(0)-'0';
            int missing = 0;
            for (int j = 1; j < shyness.length(); j++) {
                int sj = shyness.charAt(j)-'0';
                int diff = Math.max(0, j - count);
                missing += diff;
                count += diff + sj;
            }
            System.out.println("Case #" + i + ": " + missing);
        }
    }

}
