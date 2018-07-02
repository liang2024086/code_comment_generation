package methodEmbedding.Standing_Ovation.S.LYD910;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
 
public class StandingOvation {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("A-small-attempt3.in"));
            PrintWriter writer = new PrintWriter("A-small-attempt3.out");
 
            // read the first line
            int num_test_cases = Integer.parseInt(br.readLine());

            int min_num   = 0;
            int curr_num  = 0;
            int total     = 0;

            int curr_max_shy;
 
            for(int i = 0; i < num_test_cases; i++) {
                // split each line into a temp array
                String temp[] = br.readLine().split(" ");
                int max_shy   = Integer.parseInt(temp[0]);

                for(int j = 0; j < max_shy; j++) {
                    int k = j+1;
                    curr_num = Character.getNumericValue(temp[1].charAt(j));
                    total += curr_num;
                    if(total < k) {
                        min_num += (k-total);
                    }
                    if(k-total > 0) {
                        total += (k-total);
                    }
                }

                writer.println("Case #" + (i+1) + ": " + min_num);

                // reset vars
                min_num  = 0;
                total    = 0;
            }
 
            br.close();
            writer.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
