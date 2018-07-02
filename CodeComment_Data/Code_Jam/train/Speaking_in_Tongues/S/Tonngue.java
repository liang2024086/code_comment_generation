package methodEmbedding.Speaking_in_Tongues.S.LYD1213;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irvincardenas
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Tonngue {

    public static void main(String[] args) throws FileNotFoundException {


        TreeMap<String, String> alphabet = new TreeMap<String, String>();

        String alphLetter = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String conver = "y h e s o c v x d u i g l b k r z t n w j p f m a q";
        for (int i = 0; i < alphLetter.length(); i++) {
            char letters = alphLetter.charAt(i);
            String s1 = Character.toString(letters);
            char conv = conver.charAt(i);
            String s2 = Character.toString(conv);

            alphabet.put(s1, s2);
        }

//       Set sett = alphabet.entrySet();
//       Iterator iterate = sett.iterator();

//       while(iterate.hasNext())
//       {
//           Map.Entry myEntry = (Map.Entry)iterate.next();
//           System.out.print(myEntry.getKey() + ":");
//           System.out.println(myEntry.getValue());   
//       }

        ////
        
        Scanner in = new Scanner(new File("test"));
        PrintWriter answer = new PrintWriter(new File("answer.txt"));

       int cases = in.nextInt();
       int num = 1;
       in.nextLine();
       for(int j = 0; cases > 0; j++)
       {
           
           String line = in.nextLine();
           String lette;
           String answ = "";
           String resulLetter;
               for(int i = 0 ; i < line.length(); i++)
               {
                   lette = Character.toString(line.charAt(i));                   
                   resulLetter = alphabet.get(lette);

                   answ +=resulLetter;
               } 
               answer.println("Case #" + (j+1) + ": " + answ);
               num++;
               cases--;
       }
        answer.close();
    }
}
////////I am skipping another line ///////////
