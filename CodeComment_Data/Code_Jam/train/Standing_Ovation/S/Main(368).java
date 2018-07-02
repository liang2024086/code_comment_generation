package methodEmbedding.Standing_Ovation.S.LYD523;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        int num_cases = sc.nextInt();
        for(int test = 0; test < num_cases; test++) {
            int len = sc.nextInt();
            String s = sc.next();
            int standing = Integer.parseInt(s.charAt(0) + "");
            int needed = 0;
            for(int shy = 1; shy < s.length(); shy++) {
                int extra = shy - standing;
                int num_at_shy = Integer.parseInt(s.charAt(shy)  + "");
                if(extra > 0) {
                    needed += extra;
                    standing = shy + num_at_shy;
                }
                else {
                    standing += num_at_shy;
                }
            }
            pw.println("Case #" + (test + 1) + ": " + needed);
        }
        pw.close();
    }
}
