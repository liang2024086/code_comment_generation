package methodEmbedding.Speaking_in_Tongues.S.LYD1494;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Stefanos
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Character, Character> translate = new HashMap<Character, Character>();

        String example = "ejp mysljylc kd kxveddknmc re jsicpdrysi\nrbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\nde kr kd eoya kw aej tysr re ujdr lkgc jv";
        String answer  = "our language is impossible to understand\nthere are twenty six factorial possibilities\nso it is okay if you want to just give up";

        String input;
        String output = "";
        int i = 0 ;
        
        translate.put('q', 'z');
        translate.put('z', 'q');
        
        for(i=0; i< example.length(); i++) {
            translate.put(example.charAt(i), answer.charAt(i));
        }

  
        try {  
            FileReader fr = new FileReader(new File("A-small-attempt0.in"));  
            BufferedReader br = new BufferedReader(fr);
            
            FileWriter fstream = new FileWriter("A-small-attempt0.out");
            BufferedWriter out = new BufferedWriter(fstream);

            int cases = Integer.parseInt(br.readLine());
            i = 0;
            
            while(i < cases) {
                input = br.readLine();
                output += "Case #"+(++i)+": "; 
                for(int k=0; k< input.length(); k++) {
                    output += translate.get(input.charAt(k));
                }
                out.write(output);
                output = "\n";
            }

            out.close();
            br.close();
        }catch (Exception e) { System.err.println("Error: " + e.getMessage()); }  
        
    }
}
