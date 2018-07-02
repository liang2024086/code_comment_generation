package methodEmbedding.Speaking_in_Tongues.S.LYD18;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Eunice
 */
public class Speaking_In_Tongues {

    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out;

    
    public static void main(String[] args) {

        try {
             out = new PrintWriter(new FileWriter("C:\\Users\\Eunice\\Desktop\\Code Jam\\CodeJam Outputs\\Speaking_In_Tongues.txt" ));
        }
        catch (Exception ex) {

        }

        int noTestCases = scanner.nextInt();

        char[] alphabets =            {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] googlerese_alphabets = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};

        scanner.skip("\n");
        for(int i = 0; i < noTestCases; i++) {
            String nextLine = scanner.nextLine();
            char[] googlerese_String = new char[nextLine.length()];
            for(int n = 0; n < nextLine.length(); n++) {
                for(int a = 0; a < googlerese_alphabets.length; a++) {
                    if(nextLine.charAt(n) == googlerese_alphabets[a]) {
                        googlerese_String[n] = alphabets[a];
                    }
                }
            }
            String toString = String.valueOf(googlerese_String);
            
            
            
            out.println("Case #" + (i + 1) + ": " + toString);
        }

        out.close();
       
        
    }

}
