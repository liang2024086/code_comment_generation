package methodEmbedding.Revenge_of_the_Pancakes.S.LYD7;

import java.util.*;

/**
 * Created by Wenzhao on 4/8/16.
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] data = new String[t];
        for (int i = 0; i < t; i++) {
            data[i] = sc.nextLine();
        }
        for (int i = 0; i < t; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            boolean positive = true;
            int count = 0;
            for (int j = data[i].length() - 1; j >= 0; j--) {
                if (positive && data[i].charAt(j) == '-') {
                    count++;
                    positive = false;
                }
                else if (!positive && data[i].charAt(j) == '+') {
                    count++;
                    positive = true;
                }
            }
            System.out.println(count);
        }
    }

}
