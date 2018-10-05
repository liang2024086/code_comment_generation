package methodEmbedding.Standing_Ovation.S.LYD2097;


import java.io.*;
import java.util.Scanner;

/**
 * Created by Sushant.Deshpande on 4/11/2015.
 */
public class StandingOvation {
    public static void main(String [] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(args[0])));
        int tests = scanner.nextInt();
        FileWriter fileWriter = new FileWriter(args[0].substring(0, args[0].indexOf(".")) + ".out");
        for(int i = 0; i < tests; i++) {
            int friends_needed = 0;
            int smax = scanner.nextInt() + 1;
            char [] shynessString = scanner.next().toCharArray();
            int [] shy_person_count = new int[smax];
            for(int j = 0; j < smax; j++) {
                shy_person_count[j] = Integer.parseInt(shynessString[j] + "");
            }
            int standing_persons = shy_person_count[0];
            for(int k = 1; k < smax; k++) {
                if(standing_persons < k) {
                    friends_needed = friends_needed + (k - standing_persons);
                    standing_persons = standing_persons + shy_person_count[k] + 1;
                } else {
                    standing_persons = standing_persons + shy_person_count[k];
                }

            }
           fileWriter.write("Case #" + (i + 1) + ": " + friends_needed);
            fileWriter.write("\n");
            fileWriter.flush();
        }
        fileWriter.close();
       scanner.close();

    }


}
