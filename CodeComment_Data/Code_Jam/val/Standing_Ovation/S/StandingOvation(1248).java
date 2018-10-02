package methodEmbedding.Standing_Ovation.S.LYD345;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Udara
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("A-small-attempt3.in")));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        
        int T = Integer.parseInt(sc.next());
        
        for(int test = 0; test < T ; test++){
            
            int sMax = Integer.parseInt(sc.next());
            String aud = sc.next();

            int totStand = 0;
            int take = 0;
            for(int s = 0; s <= sMax; s++){
                int l = aud.charAt(s) - '0';
                if(s <= totStand) totStand += l;
                else if(l>0){
                    take += s - totStand;
                    totStand += take + l;
                }
            }
            System.out.println("Case #"+(test+1)+": "+take);
            bw.write("Case #"+(test+1)+": "+take);
            if(test != T-1) bw.newLine();
        }
        sc.close();
        bw.close();
    }
    
}
