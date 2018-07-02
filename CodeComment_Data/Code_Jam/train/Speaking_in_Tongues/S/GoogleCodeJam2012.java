package methodEmbedding.Speaking_in_Tongues.S.LYD869;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Ulyss
 */
public class GoogleCodeJam2012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        
        
        String codedLine = null;
        String senseLine = null;
        
        TreeMap<Character, Character> table = new TreeMap<>();
        TreeMap<Character, Character> antitable = new TreeMap<>();
        
        
        
        codedLine = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
        senseLine = "our language is impossible to understand";
        
        for(int i = 0; i < codedLine.length(); i++){
            
            if( codedLine.charAt(i) != ' ' ){
                
                table.put(codedLine.charAt(i), senseLine.charAt(i));
                antitable.put(senseLine.charAt(i), codedLine.charAt(i));
            }
        }
        
        codedLine = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        senseLine = "there are twenty six factorial possibilities";
        
        for(int i = 0; i < codedLine.length(); i++){
            
            if( codedLine.charAt(i) != ' ' ){
                
                table.put(codedLine.charAt(i), senseLine.charAt(i));
                antitable.put(senseLine.charAt(i), codedLine.charAt(i));
            }
        }
        
        codedLine = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
        senseLine = "so it is okay if you want to just give up";
        
        for(int i = 0; i < codedLine.length(); i++){
            
            if( codedLine.charAt(i) != ' ' ){
                
                table.put(codedLine.charAt(i), senseLine.charAt(i));
                antitable.put(senseLine.charAt(i), codedLine.charAt(i));
            }
        }
        
        table.put('q', 'z');
        table.put('z', 'q');
        antitable.put('z', 'q');
        antitable.put('q', 'z');
        
        
        
        BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
        PrintWriter pw = new PrintWriter("small.txt");
        
        String line = null;
        
        line = br.readLine();
        
        int T = Integer.parseInt(line);
        
        
        
        for(int i = 0; i < T; i++){
            
            line = br.readLine();
            System.out.println(line.length());
            
            StringBuilder real = new StringBuilder();
            real.setLength(line.length());
            
            for(int j = 0; j < line.length(); j++){
                
                if( line.charAt(j) == ' ' ){
                    
                    real.setCharAt(j, ' ');
                }
                else{
                
                    char realSymbol = table.get(line.charAt(j));
                
                    real.setCharAt(j, realSymbol);
                }
            }
            
            pw.print("Case #" + (i+1) + ": ");
            pw.print(real.toString());           
            
            if( i < T-1 ){
                
                pw.println();
            }
            
        }
        
        
        pw.close();
        br.close();
    }
}
