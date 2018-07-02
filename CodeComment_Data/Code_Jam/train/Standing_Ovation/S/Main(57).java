package methodEmbedding.Standing_Ovation.S.LYD711;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Babak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Number of cases
        int T = Integer.parseInt(sc.nextLine());

        //for each case
        for (int i = 0; i < T; i++) {
            int result = 0;
            int Smax = sc.nextInt();
            String s = sc.next();

            int peopleStanding = 0;
            for (int j = 0; j < Smax + 1; j++) {
                int toStand = (s.charAt(j) - 48);
                if (peopleStanding >= j) {
                    peopleStanding += toStand;
                } else {
                    result += (j - peopleStanding);
                    peopleStanding += (j - peopleStanding);
                    peopleStanding += toStand;
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + result);
        }
    }

}
