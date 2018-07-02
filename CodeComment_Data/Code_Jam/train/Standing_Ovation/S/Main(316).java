package methodEmbedding.Standing_Ovation.S.LYD2111;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Standing Ovation
 */
public class Main {
    public static void main(String[] args) throws Exception {


        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("outAsmall.txt"));

        ArrayList<Integer> noShy = new ArrayList();
        int cases = in.nextInt();
        for (int c = 1; c <= cases; c++) {
            //Getting info
            int Smax = in.nextInt();  //max shy level
            String digits = in.nextLine().substring(1);
            for (int k = 0; k <= Smax; k++)
                noShy.add(Character.getNumericValue(digits.charAt(k)));
            //Determining answer
            int noFriends = 0;
            int sum = 0;
            int first = noShy.get(0);
            if(first == 0) {
                noFriends++;
                noShy.set(0,++first);
            }
            sum += noShy.get(0);
            for(int k = 1; k <= Smax; k++){
                if(sum < k) {
                    int add = k - sum;
                    noFriends += add;
                    sum += add;
                }
                sum += noShy.get(k);
            }
            out.println("Case #" + c + ": " + noFriends);
            noShy.clear();
        }
        out.close();
        in.close();

    }


}

