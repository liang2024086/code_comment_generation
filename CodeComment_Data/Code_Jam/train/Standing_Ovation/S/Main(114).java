package methodEmbedding.Standing_Ovation.S.LYD2052;

/*
 * Author: Junaid Sheikh
 * Codejam ID: dijinero
 */


import java.util.*;
import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(new File("E:/CodePractice/codejam/codejam_ovation/testfiles/A-small-attempt5.in"));
        int T = in.nextInt();
        for(int t = 1; t <= T; t++){

            int sMax = in.nextInt();
            String s = in.next();

            int currAdd = 0;
            int total = Character.getNumericValue(s.charAt(0));
            int totalAdded = 0;

            for(int i = 1; i < s.length(); i++){
                if (i > total){
                    totalAdded += i - total;
                    total = i;
                }
                total+=Character.getNumericValue(s.charAt(i));
            }
            System.out.println("Case #" + t + ": " + totalAdded);


        }
    }
}
