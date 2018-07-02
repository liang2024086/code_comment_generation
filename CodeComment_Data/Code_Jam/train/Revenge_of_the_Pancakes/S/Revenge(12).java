package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1094;

// Google Code Jam Qualification Round 2016
// Problem Revenge of the Pancakes
// Template by fikr

import java.util.*;
import java.io.*;

public class Revenge{
    static String filename = "B-small-attempt2";	// io filename here, change accordingly
    //static String filename = "B-large";
    //static String filename = "tc";
    static String inname = filename + ".in";    
    static String outname = filename + ".out";  
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new BufferedReader(new FileReader(inname)));
            //Scanner in = new Scanner(System.in);
            BufferedWriter out = new BufferedWriter(new FileWriter(outname));
            int t = in.nextInt();
            in.nextLine();
            for (int cas = 1; cas <= t; cas++){

                String g = in.nextLine();
                
                int c = 0;
                
                if (g.length()==1){
                    if (g.charAt(0)=='-')
                        c = 1;
                }
                
                for (int i = 0;i < g.length()-1;i++){
                    if ((g.charAt(i)=='-')&&(g.charAt(i+1)=='+'))
                        c += 1;
                    if ((g.charAt(i)=='+')&&(g.charAt(i+1)=='-'))
                        if (i==g.length()-2) 
                            c += 2;
                        else
                            c += 1;
                    if ((g.charAt(i)=='-')&&(g.charAt(i+1)=='-')&&(i==g.length()-2))
                        c+= 1;
                }
                
                //System.out.print("Case #" + cas + ": " + ans + "\n");
                out.write("Case #" + cas + ": " + c + "\n");
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
