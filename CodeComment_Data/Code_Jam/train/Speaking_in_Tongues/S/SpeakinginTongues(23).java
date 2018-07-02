package methodEmbedding.Speaking_in_Tongues.S.LYD105;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allegea
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Allegea
 */
public class SpeakinginTongues {
 
    public static void main(String[] args) throws IOException,FileNotFoundException{
        
        BufferedReader in   = new BufferedReader(new FileReader("A-small-attempt1.in"));
        
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileWriter archivo = new FileWriter("A-small-attempt1.out");
        PrintWriter out = new PrintWriter(archivo);
        out.flush();
        char[] change = "yhesocvxduiglbkrztnwjpfmaq".toCharArray();
        //System.err.println(change.length);
        
      /* int x =97|97;
       System.out.println(x);
       char[] other = new char[26];
       for(int i=0;i<26;i++)
           other[i]=(char) (i+97);*/
       
       char[] letters = new char[26];
       
         
           String line;
           StringBuilder buil = new StringBuilder();
           line = in.readLine();
           int cases = Integer.parseInt(line);
           int act = 0;
            while (act++<cases) 
            {
                
                char[] read = in.readLine().toCharArray();
                String salida = "";
                //System.out.println(read);
                for(int i=0;i<read.length;i++)
                {
                    if(Character.isLetter(read[i]))
                        salida+=change[read[i]-'a'];
                    else salida+=read[i];
                }
                String answer="";
                
                
                
                System.out.println("Case #"+act+": "+salida);
               out.println("Case #"+act+": "+salida);
              // System.out.println(line); 
                
            }


        in.close();
        out.close();
        System.exit(0);

        

        
        
    }
   


}

