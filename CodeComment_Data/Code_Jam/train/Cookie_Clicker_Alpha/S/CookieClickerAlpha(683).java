package methodEmbedding.Cookie_Clicker_Alpha.S.LYD923;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CookieClickerAlpha {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("_input.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_output.in"));

        br.readLine();//first line for the case count
        String line = null;
        int index = 1;
        
        while((line = br.readLine())!=null){
            
            String[] input = line.split("\\s");
            
            double C = Double.parseDouble(input[0]);
            double F = Double.parseDouble(input[1]);
            double X = Double.parseDouble(input[2]);
           
            double currentRate = 2;
            
            double totaltime = 0;
            
            boolean buy = false;
            
            while(X / currentRate > C/currentRate + X/(F+currentRate)){
                buy = true;
                totaltime += C/currentRate;
                currentRate += F;
            }
            
            totaltime += X/currentRate;
            
            if(buy){
                bw.append("Case #" + index++ + ": " + totaltime + "\n");                
            }
            else{
                bw.append("Case #" + index++ + ": " + X/2 + "\n");                
            }
            
        }
        
        br.close();
        bw.close();
        
    }

}
