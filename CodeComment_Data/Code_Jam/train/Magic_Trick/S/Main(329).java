package methodEmbedding.Magic_Trick.S.LYD1976;


import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static final String changeLine = System.getProperty("line.separator");
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Main main = new Main();
    }

    public int e,r;
    
    public Main() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("D:/A-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/result.txt"));
        int cases = Integer.parseInt(br.readLine());
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            int line = Integer.parseInt(br.readLine());
            int [] a = new int[4], b = new int[4];
            for (int i = 1; i < 5; i++) {
                String [] split = br.readLine().split(" ");
                if(i!=line) continue;
                a[0] = Integer.parseInt(split[0]);
                a[1] = Integer.parseInt(split[1]);
                a[2] = Integer.parseInt(split[2]);
                a[3] = Integer.parseInt(split[3]);
            }
            line = Integer.parseInt(br.readLine());
            for (int i = 1; i < 5; i++) {
                String [] split = br.readLine().split(" ");
                if(i!=line) continue;
                b[0] = Integer.parseInt(split[0]);
                b[1] = Integer.parseInt(split[1]);
                b[2] = Integer.parseInt(split[2]);
                b[3] = Integer.parseInt(split[3]);
            }
            int res = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (a[i] == b[j]) {
                        if (res == 0) {
                            res = a[i];
                        } else {
                            res = -1;
                        }
                    }
                }
            }
            // output
            System.out.println("Case #"+(caseNum+1)+":");
            bw.write("Case #"+(caseNum+1)+": ");
            if (res == -1) {
                bw.write("Bad magician!");
            } else if (res==0) {
                bw.write("Volunteer cheated!");
            } else {
                bw.write(Integer.toString(res));
            }
            bw.write(changeLine);
        }
        br.close();
        bw.close();
    }
}
