package methodEmbedding.Magic_Trick.S.LYD183;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output;
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        int T = sc.nextInt();
        sc.nextLine();
        for (int t = 1; t <= T; t++) {
            set1.clear();
            set2.clear();
            int a = sc.nextInt();
            sc.nextLine();
            for (int i=1; i<=4; i++) {
                if (i==a) {
                    set1.add(sc.nextInt());
                    set1.add(sc.nextInt());
                    set1.add(sc.nextInt());
                    set1.add(sc.nextInt());
                }
                sc.nextLine();
            }
            int b = sc.nextInt();
            sc.nextLine();
            for (int i=1; i<=4; i++) {
                if (i==b) {
                    set2.add(sc.nextInt());
                    set2.add(sc.nextInt());
                    set2.add(sc.nextInt());
                    set2.add(sc.nextInt());
                }
                sc.nextLine();
            }
            set1.retainAll(set2);
            if (set1.size() == 1) {
                output = set1.toArray()[0].toString();
            } else if (set1.size() > 1) {
                output = "Bad magician!";
            } else {
                output = "Volunteer cheated!";
            }
            System.out.println("Case #" + t + ": " + output);
        }
    }
}
