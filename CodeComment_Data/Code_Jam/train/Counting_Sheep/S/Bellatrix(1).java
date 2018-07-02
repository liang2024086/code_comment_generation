package methodEmbedding.Counting_Sheep.S.LYD1147;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yusuf H
 */
public class Bellatrix {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("A-small-attempt1.in");
        Scanner in = new Scanner(file);

        int t = in.nextInt();
        if (t >= 1 && t <= 100) {
            int n[] = new int[t];

            for (int i = 0; i < t; i++) {
                n[i] = in.nextInt();
            }

            for (int i = 0; i < t; i++) {
                if (n[i] <= 1000000 && n[i] != 0) {
                    boolean findStatus[] = new boolean[10];
                    for (int j = 1; j < 1000000000 && j >= 1; j++) {
                        String result = Integer.toString(n[i] * j);
                        for (int l = 0; l < 10; l++) {
                            if (!findStatus[l]) {
                                if (result.contains(Integer.toString(l))) {
                                    findStatus[l] = true;
                                }
                            }
                        }
                        for (int k = 0; k < 10; k++) {
                            if (k < 9 && !findStatus[k]) {
                                break;
                            } else if (k == 9 && findStatus[k]) {
                                j = -1;
                                System.out.println("Case #" + (i + 1) + ": " + result);
                            }
                        }
                    }
                } else if (n[i] == 0) {
                    System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
                }
            }
        }
    }
}
