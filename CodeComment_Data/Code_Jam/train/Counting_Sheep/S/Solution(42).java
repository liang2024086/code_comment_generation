package methodEmbedding.Counting_Sheep.S.LYD386;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        File f = new File(args[0]);
        Hashtable<Integer, Integer> map = new Hashtable<>();
        try (Scanner in = new Scanner(new FileInputStream(f));
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(new File(args[0] + ".out")))) {
            int T = in.nextInt();
            for (int i = 0; i < T; i++) {
                int N = in.nextInt();
                String last = "INSOMNIA";
                
                if (N > 0) {
                    last = "";
                    int[] marked = new int[10];
                    int numMarked = 0;
                    int MN = 0;
                    while (numMarked < 10) {
                        MN += N;
                        int temp = MN;
//                        last = last + temp + " ";
                        while (temp != 0) {
                            int d = temp % 10;
                            temp = (temp - d)/10;
                            if (marked[d] == 0) {
                                marked[d] = 1;
                                numMarked++;
                            }
                        }
                        last = "" + MN;
                    }
                }
                
                String str = "Case #" + (i + 1) + ": " + last;
                out.write(str);
                out.newLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
