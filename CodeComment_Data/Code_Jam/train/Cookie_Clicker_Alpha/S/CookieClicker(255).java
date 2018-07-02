package methodEmbedding.Cookie_Clicker_Alpha.S.LYD603;

import java.util.*;
import java.io.*;

public class CookieClicker{

     public static void main(String []args) throws IOException{
        String inFile = "input.txt";
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        PrintWriter pw = new PrintWriter(bw);
        int cases = Integer.parseInt(br.readLine());
        double X=0,C=0,F=0;
        double time=0;
        for(int case_no=1;case_no<=cases;case_no++){
            time = 0;
            String line = br.readLine();
            StringTokenizer t = new StringTokenizer(line);
            C = Double.parseDouble(t.nextToken());
            F = Double.parseDouble(t.nextToken());
            X = Double.parseDouble(t.nextToken());
            Boolean notdone = true;
            Double rate = 2.0;
            while(notdone){
                if((X/rate) > ((X/(rate+F))+(C/rate))){
                    time = time+(C/rate);
                    rate = rate+F;                    
                }
                else{
                    time = time + (X/rate);
                    notdone = false;
                }
            }
            pw.println("Case #"+case_no+": "+time);
        }
        pw.close();
        bw.close();
     }
}
