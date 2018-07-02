package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1367;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 *
 * @author Alejandro E. Garces
 */
public class CookieClickerAlpha {

     /*
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        /*String file = "A-small-attempt0";
        System.setIn(new FileInputStream(file+".in"));
        System.setOut(new PrintStream(new FileOutputStream(file+"O.out")));*/
        
        /////////////////////
        //Input from Console
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner(System.in);
        
        String line = "";
        StringTokenizer r;
        int cases = Integer.parseInt(in.readLine());
        String answer = "";
        for (int cc = 1; cc <= cases; cc++) {

            System.out.println("Case #" + cc + ": " + answer);
        }
        in.close();
        System.exit(0);
    }
}
