package methodEmbedding.Standing_Ovation.S.LYD1389;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Krisbianto Cahyo S
 */
public class StandingOvation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int smax = sc.nextInt();
            int total = 0;
            int need = 0;
            String s = sc.next();
            for (int j = 0; j <= smax; j++) {
                int k = Integer.parseInt(s.charAt(j) + "");
                if (k != 0 && total < j) {
                    need += (j - total);
                    total += (j - total);
                }
//                System.out.println(total + " " + need);
                if (j < smax) {
                    total += k;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + Math.max(0, need));
        }
    }

}
