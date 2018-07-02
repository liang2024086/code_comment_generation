package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1240;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shivam Tiwari
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
    
        //FileReader fis = new FileReader("./src/CookieClickerAlpha/A-small-attempt0.in");
        FileReader fis = new FileReader("./src/CookieClickerAlpha/B-small-attempt0.in");
        BufferedReader br = new BufferedReader(fis);
        
        //PrintWriter writer = new PrintWriter("./src/CookieClickerAlpha/smallOutput.in", "UTF-8");
        PrintWriter writer = new PrintWriter("./src/CookieClickerAlpha/B-small-attempt0Output.in", "UTF-8");
        
        long N = Long.parseLong(br.readLine().trim());
        
        String[] line;
        
        double C, F, X;
        double currF,minTime,currTime;
        
        for(long i=0;i<N;i++){
            
            line = br.readLine().trim().split(" ");
            
            C = Double.parseDouble(line[0]);
            F = Double.parseDouble(line[1]);
            X = Double.parseDouble(line[2]);
            
            minTime = 0;
            
            if(X < C){
                minTime = X/2;
            }
            
            else {
                for (long j = 0; j < (X / C + 1); j++) {
                    
                    currTime = 0;
                    currF = 2;
                    
                    for (long k = 0; k < j; k++) {
                        
                        currTime += C / currF;
                        currF += F;
                    }
                    
                    currTime += X / currF;
                    
                    if (j == 0) {
                        minTime = currTime;
                    } else {
                        if (currTime < minTime) {
                            minTime = currTime;
                        }
                    }
                }
            }
            
            writer.println("Case #" + (i+1) + ": " + minTime);
        }
        
        writer.close();
    }
}
