package methodEmbedding.Speaking_in_Tongues.S.LYD462;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Codejam {

    public static void main(String[] args) {
        int x[] = {121, 104, 101, 115, 111, 99, 118, 120, 100, 117, 105, 103, 108, 98, 107, 114, 122, 116, 110, 119, 106, 112, 102, 109, 97, 113, 32};
        
       
        int n = 0;
        try {
             BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt2.in")));
            String lines = br.readLine();
            n = Integer.parseInt(lines);
            for (int i = 0; i < n; i++) {
                String temp1 = br.readLine();
                String temp=temp1.toLowerCase();
                System.out.print("Case #"+(i+1)+":"+ " ");
                char temp_ch[] = temp.toCharArray();
                for (int j = 0; j < temp_ch.length; j++) {
                    int t = ((int) temp_ch[j]) != 32 ? ((int) temp_ch[j]) - 97 : 26;
                    System.out.print((char) x[t]);
                }
                System.out.println();
            }
        } catch (IOException ex) {
          
        }


    }
}
