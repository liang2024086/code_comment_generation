package methodEmbedding.Counting_Sheep.S.LYD666;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Elizabeth
 */
public class Prob1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num_cases = s.nextInt();
        for (int i = 1; i <= num_cases; i++) {
            int num = s.nextInt();
            if (num == 0) {
                System.out.println("Case #" + i + ": INSOMNIA");
            }else {
                boolean[] array = new boolean[10];
                boolean cont = true;
                int mult = 1;
                int num_;
                do {
                    num_ = num * mult;
                    do {
                        int pos = num_ % 10;
                        array[pos] = true;
                        num_ = num_ / 10;
                    } while (num_ >= 1);
                    mult += 1;
                    cont = false;
                    for (int j = 0; j<10; j++){
                        cont = cont || !array[j];
                    }
                } while (cont);
                System.out.println("Case #" + i + ": "+(num * (mult-1)));
            }
        }
        // TODO code application logic here
    }
    
}
