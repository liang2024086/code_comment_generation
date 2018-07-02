package methodEmbedding.Speaking_in_Tongues.S.LYD1468;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author acer
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream input = new FileInputStream("input.txt");
        DataInputStream in = new DataInputStream(input);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        FileOutputStream output = new FileOutputStream("output.txt");

        String[] mapping = {"y","h","e","s","o","c","v","x","d","u","i","g","l","b","k","r","z","t","n","w","j","p","f","m","a","q"};
       
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String googlerese = br.readLine();
            String english = "";
            int length = googlerese.length();
            
            for(int j=0; j<length; j++){
                if(googlerese.charAt(j) == ' ')
                    english += " ";
                else
                    english += mapping[googlerese.charAt(j)-'a'];
            }
            output.write(("Case #" + (i + 1) + ": " + english + "\n").getBytes());
        }
    }

}
