package methodEmbedding.Standing_Ovation.S.LYD1978;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class CodeJam {

    public static void main(String[] args) throws FileNotFoundException {
		//////////// Reader & Printer /////////////////
        //File file = new File("D-large.in");
        //File file = new File("D-large.in");
        File file = new File("A-small-attempt0.in");
        Scanner sc = new Scanner(file);
        
        
        
//        Scanner sc = new Scanner("4\n" +
//"4 11111\n" +
//"1 09\n" +
//"5 110011\n" +
//"0 1");
        //sc.useDelimiter("\n| ");
        
        
        
        PrintStream out = new PrintStream(new File("out.txt"));
		///////////////////////////////////////////////
        /////////Variable declaration///////////

        ///////////////////////////////////////
        for (int id = 1, khoi = sc.nextInt(); id <= khoi; id++) {
            sc.nextLine();
            int sMax = sc.nextInt();
            String shy = sc.next();
            int count = 0;
            int sum = 0;
            for (int i = 0; i <= sMax; i++) {
                int num =  Integer.parseInt(Character.toString(shy.charAt(i)));
                System.out.print("initial " + num + " ");
                if (sum < i) {
                    sum++;
                    count++;
                }
                System.out.print(sum);
                sum += num;
            }
            out.println("Case #" + id + ": " + count);

        }
        ///////////close reader & printer/////////////////
        sc.close();
        out.close();
    }

}
