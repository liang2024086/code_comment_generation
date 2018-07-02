package methodEmbedding.Standing_Ovation.S.LYD614;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Prih on 2015-04-11.
 */
public class StandingOvationGoogle {
    public static void main(String[] args) {
        String inFile = "C:\\Users\\Prih\\Downloads\\A-small-attempt1.in";
        String outFile = "C:\\Users\\Prih\\Downloads\\A-small-attempt1.out";
       // String inFile = "C:\\Users\\Prih\\Downloads\\prih.txt";
       // String outFile = "C:\\Users\\Prih\\Downloads\\prih2.out";
        File file;
        file = new File(inFile);
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.exit(-1);
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(outFile));
        } catch (IOException e) {
            System.exit(-1);
        }
        int cases = Integer.parseInt(scan.nextLine());
        System.out.println("Cases: " + cases + "\n");

        for (int i = 1; i <= cases; i++) {
            String line = scan.nextLine();

            ArrayList<String> list = new ArrayList<String>();
            for (String word : line.split(" ")) {
                list.add(word);
            }
            System.out.println("Input: " + list.get(1));
            int morePeople = 0, totalPeople = 0, x = 0;
            String number = list.get(1);
            StringBuilder r = new StringBuilder();

            for (int j = 0; j < number.length(); j++) {
                r.append(number.charAt(j));
                x = Integer.parseInt(r.toString());
                if (j > totalPeople && (x!=0) ) {
                    morePeople += (j - totalPeople);
                    totalPeople += morePeople;
                }

                totalPeople += x;
                System.out.println("total p: "+totalPeople);

                r.deleteCharAt(0);
            }

            System.out.println("Case #" + i + ": " + morePeople);
            try {
                bw.write("Case #" + i + ": " + morePeople + "\n");
                bw.flush();
            } catch (IOException t) {
                System.exit(-1);
            }
        }

    }
}
