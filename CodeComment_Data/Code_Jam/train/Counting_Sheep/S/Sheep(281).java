package methodEmbedding.Counting_Sheep.S.LYD1653;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bachu
 */
public class Sheep {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("sheep.in"));
        PrintWriter writer = new PrintWriter(new File("sheep.out"));
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            boolean seen[] = new boolean[10];
            for (int j = 0; j < 10; j++) {
                seen[j] = false;
            }
            int s = 0;
            int num = scan.nextInt();
            if (num == 0) {
                writer.write(String.format("Case #%d: INSOMNIA%n", i + 1));
                continue;
            }
            int result = num;
            while (s != 10) {
                int asd = result;
                while(asd != 0) {
                if (!seen[asd % 10]) {
                    s++;
                    seen[asd % 10] = true;
                }
                asd/=10;
                }
                result += num;
            }
            writer.write(String.format("Case #%d: %d%n", i+1, result-num));
        }
        writer.close();
    }
}
