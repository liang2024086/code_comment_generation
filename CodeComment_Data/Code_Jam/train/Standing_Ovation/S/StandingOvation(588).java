package methodEmbedding.Standing_Ovation.S.LYD292;

import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ouedraog
 */
public class StandingOvation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            int Smax = sc.nextInt();
            String str = sc.nextLine().trim();
            int[] S = new int[Smax+1];
            for(int j=0; j<Smax+1; j++){
                S[j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            
            int solution = 0;
            int stoodUp = 0;
            if(S[0]==0){
                stoodUp++;
                solution++;
            }
            else{
                stoodUp+=S[0];
            }
            for (int shyness = 1; shyness <= Smax ; shyness++) {
 
                if( shyness > stoodUp || (shyness==stoodUp && S[shyness]==0)){
                    solution++;
                    stoodUp++;
                }
                else{
                    stoodUp +=S[shyness];
                }
                
            }

            System.out.println("Case #" + (i + 1) + ": " + solution);
        }
    }
}
