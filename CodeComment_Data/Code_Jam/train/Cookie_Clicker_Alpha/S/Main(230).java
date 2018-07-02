package methodEmbedding.Cookie_Clicker_Alpha.S.LYD474;


import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static final String changeLine = System.getProperty("line.separator");
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Main main = new Main();
    }

    public double c,f,x;
    
    public Main() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("D:/B-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/result.txt"));
        int cases = Integer.parseInt(br.readLine());
        for (int caseNum = 0; caseNum < cases; caseNum++) {
            String [] split = br.readLine().split(" ");
            c = Double.parseDouble(split[0]);
            f = Double.parseDouble(split[1]);
            x = Double.parseDouble(split[2]);
            double prod = 2;
            double res = x/prod, cum = 0;
            while(true) {
                if (cum + c/prod + x/(prod+f) < res) {
                    res = cum + c/prod + x/(prod+f);
                    cum += c/prod;
                    prod += f;
                } else {
                    break;
                }
            }
            // output
            System.out.println("Case #"+(caseNum+1)+":");
            bw.write("Case #"+(caseNum+1)+": ");
            bw.write(Double.toString(res));
            bw.write(changeLine);
        }
        br.close();
        bw.close();
    }
}
