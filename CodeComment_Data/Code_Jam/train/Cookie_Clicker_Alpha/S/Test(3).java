package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1419;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author sjs007
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        try{
            // declare vars
            int T;
            
            int[] row1values = new int[4];
            int[] row2values = new int[4];
            StringTokenizer strTok;
            // read in number of test cases
            FileReader fr = new FileReader("C:\\Users\\sjs007\\Documents\\NetBeansProjects\\test\\src\\test\\filename.txt");
            BufferedReader textReader = new BufferedReader(fr);
            T = Integer.parseInt(textReader.readLine());
            double[] C = new double[T];
            double[] F = new double[T];
            double[] X = new double[T];
            
            // populate matrices
            for(int t = 0; t < T; t++){                
                strTok = new StringTokenizer(textReader.readLine());
                C[t] = Double.parseDouble(strTok.nextToken());
                F[t] = Double.parseDouble(strTok.nextToken());
                X[t] = Double.parseDouble(strTok.nextToken());                
            }
            textReader.close();
//            System.out.println(T);
//            for(int t = 0; t < T; t++){
//                System.out.println(C[t] + " " + F[t] + " " + X[t]);
//            }
            
            // now apply problem solving logic
            File f = new File("solution.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            double timeToX;            
            double bestTime;
            int cookies;
            double timeToNextCookie;
            double cookieRate;
            double runningTime;
            // count the number of values that appear in both row1values and row2values
            
            for(int t = 0; t < T; t++){                
                
                runningTime = 0;
                cookies = 0;
                cookieRate = 2.0;
                timeToX = X[t] / cookieRate;
                bestTime = timeToX;
                
                //System.out.println("cookies: " + cookies + "\tTime to X: " + timeToX);
                timeToNextCookie = C[t] / cookieRate;                
                while(true){
                    runningTime += timeToNextCookie;
                    cookieRate += F[t];
                    cookies = 0;
                    timeToNextCookie = C[t] / cookieRate;
                    timeToX = X[t] / cookieRate;
                    if(runningTime + timeToX < bestTime){
                        bestTime = runningTime + timeToX;
                    } else{
                        break;
                    }
                };
                System.out.println("Case #" + (t+1) + ": " + bestTime);
            }
            bw.close();
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
