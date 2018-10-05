package methodEmbedding.Counting_Sheep.S.LYD1658;

import java.util.*;

/**
 * Created by Wenzhao on 4/8/16.
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] data = new String[t];
        for (int i = 0; i < t; i++) {
            data[i] = sc.nextLine();
        }
        for (int i = 0; i < t; i++) {
            System.out.print("Case #" + (i + 1) + ": ");
            StringBuilder current = new StringBuilder(data[i]);
            HashSet<Integer> set = new HashSet<Integer>();
            HashSet<String> seen = new HashSet<String>();
            seen.add(current.toString());
            for (int index = 0; index < current.length(); index++) {
                set.add(current.charAt(index) - '0');
            }
            while (set.size() < 10) {
                int forward = 0;
                for (int j = current.length() - 1; j >= 0; j--) {
                    int sum = (current.charAt(j) - '0') + forward;
                    if (data[i].length() - current.length() + j >= 0) {
                        sum += (data[i].charAt(data[i].length() - current.length() + j) - '0');
                    }
                    if (sum >= 10) {
                        forward = 1;
                    }
                    else {
                        forward = 0;
                    }
                    sum = sum % 10;
                    current.setCharAt(j, (char)('0' + sum));
                }
                if (forward == 1) {
                    current.insert(0, 1);
                }
                if (seen.contains(current.toString())) {
                    System.out.println("INSOMNIA");
                    break;
                }
                else {
                    seen.add(current.toString());
                    for (int index = 0; index < current.length(); index++) {
                        set.add(current.charAt(index) - '0');
                    }
                }
            }
            if (set.size() == 10) {
                System.out.println(current.toString());
            }
        }
    }
}
