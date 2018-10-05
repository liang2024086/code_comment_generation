package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1312;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class cookies{
    public static void main(String[] args) throws IOException{
        File file = new File("a.txt");
        Scanner in = new Scanner(file);
        
        int cases = in.nextInt();
        double cost;
        double rate;
        double goal;
        double start;
        double optimal;
        double time;
        
        for(int i = 0; i < cases; i++) {
            time = 0;
            cost = in.nextDouble();
            rate = in.nextDouble();
            goal = in.nextDouble();
            start = 2;
            optimal = goal/start;
            while(true){
                time += cost/start;
                start += rate;
                if((goal/start)+time < optimal){
                    optimal = (goal/start)+time;
                } else {
                    break;
                }
            }
            System.out.println("Case #" + (i+1) + ": " + optimal);
        }
    }
}
            
            
            
            
            
