package methodEmbedding.Speaking_in_Tongues.S.LYD325;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Masilo
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        HashMap<Character,Character> letters = new HashMap<Character, Character>();
        letters.put('a', 'y');
        letters.put('b', 'h'); 
        letters.put('c', 'e');
        letters.put('d', 's');
        letters.put('e', 'o');
        letters.put('f', 'c');
        letters.put('g', 'v');
        letters.put('h', 'x');
        letters.put('i', 'd');
        letters.put('j', 'u');
        letters.put('k', 'i');
        letters.put('l', 'g');
        letters.put('m', 'l');
        letters.put('n', 'b');
        letters.put('o', 'k');
        letters.put('p', 'r');
        letters.put('q', 'z');
        letters.put('r', 't');
        letters.put('s', 'n');
        letters.put('t', 'w');
        letters.put('u', 'j');
        letters.put('v', 'p');
        letters.put('w', 'f');
        letters.put('x', 'm');
        letters.put('y', 'a');
        letters.put('z', 'q');
        
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        
        
        try{
            inputStream = new Scanner(new FileInputStream("input.txt"));
            outputStream = new PrintWriter(new FileOutputStream("output.txt"));
            
            int t = Integer.parseInt(inputStream.nextLine());
            String inputLine = "", outputLine = "";
            
            for (int i = 1; i<=t;i++){
                inputLine = inputStream.nextLine();
                outputLine = "Case #"+i+": ";
                for (int j = 0; j<inputLine.length();j++){
                   if (Character.isSpaceChar(inputLine.charAt(j)))
                       outputLine +=" ";
                   else
                       outputLine += letters.get(inputLine.charAt(j));
                }
                outputStream.println(outputLine);
            }
 
            inputStream.close();
            outputStream.close();
        }
        catch(Exception e){
            System.out.println("File input.txt does not exist");
        }
    }
}
