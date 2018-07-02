package methodEmbedding.Counting_Sheep.S.LYD1169;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anesu
 */
public class GoogleCodeJam {

    static Set<Character> seen;
    static String input = "A-small-attempt0.in";
    public static void main(String[] args) {
        seen = new HashSet<>();
        Scanner in = null;
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileOutputStream("output.out"));
            in = new Scanner(new FileInputStream("A-small-attempt1.in"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int tests = in.nextInt();
        
        for(int i = 0; i < tests; i++){
            int base = in.nextInt();
            if(base == 0){
                String msg = String.format("Case #%d: INSOMNIA", i + 1);
                out.println(msg);
                continue;
            }
            int mult = 1;
            
            while(true){
                int num = base * mult++;
                String numStr = num + "";
                for(char number : numStr.toCharArray()){
                    seen.add(number);
                }
                if(seen.size() == 10){
                    seen.clear();
                    String msg = String.format("Case #%d: %d", i + 1, num);
                    out.println(msg);
                    break;
                }
            }
        }
        
        out.close();
        in.close();
       
    }
    
}
