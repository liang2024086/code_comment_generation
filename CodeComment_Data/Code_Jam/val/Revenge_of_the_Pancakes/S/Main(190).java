package methodEmbedding.Revenge_of_the_Pancakes.S.LYD682;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static final char SIDE_HAPPY = '+';
    private static final char SIDE_BLANK = '-';

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= t; ++i) {
            final String s = in.nextLine();
            char currentSide = s.charAt(0);
            int count = 1;
            for (int index = 1; index < s.length(); ++index) {
                if (currentSide == s.charAt(index)) continue;
                count++;
                currentSide = s.charAt(index);
            }
            if (SIDE_HAPPY == s.charAt(s.length() - 1)) count--;
            System.out.println("Case #" + i + ": " + count);
        }
    }

}
