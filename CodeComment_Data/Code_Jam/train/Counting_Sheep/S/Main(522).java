package methodEmbedding.Counting_Sheep.S.LYD1155;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NPSingh
 */
public class Main {
 
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader(args[0])));
            BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
            int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
            int j=1;
            Set<Character> numbersSeen;
            String num="";
            for (int i = 1; i <= t; ++i) {
              int n = in.nextInt();
              if(n==0)
                out.write("Case #" + i + ": INSOMNIA \n");
              else{
                  numbersSeen= new HashSet<Character>();
                  j=1;
                  while(true){
                    num = new Integer(j*n).toString();
                    for(int k=0;k<num.length();k++){
                        char ch = num.charAt(k);                
                        numbersSeen.add(ch);
                    }
                    if(numbersSeen.size()==10)
                    {
                        break;
                    }
                    j++;
                  }
                  out.write("Case #" + i + ": "+num+"\n");
              }
            }
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
}
