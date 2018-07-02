package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1212;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class Cookie {
    
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(
                    new File("/home/rahul/Documents/workspace/B-small-attempt0.in")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
        }

        String line = "";
        int cases = 0;
        int i = 1;
        boolean testCovered = false;
        StringBuilder sb = new StringBuilder();

        try {
            while ((line = br.readLine()) != null) {

                //read number of test cases
                if (!testCovered) {
                    cases = Integer.valueOf(line.trim());
                    testCovered = true;
                   
                }

                //for every test case
                while (i <= cases) {
                    
                   double time = 0;
                   double x=0,c=0,f=0;
                   
                   line = br.readLine();
                   if(line!=null){
                       String words[] = line.split(" ");
                       c = Double.valueOf(words[0]);
                       f = Double.valueOf(words[1]);
                       x = Double.valueOf(words[2]);
                       
                   }
                   
                   double cookies = 2;
                   while(true){
                       double now = x/(cookies);
                       double nextTime = x/(cookies+f) + c/(cookies); 
                       
                       if(now <= nextTime){
                           time = time+now;
                         break;  
                       }else{
                           
                           nextTime = c/cookies;
                           time = time + nextTime;
                           cookies += f;
                       }
                       
                   }

                    //output the result
                    sb.append("Case #");
                    sb.append(i);
                    sb.append(": ");
                    sb.append(time);

                    //loop var inc
                    i++;
                    sb.append("\n");
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter(
                        new File("/home/rahul/Documents/workspace/outCookie.txt")));
                bw.write(sb.toString());
                bw.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
