package methodEmbedding.Magic_Trick.S.LYD385;

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
            
            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/A-small-attempt0.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/codejam/A-small-result.txt"));
//            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/A-small-attempt1.in"));
            
//            BufferedReader br = new BufferedReader(new FileReader("D:/codejam/A-large.in"));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/codejam/A-large-result.txt"));

            String line;
            
            line = br.readLine();
            int T = Integer.parseInt(line);
            
            for (int cas = 1; cas <= T; cas++) {
                Set<Integer> set = new TreeSet<Integer>();
                line = br.readLine();
                int n = Integer.parseInt(line);
                for (int i = 1; i <= 4; i++) {
                    line = br.readLine();
                    if (i == n) {
                        String[] buf = line.split(" ");
                        for (int j = 0; j < 4; j++) {
                            set.add(Integer.parseInt(buf[j]));
                        }
                    }
                }
                
                line = br.readLine();
                n = Integer.parseInt(line);
                int ret = 0;
                String retnum = "";
                for (int i = 1; i <= 4; i++) {
                    line = br.readLine();
                    if (i == n) {
                        String[] buf = line.split(" ");
                        for (int j = 0; j < 4; j++) {
                            if (set.contains(Integer.parseInt(buf[j]))) {
                                ret++;
                                retnum = buf[j];
                            }
                        }
                    }
                }
                
                
                bw.write("Case #" + cas +": ");
                if (ret == 0) {
                    bw.write("Volunteer cheated!");
                } else if (ret == 1) {
                    bw.write(retnum);
                } else {
                    bw.write("Bad magician!");
                }
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
