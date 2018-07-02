package methodEmbedding.Counting_Sheep.S.LYD395;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author DUC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        File file = new File("D:/A-small-attempt0.in");
        try {
            Scanner input = new Scanner(file);

            int T = input.nextInt();
            long MAX_NUMBER = Long.MAX_VALUE;
            Vector<Integer> flag = new Vector<Integer>();
            flag.setSize(10);

            for (int n = 0; n < T; n++) {
                int N = input.nextInt();
                long temp = 0;
                int count = 0;
                boolean isSleep = true;
                for (int i = 0; i < 10; i++) {
                    flag.set(i, 0);
                }
                while (temp < MAX_NUMBER && count < 10000) {
                    count++;
                    temp = count * N;
                    String str = Long.toString(temp);
                    for (int i = 0; i < str.length(); i++) {
                        flag.set(Character.getNumericValue(str.charAt(i)), 1);
                    }
                    isSleep = true;
                    for (int i = 0; i < 10; i++) {
                        if (flag.get(i) == 0) {
                            isSleep = false;
                            break;
                        }
                    }
                    if (isSleep) {
                        System.out.printf("Case #" + (n + 1) + ": " + temp + "\n");
                        break;
                    }
                }
                if (!isSleep) {
                    System.out.printf("Case #" + (n + 1) + ": INSOMNIA\n");
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
