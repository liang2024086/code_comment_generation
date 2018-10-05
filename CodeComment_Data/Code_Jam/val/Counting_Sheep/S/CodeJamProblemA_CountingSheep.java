package methodEmbedding.Counting_Sheep.S.LYD741;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author BayuWPP
 */
public class CodeJamProblemA_CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int n;
        int x;
        String cek;
        String ket = "";
        
        for (int i = 1; i <= T; i++) {
            boolean b_0 = false, b_1 = false, b_2 = false, b_3 = false, b_4 = false,
                b_5 = false, b_6 = false, b_7 = false, b_8 = false, b_9 = false;
            x = 0;
            n = input.nextInt();            
            for (int j = 1; j <= 999999; j++) {
                if(b_0 && b_1 && b_2 && b_3 && b_4 && b_5 && b_6 && b_7 && b_8 && b_9){
                    break;
                }
                x = n * (j);
                cek = String.valueOf(x);
                
                if (cek.contains("0")) {
                    b_0 = true;
                }
                if (cek.contains("1")) {
                    b_1 = true;
                }
                if (cek.contains("2")) {
                    b_2 = true;
                }
                if (cek.contains("3")) {
                    b_3 = true;
                }
                if (cek.contains("4")) {
                    b_4 = true;
                }
                if (cek.contains("5")) {
                    b_5 = true;
                }
                if (cek.contains("6")) {
                    b_6 = true;
                }
                if (cek.contains("7")) {
                    b_7 = true;
                }
                if (cek.contains("8")) {
                    b_8 = true;
                }
                if (cek.contains("9")) {
                    b_9 = true;
                }                
            }
            if (b_1 && b_2 && b_3 && b_4 && b_5 && b_6 && b_7 && b_8 && b_9) {
                System.out.println("Case #" + i + ": " + x);
            } else {
                System.out.println("Case #" + i + ": INSOMNIA");
            }
        }

    }

}
