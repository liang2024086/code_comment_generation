package methodEmbedding.Speaking_in_Tongues.S.LYD792;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author parusnik
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            bw.write("Case #" + String.valueOf(i+1) + ": ");
            String s = br.readLine();
            
            for (int j = 0; j<s.length(); j++){
                char c = s.charAt(j);
                if (c==' ') bw.write(" ");
                if (c=='a') bw.write("y");
                if (c=='b') bw.write("h");
                if (c=='c') bw.write("e");
                if (c=='d') bw.write("s");
                if (c=='e') bw.write("o");
                if (c=='f') bw.write("c");
                if (c=='g') bw.write("v");
                if (c=='h') bw.write("x");
                if (c=='i') bw.write("d");
                if (c=='j') bw.write("u");
                if (c=='k') bw.write("i");
                if (c=='l') bw.write("g");
                if (c=='m') bw.write("l");
                if (c=='n') bw.write("b");
                if (c=='o') bw.write("k");
                if (c=='p') bw.write("r");
                if (c=='q') bw.write("z");
                if (c=='r') bw.write("t");
                if (c=='s') bw.write("n");
                if (c=='t') bw.write("w");
                if (c=='u') bw.write("j");
                if (c=='v') bw.write("p");
                if (c=='w') bw.write("f");
                if (c=='x') bw.write("m");
                if (c=='y') bw.write("a");
                if (c=='z') bw.write("q");
                
            }
            bw.newLine();
        }
        
        br.close();
        bw.close();
    }
}
