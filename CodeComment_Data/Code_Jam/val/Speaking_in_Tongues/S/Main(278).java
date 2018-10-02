package methodEmbedding.Speaking_in_Tongues.S.LYD1222;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Saul Hidalgo
 */
public class Main {

    public static char[] map = {'y','h','e','s','o','c','v'
            ,'x','d','u','i','g','l','b','k','r','z','t','n'
            ,'w','j','p','f','m','a','q'};

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("test.txt"));
            PrintStream ps = new PrintStream(new File("output.txt"));

            int T = sc.nextInt();
            sc.nextLine();
            
            for ( int t = 1 ; t <= T ; t++ ){
                String line = sc.nextLine();
                String msg = "";
                for (int i = 0; i < line.length(); i++) {
                    msg += line.charAt(i)==' '?' ':map[line.charAt(i)-'a'];
                }
                ps.println("Case #" + t + ": " + msg);
            }
        } catch (FileNotFoundException ex) {
            // =(
        }
        
    }

}
