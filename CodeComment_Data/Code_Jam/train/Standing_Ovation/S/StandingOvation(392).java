package methodEmbedding.Standing_Ovation.S.LYD545;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class StandingOvation {

    static int T;
    static String s;
    static int smax;
    
    public static void main(String[] args) {
        Scanner scan;

        try {
            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            scan = new Scanner(new File("input.txt"));
            
            T = scan.nextInt();
            
            for (int t=0; t<T; t++) {
                smax = scan.nextInt();
                s = scan.next();
                int numStanding = 0;
                int numAdded = 0;
                
                for (int i=0; i<s.length(); i++) {
                    if (i==0) {
                        numStanding += s.charAt(0) - '0';
                        continue;
                    }
                    
                    if (s.charAt(i) == '0') {
                        continue;
                    }
                    
                    if (numStanding + numAdded >= i) {
                        numStanding += s.charAt(i) - '0';
                        
                    } else {
                        numAdded += i - numStanding - numAdded;
                        numStanding += s.charAt(i) - '0';
                    }
                }
                
                out.write("Case #" + (t+1) + ": " + numAdded + "\n");
                out.flush();
            }
            

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
