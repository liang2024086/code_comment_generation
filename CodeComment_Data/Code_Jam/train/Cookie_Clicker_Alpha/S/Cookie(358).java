package methodEmbedding.Cookie_Clicker_Alpha.S.LYD280;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class Cookie {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.0000000");
        int testCases = sc.nextInt();
        
        for(int i=0; i<testCases; i++) {
            double cost = sc.nextDouble();
            double farm = sc.nextDouble();
            double needed = sc.nextDouble();
            double production = 2;
            double stop = needed/production;
            double buy = cost/production + needed/(production + farm);
            double time = 0;
            
            while(stop > buy) {
                time += cost/production;
                production += farm;
                stop = needed/production;
                buy = cost/production + needed/(production + farm);
            }
            
            time += needed/production;
            sb.append("Case #" + (i+1) + ": " + df.format(time) + "\n");
        }
        
        PrintStream ps = new PrintStream(new FileOutputStream("cookie.out", false));
        ps.println(sb.toString());
        ps.close();
    }
}
