package methodEmbedding.Revenge_of_the_Pancakes.S.LYD573;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Victor on 4/8/2016.
 */
public class flippingPancakes {
    public static void main(String [] args) {

        String filePath = "C:\\Users\\Victor\\IdeaProjects\\googleJam\\files\\B-small-attempt1.in";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Victor\\IdeaProjects\\googleJam\\files\\flippingPancakesResults.txt"));
            Integer n = Integer.parseInt(br.readLine());

            int count = 1;
            for (int nn = 0;  nn < n; nn++){
                String pancakes = br.readLine();

               // System.out.println(pancakes);
                int times = 0;

                while (pancakes.length() > 0) {
                    while (pancakes.length() > 0 && pancakes.charAt(pancakes.length() - 1) == '+') {
                        pancakes = pancakes.substring(0, pancakes.length() - 1);
                    }

                    if (pancakes.length() > 0) {
                        pancakes = pancakes.replace('+','~').replace('-','+').replace('~','-');
                        times++;
                    }
                    }

                bw.write("Case #" + count + ": " + times );
                bw.newLine();
                count++;

            }
            br.close();
            bw.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
