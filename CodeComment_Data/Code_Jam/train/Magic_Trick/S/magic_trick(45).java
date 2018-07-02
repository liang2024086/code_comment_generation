package methodEmbedding.Magic_Trick.S.LYD2003;

import java.io.*;
import java.util.*;
import java.math.*;

public class magic_trick {

    static Scanner in;
    static BufferedWriter out;


    public static void main(String[] args) throws IOException {
        
        in = new Scanner(new File("magic_trick.in"));
        out = new BufferedWriter(new FileWriter("magic_trick.out"));

        int length = in.nextInt();

        for (int test = 0; test < length; test++) {

            int row = in.nextInt();
            int[] potential = new int[4];
            int dump;

            boolean done = false;
            boolean bad = false;
            int[] result = new int[4];

            int output = -1;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (row-1 == i) {
                        potential[j] = in.nextInt();
                    } else {
                        dump = in.nextInt();
                    }
                }
            }
            System.out.println(Arrays.toString(potential));  
            row = in.nextInt();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (row-1 == i) {
                        result[j] = in.nextInt();
                    } else {
                        dump = in.nextInt();
                    }
                }
            }

            System.out.println(Arrays.toString(result)); 
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (result[i] == potential[j]) {
                        if (!done) {
                            output = result[i];
                            done = true;
                        } else {
                            bad = true;
                        }
                    }
                }
            }

            if (bad) {
                out.write("Case #" + (test + 1) + ": Bad magician!\n");
            } else if (done) {
                out.write("Case #" + (test + 1) + ": " + output + "\n");
            } else {
                out.write("Case #" + (test + 1) + ": Volunteer cheated!\n");
            }
        }

        in.close();
        out.close();
    }

}    
