package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1574;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;


public class cookieclicker {

    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileReader("/Users/hadoop/B-small-attempt1.in.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("/Users/hadoop/cookie.txt"));
        
        int T = Integer.valueOf(sc.nextLine());
        for(int cs = 1; cs <= T; cs++)
        {
            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();
            if(sc.hasNextLine()) sc.nextLine();
            double prevtime = Double.MAX_VALUE;
            int cookiejars = 0; 
            while(true)
            {
                double cjtime = 0; 
                double rate = 2;
                for(int i = 0; i < cookiejars; i++)
                {
                    cjtime += C / rate; 
                    rate = rate + F; 
                }
                
                double xTime = X / rate;
                double totaltime = cjtime + xTime;
                //System.out.print(cookiejars + "-");
                //System.out.println(totaltime);
                if(totaltime > prevtime)
                    break; 
                prevtime = totaltime; 
                
                cookiejars++; 
            }
            
            pw.printf("Case #%d: %.7f%n", cs, prevtime);
            System.out.printf("Case #%d: %.7f%n", cs, prevtime);
        }
        
        pw.flush(); 
        sc.close(); 
        pw.close(); 
    }
    
}
