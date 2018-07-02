package methodEmbedding.Standing_Ovation.S.LYD423;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elias_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new File("as.in"));
        int t = Integer.parseInt(in.nextLine());
        int m = 0, k = 0;

        for (int i = 0; i < t; i++) {

            int max = in.nextInt();

            String s = in.nextLine().trim();
            k = 0;
            m = 0;

            for (int j = 0; j < (max + 1); j++) {
                //System.out.println(s.charAt(j));
                m += Integer.parseInt(s.charAt(j) + "");
                if (m <= j) {
                    k++;
                    m++;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + k);

        }
    }
}
