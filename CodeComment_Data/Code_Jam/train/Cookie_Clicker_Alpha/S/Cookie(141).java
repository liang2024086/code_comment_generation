package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1580;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Cookie {
    
    static BufferedWriter bw;
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(new File("B-small-attempt0.in"));
        bw = new BufferedWriter(new FileWriter(new File("output.txt")));
            
        int tc = sc.nextInt();
        for(int d=1;d<=tc;d++){
            bw.write("Case #"+String.valueOf(d)+": ");
            
            double rate = 2d, time = 0d;
            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();  
            double t1 = 0d, t2 = 0d, t3 = 0d;
            
            while(true){
                t1 = X/rate;
                t2 = C/rate;
                t3 = X/(F+rate);
                
                if(t2+t3<t1){
                    time += t2;
                    rate += F;
                }
                else{
                    time += t1;
                    break;
                }
            }
            
            bw.write(String.valueOf(time));
            bw.newLine();
            bw.flush();              
        }
        sc.close();
        bw.close();
    }
}
