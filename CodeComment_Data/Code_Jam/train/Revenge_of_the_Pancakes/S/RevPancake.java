package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1039;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dexter
 */
public class RevPancake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("in.txt"));
        PrintWriter out = new PrintWriter("out.txt", "UTF-8");
        
        int t = Integer.parseInt(in.readLine());
        for(int i=1;i<=t;++i) {
            String line = in.readLine();
            
            long countplus[] = new long[line.length()+1];
            long countminus[] = new long[line.length()+1];
            
            countplus[0] = 0;
            countminus[0] = 0;
            
            for(int j=0;j<line.length();++j) {
                if(line.charAt(j) == '-') {
                    countminus[j+1] = countminus[j];
                    countplus[j+1] = countminus[j] + 1;
                }
                else {
                    countplus[j+1] = countplus[j];
                    countminus[j+1] = countplus[j] + 1;
                }
            }
            
             out.println("Case #"+new Integer(i).toString()+": " + new Long(countplus[line.length()]).toString());
        }
        
        out.close();
        in.close();
    }
    
}
