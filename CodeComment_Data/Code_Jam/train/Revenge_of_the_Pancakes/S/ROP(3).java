package methodEmbedding.Revenge_of_the_Pancakes.S.LYD905;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zhezhao
 */
public class ROP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        FileInputStream fis = new FileInputStream(args[0]);
        PrintStream out = new PrintStream(new FileOutputStream(args[1]));
        System.setIn(fis);
        System.setOut(out);
        
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int times= Integer.parseInt(in.next()); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= times; ++i) {
            String S = in.next();    

            Pattern p = Pattern.compile("(-)+");
            Matcher m = p.matcher(S);
            int oTimes= 0;
            while(m.find()) { 
                oTimes++;
            } 
            oTimes*=2;
                        
            if(S.charAt(0) == '-'){
                oTimes--;
            }
            
            System.out.println("Case #" + i + ": "+oTimes);    

        }        
    }
    
}

