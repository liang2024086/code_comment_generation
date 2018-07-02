package methodEmbedding.Counting_Sheep.S.LYD1516;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a {
    static String in = "src/A-small-attempt0.in";
    static String out = "src/a.out";
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File(in));
        BufferedWriter write = new BufferedWriter(new FileWriter(out));
        int numlines = scan.nextInt();
        for(int line = 1; line <= numlines; line++) {
            int num = scan.nextInt();
            
            int maxMult = Math.max(1000, num);
            boolean seen[] = new boolean[10];
            int seenCount = 0;
            
            int sum = 0;
            outer: for(int x = 0; x < maxMult; x++) {
                sum += num;
                String str = Integer.toString(sum);
                for(int y = 0; y < str.length(); y++) {
                    if(!seen[str.charAt(y) - '0']) {
                        seen[str.charAt(y) - '0'] = true;
                        seenCount++;
                        if(seenCount == 10) {
                            break outer;
                        }
                    }
                }
            }
            
            write.write("Case #" + line + ": ");
            if(seenCount == 10) {
                write.write(Integer.toString(sum));
            } else {
                write.write("INSOMNIA");
            }
            write.write("\n");
        }
        scan.close();
        write.close();
    }
}
