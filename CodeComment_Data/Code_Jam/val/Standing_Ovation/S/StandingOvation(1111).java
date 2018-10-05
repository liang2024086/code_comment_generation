package methodEmbedding.Standing_Ovation.S.LYD1816;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;



/**
 *
 * @author Sidharth
 */
public class StandingOvation {
 public static void main(String[] arg) throws IOException {
     
        BufferedReader reader = new BufferedReader
            (new InputStreamReader(new FileInputStream(new File("input.txt"))));
        PrintWriter pw = new PrintWriter(new File("outut.txt"));
        StringTokenizer tokenizer;
        
        int T = Integer.parseInt(reader.readLine());
                
        for(int i=1; i <= T; i++){
            tokenizer = new StringTokenizer(reader.readLine());        
            int sMax = Integer.parseInt(tokenizer.nextToken());            
            String S = tokenizer.nextToken();
            
            int audience = 0;
            int friendsRequired = 0;
            
            for(int j = 0; j < S.length(); j++){                   
                if(audience < j){
                    friendsRequired += j-audience;
                    audience  = j;                    
                }
                audience += S.charAt(j) - '0';           
            }            
            pw.println("Case #" + i+": "+friendsRequired);
        }
        
        pw.close();

    }
}
