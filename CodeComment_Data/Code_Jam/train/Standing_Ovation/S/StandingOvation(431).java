package methodEmbedding.Standing_Ovation.S.LYD803;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("StandingOvation.in"));
        PrintWriter output = new PrintWriter("StandingOvation.out");

        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int max = s.nextInt();
            String input = s.next();
            
            int friends = 0, standing = 0;
            for (int shyness = 0; shyness <= max; shyness++) {
                int count = Integer.valueOf(String.valueOf(input.charAt(shyness)));
                if (shyness > standing) friends = Math.max(friends, shyness - standing);
                standing += count;
            }
            
            output.println("Case #" + String.valueOf(i + 1) + ": " + String.valueOf(friends));
        }
        
        output.close();
        s.close();
    }
}
