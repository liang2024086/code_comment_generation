package methodEmbedding.Standing_Ovation.S.LYD95;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author dajavax
 */
public class StandingOvation {
    private static Scanner keyboard=new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iterations = Integer.parseInt(keyboard.next());
        for(int i = 1; i<=iterations; i++){
            keyboard.next();
            int total = 0;
            int additional = 0;
            char[] shyness = keyboard.next().toCharArray();
            for(int j = 0; j<shyness.length; j++){
                if(shyness[j]!='0') {
                    while(j>total){
                        additional++;
                        total++;
                    }
                }
                total += shyness[j]-'0';
            }
            System.out.println("Case #"+i+": "+additional);
        }
    }
    
}
