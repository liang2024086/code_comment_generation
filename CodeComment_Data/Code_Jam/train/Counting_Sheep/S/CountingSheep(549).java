package methodEmbedding.Counting_Sheep.S.LYD1436;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author huytt
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("input.in"));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        
        try (PrintWriter writer = new PrintWriter("output", "UTF-8")) {
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(br.readLine());
                if (x == 0) {
                    writer.println("Case #" + (i + 1) + ": INSOMNIA");
                    continue;
                }
                
                Set<String> set = new HashSet<String>();
                int count = 1;
                while(set.size() < 11) {
                    set.addAll(Arrays.asList(String.valueOf(x * count).split("")));
                    count++;
                }
                writer.println("Case #" + (i + 1) + ": " + (x * (count - 1)));
            }
        }
    }
}
