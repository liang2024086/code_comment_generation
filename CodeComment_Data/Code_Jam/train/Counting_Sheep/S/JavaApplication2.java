package methodEmbedding.Counting_Sheep.S.LYD653;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mamunul
 */
public class JavaApplication2 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int testCase = Integer.parseInt(sc.nextLine());

        for (int te = 1; te <= testCase; te++) {

            int n = Integer.parseInt(sc.nextLine());

            ArrayList<Integer> d = new ArrayList<Integer>();

            if (n == 0) {
                System.out.println("Case #" + te + ": " + "INSOMNIA");

            } else {
                int i = 1;
                String c = null;
                while (d.size() != 10) {

                    int n2 = i * n;
                    i++;

                    c = String.valueOf(n2);

                    for (int j = 0; j < c.length(); j++) {

                        String s = c.substring(j, j + 1);

                        Integer k = Integer.parseInt(s);
                        
//                        System.out.println("k:"+k+" s:"+s);

                        if (!d.contains(k)) {
                            d.add(k);
//                            System.out.println("k1:"+k+" s:"+s);
                        }
                    }

                }
                System.out.println("Case #" + te + ": " + c);
            }
        }
    }

}
