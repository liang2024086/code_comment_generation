package methodEmbedding.Cookie_Clicker_Alpha.S.LYD684;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman Ahmed
 */
public class Prob {
    
    public static void main (String[] a)
    {
        
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("B-small-attempt0.in")));
            PrintWriter pw = new PrintWriter(new FileOutputStream("B-small-practice.out"));
            int inputs = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < inputs ;i++)
            {
                String temp = br.readLine();
                String[] tokens = temp.split(" ");
                Double c = Double.parseDouble(tokens[0]);
                Double f = Double.parseDouble(tokens[1]);
                Double x = Double.parseDouble(tokens[2]);
                Double rate = 2.0;
                Double time = 0.0 ;
                while(x/(rate+f)<(x-c)/rate)
                {
                    
                    time = time + c/rate;
                    rate = rate+f;
                }
                time = time + x/rate ;
                
                pw.print("Case #"+(i+1)+": ");
                pw.printf("%.7f\n", time);
            }
            pw.close();
        }catch(Exception e)
        {}
    }}
