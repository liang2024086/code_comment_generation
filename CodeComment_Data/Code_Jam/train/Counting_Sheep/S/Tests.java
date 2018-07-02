package methodEmbedding.Counting_Sheep.S.LYD192;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author selmi
 */
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int test = read.nextInt();
        int t[] = new int[test];
        for (int i = 0; i < test; i++) {
            t[i] = read.nextInt();
        }

        for (int i = 0; i < test; i++) {
            ArrayList list = new ArrayList();
            int start = t[i];
            String chaine = String.valueOf(start);
            for (int j = 0; j < chaine.length(); j++) {
                if (list.indexOf(Integer.valueOf(chaine.charAt(j) + "")) == -1) {
                    list.add(Integer.valueOf(chaine.charAt(j) + ""));
                }
            }
            int compteur = 2;
            if (start == 0) {
                System.out.println("Case #"+(i+1)+": INSOMNIA");
            } else {
                while (list.size() < 10) {
                    chaine = String.valueOf(start);
                    for (int j = 0; j < chaine.length(); j++) {
                        if (list.indexOf(Integer.valueOf(chaine.charAt(j) + "")) == -1) {
                            list.add(Integer.valueOf(chaine.charAt(j) + ""));
                        }
                    }
                    start = t[i]*(compteur++);
                    //System.out.println(start);
                }
                /*System.out.println("list");
                for (int j = 0; j < 10; j++) {
                    System.out.print(list.get(j)+"  ");
                }*/
                System.out.println("Case #"+(i+1)+": "+(start-t[i]));
            }
        }
    }
}
