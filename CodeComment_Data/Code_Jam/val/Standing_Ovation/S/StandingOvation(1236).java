package methodEmbedding.Standing_Ovation.S.LYD1053;


import java.io.*;
import java.util.List;
import java.lang.String;

/**
 * Created by Tridip on 11-04-2015.
 */


public class StandingOvation {

    public static void main(String args[]) throws IOException {
        //File file = new File("practice.in");
        //File outFile = new File("practice.out");

        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("A-output.txt"));


        int testCases = Integer.parseInt(br.readLine());
        for(int t=1;t<=testCases;t++) {

            String input = (br.readLine());
            String arr[] = input.split(" ");
            int length = Integer.parseInt(arr[0]);
            String str = arr[1];

            int count = 0, reqdCount = 0, need = 0, totalNeed = 0, current;
            for (int i = 0; i < (length+1); i++) {

                current = Character.getNumericValue(str.charAt(i));

                if (reqdCount > count && current != 0) {
                    need = reqdCount - count;
                    count = count + need;
                    totalNeed += need;
                }
                count += current;
                reqdCount++;
            }
            //System.out.println(totalNeed);
            bw.write("Case #" + t +": "+totalNeed + "\r\n");

        }
        bw.close();
        br.close();
    }

}
