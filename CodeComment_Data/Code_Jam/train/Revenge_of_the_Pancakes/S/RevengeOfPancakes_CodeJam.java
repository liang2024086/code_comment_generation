package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1192;

/*
 * #Author: Sahir Noor Ali
 * #ID: K132047 
 * #Code: CodeJam 2016 - Revenge Of Pancakes
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class RevengeOfPancakes_CodeJam {

    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        File file = new File("B-small-attempt1.in");
        Scanner sc = new Scanner(file);
        
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        
        int test = sc.nextInt();
        sc.nextLine();
        
        for(int tc=0;tc<test;tc++){
           String str = sc.nextLine();
           
           int steps = 0;
           while(str.length()!=0 && str.charAt(str.length()-1) == '+')
               str = str.substring(0, str.length()-1);
               
           if(str.length() > 0){
              // System.out.println("here");
             steps = 1;
             char c = str.charAt(0);
               for(int i=0; i<str.length();i++){
                    if(c!=str.charAt(i)){
                        c = str.charAt(i);
                        ++steps;
                    }

                }//close for
           }
           writer.println("Case #"+(tc+1)+": "+steps);
        }//close tc
        writer.close();
    }//close main
    
}//close classs
