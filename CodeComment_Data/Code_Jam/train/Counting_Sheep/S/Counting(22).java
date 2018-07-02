package methodEmbedding.Counting_Sheep.S.LYD1112;

import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            if (N == 0) {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
            } else {
                if (N == 1) {
                    System.out.println("Case #" + (i + 1) + ": " + 10);
                } else if (N == 2) {
                    System.out.println("Case #" + (i + 1) + ": " + 90);
                } else {
                    int j = 1, nb = N, p = 0;
                    //char[] tab = new char[10];
                    Vector<Character> tab=new Vector<>();
                    boolean contin = false;
                    while (contin==false) {
                        nb = N * j;
                        String ch = String.valueOf(nb);
                        //pacourir la chaine
                        for (int k = 0; k < ch.length(); k++) {
                            //parcourir le tableau
                            int l = 0;
                            for (l = 0; l < tab.size(); l++) {
                                if (ch.charAt(k) == tab.get(l)) {
                                    break;
                                }
                            }
                            //ajouter elts 
                            if (l == tab.size()) {
                                tab.add(ch.charAt(k));
                            }
                        }
                        if (tab.size() == 10) {
                            contin = true;
                        }
                        j++;
                    }
                    System.out.println("Case #" + (i + 1) + ": " + nb);
                }
            }
        }
    }

}
