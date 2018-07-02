package methodEmbedding.Cookie_Clicker_Alpha.S.LYD563;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author deepak
 */
public class CockieClicker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        double rate = 2,c,f,x;
        for(int i = 1;i<=t;i++){
            rate = 2;            
            String inputs[] = br.readLine().split(" ");
            c = Float.parseFloat(inputs[0].trim());
            f = Float.parseFloat(inputs[1].trim());
            x = Float.parseFloat(inputs[2].trim());
            double time = x/rate;
            double newTime = 0;
            while(true){
                newTime += c/rate;
                rate += f;
                if(time < newTime+x/rate)
                    break;
                time = newTime+x/rate;
            }
            pw.printf("Case #%d: %.7f\n",i,time);
        }
        pw.flush();
        pw.close();
    }
}
