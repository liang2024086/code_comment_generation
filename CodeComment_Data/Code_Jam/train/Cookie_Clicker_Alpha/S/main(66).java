package methodEmbedding.Cookie_Clicker_Alpha.S.LYD956;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gaurav
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
        int cases = Integer.parseInt(br.readLine());
        int counter = 1;
        while(cases-- != 0){
            String[] input = br.readLine().split(" ");
            double c = Double.parseDouble(input[0]);
            double rate = Double.parseDouble(input[1]);
            double k = Double.parseDouble(input[2]);
 
            double storage[] = new double[10000];
            //double timeStorage[] = new double[10000];
            double time = 0;
            int count = 0;
            boolean b = true;
            while(b){ 
                double t = 0.0;
                double r = 2.0;
                for(int j = 0 ; j < count; j++){
                    t += c/r;
                    r += rate;
                }
                t += k/r;
                storage[count] = t;
                //System.out.println(storage[count]);
                if(count > 0 && storage[count] > storage[count - 1]){
                    time = storage[count - 1];
                    b = false;
                }
                count++;
            }
            
            out.write("Case #" +counter++ +": "+(double)Math.round(time * 10000000) / 10000000);
            out.newLine();
        }
        
        out.close();
    }
}
