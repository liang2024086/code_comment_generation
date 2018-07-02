package methodEmbedding.Standing_Ovation.S.LYD1814;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EmZee7
 */
public class Test {
    public static void main(String[] args) {
        int T = 0, i, j, inv, tot = 0; //store number of test cases
        int levels = 0;
        int cases[], answers[] = null;
        String temp = "";
        File inFile = new File("A-small-attempt2.in");
        File outFile = new File("output.txt");
                
        try {
            Scanner s = new Scanner(inFile);
            T = s.nextInt();
            answers = new int[T];
            for(i=0;i<T;i++){
              inv = tot = 0;
              levels = Integer.parseInt(s.next()) + 1;
              temp = s.next();
              cases = new int[levels];
              
              for(j=0;j<levels;j++){
                cases[j] = Character.getNumericValue(temp.charAt(j));
              }
              
              for(j=1;j<levels;j++){
                tot = tot + cases[j-1];  
                if(j>tot&&cases[j]>0){
                    inv = inv + j - tot;
                    tot = tot + inv;
                }
              }
    
              answers[i] = inv;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PrintWriter pw = new PrintWriter(outFile);
            for(i=0;i<T;i++){
                System.out.println("Case #"+(i+1)+": "+answers[i]);
                pw.println("Case #"+(i+1)+": "+answers[i]);
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
