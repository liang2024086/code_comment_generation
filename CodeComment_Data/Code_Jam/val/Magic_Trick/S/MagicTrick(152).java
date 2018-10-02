package methodEmbedding.Magic_Trick.S.LYD888;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author donk
 */
public class MagicTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int count = 0;
            String value = "";
            int guess1 = Integer.parseInt(sc.nextLine());
            String str1 = "";
            for (int j = 1; j <= 4; j++) {
                String temp = sc.nextLine();
                if (guess1 == j) {
                    str1 = temp;
                }
            }

            int guess2 = Integer.parseInt(sc.nextLine());
            String str2 = "";
            for (int j = 1; j <= 4; j++) {
                String temp = sc.nextLine();
                if (guess2 == j) {
                    str2 = temp;
                }
            }
            String[] strArr1 = str1.split(" ");
            String[] strArr2 = str2.split(" ");

            for (int j = 0; j < strArr1.length; j++) {
                for (int k = 0; k < strArr2.length; k++) {
                    if (strArr1[j].equals(strArr2[k])) {
                        count++;
                        value = strArr2[k];
                    }
                }
            }
            if (count == 1) {
                System.out.println("Case #" + (i + 1) + ": " + value);
            } else if (count > 1) {
                System.out.println("Case #" + (i + 1) + ": Bad magician!");
            } else {
                System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            }

        }
    }
}
