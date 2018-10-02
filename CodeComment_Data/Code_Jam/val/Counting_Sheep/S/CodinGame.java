package methodEmbedding.Counting_Sheep.S.LYD761;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Pawel
 */

public class CodinGame {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t,n;
        t = in.nextInt();
        //boolean []digits;
        //digits = new boolean[]{false,false,false,false,false,false,false,false,false,false};
        
        
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            boolean []digits;
            digits = new boolean[]{false,false,false,false,false,false,false,false,false,false};
            if(n == 0)
                System.out.println("Case #" + (i+1) + ": INSOMNIA");
            else {
                int j = 1;
                while(true) {
                    String number = String.valueOf(n*j);
                    
                    int k = 0;
                    for(boolean digit : digits) {
                        if(digit == false) {
                            int index = number.indexOf(k + "");
                            if(index != -1) {
                                digits[k] = true;
                            }
                        }
                        k++;
                    }
                    boolean end = true;
                    for(k = 0; k < 10; k++) {
                        if(digits[k] == false)
                            end = false;
                    }
                    if(end) {
                        System.out.println("Case #" + (i+1) + ": " + number);
                        break;
                    }
                    j++;
                }
            }
        }
        
    }
}
