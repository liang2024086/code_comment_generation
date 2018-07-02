package methodEmbedding.Revenge_of_the_Pancakes.S.LYD522;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class b {
    static String in = "src/B-small-attempt0.in";
    static String out = "src/b.out";
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File(in));
        BufferedWriter write = new BufferedWriter(new FileWriter(out));
        int numlines = scan.nextInt();
        for(int line = 1; line <= numlines; line++) {
            int numGroups = 0;
            boolean firstHappy;
            boolean happy = false;
            
            String string = scan.next();
            for(int x = 0; x < string.length(); x++) {
                char cake = string.charAt(x);
                if(cake == '+') {
                    if(numGroups == 0) {
                        firstHappy = true;
                        happy = true;
                        numGroups = 1;
                    } else if(!happy) {
                        numGroups++;
                        happy = true;
                    }
                } else {
                    if(numGroups == 0) {
                        firstHappy = false;
                        happy = false;
                        numGroups = 1;
                    } else if(happy) {
                        numGroups++;
                        happy = false;
                    }
                }
            }
            
            int answer = numGroups;
            if(happy) {
                answer--;
            }
            
            write.write("Case #" + line + ": ");
            write.write(Integer.toString(answer));
            write.write("\n");
        }
        scan.close();
        write.close();
    }
}
