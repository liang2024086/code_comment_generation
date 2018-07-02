package methodEmbedding.Speaking_in_Tongues.S.LYD913;



import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshuahm
 */
public class codejamC {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader inFile = new FileReader("A-small-attempt0.in");
        Scanner in = new Scanner(inFile);
        FileWriter outFile = new FileWriter("Asmall.out");
        PrintWriter out = new PrintWriter(outFile);
        //Scanner in = new Scanner(System.in);
        char[] letters = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        int T= in.nextInt();
        in.nextLine();
        for(int k=0;k<T;k++)
        {
            String text = in.nextLine();
            char[] characters = text.toCharArray();
            for(int i=0;i<characters.length;i++){
                if(characters[i]!=' ')
                    characters[i]=letters[characters[i]-'a'];
            }
            String str = new String(characters);
            out.println("Case #" + (k+1) +": " + str);
        }
        in.close();
        out.close();
    }
}
