package methodEmbedding.Magic_Trick.S.LYD1188;

import java.util.HashSet;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int answer = in.nextInt();
            HashSet<Integer> first = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                if (i == answer - 1) {
                    first.add(in.nextInt());
                    first.add(in.nextInt());
                    first.add(in.nextInt());
                    first.add(in.nextInt());
                }
                // Throw out input
                else {
                    in.nextInt();
                    in.nextInt();
                    in.nextInt();
                    in.nextInt();
                }
            }

            int answer2 = in.nextInt();
            HashSet<Integer> second = new HashSet<Integer>();
            for (int i = 0; i < 4; i++) {
                if (i == answer2 - 1) {
                    for (int j = 0; j < 4; j++) {
                        int next = in.nextInt();
                        if (first.contains(next)) {
                            second.add(next);
                        }
                    }
                }
                else {

                    in.nextInt();
                    in.nextInt();
                    in.nextInt();
                    in.nextInt();
                }

            }

            System.out.printf("Case #%d: ", t);

            if (second.size() == 1) {
                System.out.println(second.iterator().next());
            }
            else if (second.size() == 0) {
                System.out.println("Volunteer cheated!");
            }
            else {
                System.out.println("Bad magician!");
            }
        }

    }

}
