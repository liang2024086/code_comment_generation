package methodEmbedding.Magic_Trick.S.LYD1479;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Trung
 */
public class Practice1_Proba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inf = new Scanner(new FileReader("I:\\Java\\Practice1 _ Proba\\src\\practice1\\_\\proba\\A-small-attempt0.in.in")); 
        PrintWriter outf = new PrintWriter("I:\\Java\\Practice1 _ Proba\\src\\practice1\\_\\proba\\A-small.out");
        int caseno = inf.nextInt();
        
        for (int cases = 1; cases<=caseno;cases++) {
            inf.nextLine();
            boolean cheat = true;
            boolean bad = false;
            int a = inf.nextInt();
            int first[][] = new int[4][4];
            int second[][] = new int[4][4];
            for (int i = 0; i<4;i++ ){
                inf.nextLine();
                for (int j = 0; j<4;j++ ) {
                    first[i][j] = inf.nextInt();
                 
                }
                             
                
            }
            inf.nextLine();
            int b = inf.nextInt();
            for (int i = 0; i<4;i++ ){
                inf.nextLine();
                for (int j = 0; j<4;j++ ) {
                    second[i][j] = inf.nextInt();
                 
                }
                             
                
            }
            int count = 0;
            int card = 0;
            for (int i = 0; i<4;i++ ) {
                for (int j = 0; j<4;j++ ) {
                    if (first[a-1][i] == second[b-1][j]) {
                        cheat = false;
                        count++;
                        card = first[a-1][i];
                    }
                }
            }
            if (cheat) {
                outf.println("Case #"+cases+": Volunteer cheated!");
            } else if (count > 1) {
                 outf.println("Case #"+cases+": Bad magician!");
            } else {
                outf.println("Case #"+cases+": "+card);
            }
        }    
        inf.close();
        outf.close();
    }
    
}
