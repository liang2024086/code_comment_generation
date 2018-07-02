package methodEmbedding.Magic_Trick.S.LYD826;

import java.io.*;
import java.util.*;

class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("A.in"));
        int t = sc.nextInt();

        for (int nt = 1; nt <= t; nt++) {
            int [] cards = new int[16 + 1];

            for (int k = 0; k < 2; k++) {
                int guess = sc.nextInt();

                for (int i = 1; i <= 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        int num = sc.nextInt();
                        if (i == guess) {
                            cards[num]++;
                        }
                    }
                }
            }

	    int have = 0;
	    int value = 0;
	    for (int i = 0; i < cards.length; i++)
		if (cards[i] == 2) {
		    have++;
		    value = i;
		}
	    System.out.format("Case #%d: ", nt);
	    if (have == 0)
		System.out.println("Volunteer cheated!");
	    else if (have == 1)
		System.out.println(value);
	    else if (have > 1)
		System.out.println("Bad magician!");
        }
        sc.close();
    }
}
