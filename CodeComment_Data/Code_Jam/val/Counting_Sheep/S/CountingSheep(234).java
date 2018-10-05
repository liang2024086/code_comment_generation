package methodEmbedding.Counting_Sheep.S.LYD72;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhavishyasharma
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            for (int i = 0; i < t; i++) {
                int N = input.nextInt();
                if (N != 0) {
                    int sum = N;
                    int temp;
                    boolean[] flags = new boolean[10];
                    boolean completed = false;
                    while (!completed) {
                        temp = sum;
                        while (temp > 0) {
                            flags[temp % 10] = true;
                            temp = temp / 10;
                        }
                        sum = sum + N;
                        completed = true;
                        for (int j = 0; j < 10; j++) {
                            if (flags[j] == false) {
                                completed = false;
                            }
                        }
                    }
                    System.out.printf("Case #%d: %d\n", i + 1, sum - N);
                }
                else{
                    System.out.printf("Case #%d: %s\n", i + 1, "INSOMNIA");
                }
            }
    }

}
