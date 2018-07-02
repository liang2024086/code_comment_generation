package methodEmbedding.Speaking_in_Tongues.S.LYD195;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Tobi
 */
public class GoogleCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] mapping = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'}; 
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine(); //ignore the line with the int
        for(int t = 1; t <= T; t++) {
            if(s.hasNextLine()){
                System.out.print("Case #" + t + ": ");
                String line = s.nextLine();
                for(int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == 32)
                        System.out.print(' ');
                    else
                        System.out.print(mapping[(line.charAt(i)) - 97]);
                }
                System.out.print("\n");
            }
        }
    }
}
