package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1170;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

/**
 *
 * @author Toyin
 */
public class B {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {        
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new FileReader("B-small-attempt3.in"));
        FileWriter fw = new FileWriter("B-small.out");
        
        int N = new Integer(in.readLine());
        for(int cases=1; cases<=N; cases++){
            String str = (in.readLine());            
            boolean ok=false;
            int count = 0;
            if(!str.contains("+")){
                fw.write("Case #" + cases + ": 1\n");
            }else if(!str.contains("-")){
                fw.write("Case #" + cases + ": 0\n");
            }else{
                while(!ok){                    
                    int ctr = 0;
                    while(ctr < str.length()-1 && str.charAt(ctr)==str.charAt(ctr+1)){
                        ++ctr;
                    }
                     
                    char[] sel = new char[ctr + 1];
                    Arrays.fill(sel, str.charAt(ctr + 1));
                    str = new String(sel) + str.substring(ctr + 1);
                    ++count;
                    ok = !str.contains("-") || !str.contains("+");
                    if (!str.contains("+")){                        
                        ++count;
                    }
                }
                fw.write("Case #" + cases + ": " + count + "\n");
            }            
        }
        fw.flush();
        fw.close();
    }
    
}
