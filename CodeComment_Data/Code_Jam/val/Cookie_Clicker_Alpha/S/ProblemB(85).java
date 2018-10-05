package methodEmbedding.Cookie_Clicker_Alpha.S.LYD988;

import java.util.*;
import java.io.*;

public class ProblemB {
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new FileReader("B-small-attempt0.in"));
            PrintWriter out = new PrintWriter(new FileWriter("outB.txt"));
            
            int numOfCases = in.nextInt();
            in.nextLine();
            
            double C;
            double F;
            double X;
            
            double time;
            double total;
            double rate;
            double time1;
            double time2;
            for(int i = 1; i <= numOfCases; i ++){
                C = in.nextDouble();
                F = in.nextDouble();
                X = in.nextDouble();
                
                time = 0;
                total = 0;
                rate = 2;
                while(total < X){
                    time1 = time + (X - total) / rate;
                    
                    if(total >= C){
                        time2 = time + (X - (total - C)) / (rate + F);
                        if(time1 < time2){
                            time = time1;
                            break;
                        }else{
                            total = total - C;
                            rate = rate + F;
                        }
                    }else{
                        time2 = (C - total) / rate;
                        if(time1 < time2){
                            time = time1;
                            break;
                        }
                        time += time2;
                        total = C;
                    }
                }
                
                out.println("Case #" + i + ": " + time);
            }
            
            out.close();
        }catch(Exception e){
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
