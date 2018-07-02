package methodEmbedding.Counting_Sheep.S.LYD73;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author mazenbadr
 */
public class CountingSheep_GCJ_Q2016_PA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = in.nextInt();
            if (N == 0) {
                System.out.println("Case #" + t + ": INSOMNIA");
            } else {
                HashSet<Character> set = new HashSet<>();
                int result = 0;
                while (set.size() != 10) {
                    result += N;
                    for (Character digit : Integer.toString(result).toCharArray()) {
                        set.add(digit);
                    }
                }
                System.out.println("Case #" + t + ": " + result);
            }
        }
    }

}
