package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1089;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Problem2 {
    
    //solves the "Cookie Clicker Alpha" problem
    public static void main (String [] args) throws IOException {
        
        BufferedReader f = new BufferedReader(new FileReader("in2.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out2.txt")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        
        int cases = Integer.parseInt(st.nextToken());
        for (int i=0; i<cases; i++) {
//----------------------start input----------------------------------------
            st = new StringTokenizer(f.readLine());
            double C = Double.parseDouble(st.nextToken()); //cost of cookie factory
            double F = Double.parseDouble(st.nextToken()); //cookie factory add to CPS
            double X = Double.parseDouble(st.nextToken()); //cookies to win
            double last_time = Double.POSITIVE_INFINITY; //seconds required using less factories
//------------------------end input----------------------------------------
            
            for (int cookie_factories_to_buy = 0;;cookie_factories_to_buy++) {
                double cumulative_time = 0;
                double current_cookies_per_second = 2.0; //self-explanatory

                for (int cookie_factories_bought = 0;
                     cookie_factories_bought < cookie_factories_to_buy;
                     cookie_factories_bought++) {
                    
                    cumulative_time += (C / current_cookies_per_second);
                    current_cookies_per_second += F;
                    
                }
                cumulative_time += (X / current_cookies_per_second);
                if (cumulative_time > last_time) { //last_time is the minimum
                    DecimalFormat df = new DecimalFormat("#0.0000000");
                    out.println("Case #"+((int)i+1)+": "+df.format(last_time));
                    break;
                } else { //last_time is not the  minimum
                    last_time = cumulative_time;
                }
            }
            
        }
        
        out.close();                                  // close the output file
        System.exit(0);                               // don't omit this!
    }
}
