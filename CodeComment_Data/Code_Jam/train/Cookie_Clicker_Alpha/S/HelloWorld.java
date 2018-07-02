package methodEmbedding.Cookie_Clicker_Alpha.S.LYD277;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class HelloWorld {
    
    public static void main(String[] args) {
        try {
//            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/a.txt"));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/B-small-attempt0.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/codejam/B-small-result.txt"));
//            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/B-small-attempt1.in"));
            
//            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/B-large.in"));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/codejam/B-large-result.txt"));

            String line;
            
            line = br.readLine();
            int T = Integer.parseInt(line);
            
            for (int cas = 1; cas <= T; cas++) {
                line = br.readLine();
                String[] buf = line.split(" ");
                double C = Double.parseDouble(buf[0]);
                double F = Double.parseDouble(buf[1]);
                double X = Double.parseDouble(buf[2]);
                
                double current = 2;
                double res = 0;
                
                boolean cont = true;
                while (cont) {
                    cont = false;
                    if ( X / (current + F) < (X - C) / current) {
                        cont = true;
                        res += C / current;
                        current += F;
                    } else {
                        res += X / current;
                    }
                }
                
                
                bw.write("Case #" + cas +": ");
                bw.write("" + res);
                bw.newLine();
                bw.flush();
            }
            
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
