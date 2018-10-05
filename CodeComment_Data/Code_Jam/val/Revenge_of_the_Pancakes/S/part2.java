package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1159;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by wing on 4/8/16.
 */
public class part2 {

    public static void main(String[] args) throws Exception {
        String inFile = "A-large.in";
        String outFile = "B-large-practice.out";

        Scanner sc = new Scanner(new File(inFile));
        PrintWriter writer = new PrintWriter(outFile);
        int numTest = sc.nextInt();
        for (int test=1; test<=numTest; test++) {
            String input = sc.next();
            boolean[] in  = new boolean[input.length()];
            int count = 0;
            for(int i = 0; i< input.length(); i++){
                if(input.charAt(i)=='-'){
                    in[i] = false;
                }else{
                    in[i] = true;
                }
            }

            int current = 1;

            while(current<in.length){
                while(current<in.length&&in[current]==in[current-1]){
                    current++;
                }
                if (current>=input.length()) {

                    break;
                }

                in[current-1] = !in[current-1];
                count++;
            }
            if(!in[in.length-1])
                count++;
            writer.println("Case #"+test+": "+count);

        }
        writer.close();
    }
}
