package methodEmbedding.Revenge_of_the_Pancakes.S.LYD845;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Rahmad Arifan Hr
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 0; k < T; k++) {
            String teks = sc.next();
            String a[] = teks.split("");
            int hitung = 0;
            String status = a[0];
            if (status.equals("-")) {
                hitung = 1;
            }
            for (int i = 0; i < a.length; i++) {

                if (a[i].equals(status)) {

                } else if (status.equals("+") && a[i].equals(("-"))) {
                    hitung += 2;
                    status = a[i];
                } else if (status.equals("-") && a[i].equals(("+"))) {
                    status = a[i];
                } else {
                    hitung += 2;
                    status = a[i];
                }
            }
            System.out.println("Case #"+(k+1)+": "+hitung);

        }
    }
}
