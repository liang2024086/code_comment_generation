package methodEmbedding.Counting_Sheep.S.LYD1308;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.java2d.cmm.ColorTransform.Out;

/**
 *
 * @author liban
 */
public class Google {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("abc.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Google.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // TODO code application logic here
            
            Scanner in = new Scanner(new BufferedReader (new InputStreamReader(System.in)));
            String a;
            BufferedReader  inp = new BufferedReader(new FileReader("A-small-attempt2.in"));
            a = inp.readLine();
            
            int t = Integer.parseInt(a);
            for(int i =1; i <=t ; ++i){
                
                String c= inp.readLine();
                
                int N = Integer.parseInt(c);
                
                String str = "1234567890";
                
                
                //System.out.println(str.length());
                String match = "";
                
                int k=0,m,count=0;
                int j =1;
                while(str.length()!=0){
                    
                    k =N*j;
                    match = k+"";
                    
                    j++;
                    m=N*j;
                    if(m==k){
                        count++;
                        break;
                    }
                    
                    for(int p = 0; p < match.length();p++){
                        if(str.contains(match.charAt(p)+""))
                            str = str.replace(match.charAt(p)+"", "");
                    }
                    
                }
                
                
                
                
                             
                if(i!=1)
                    out.write("\n");
                if(count ==0)
                    out.write("Case #" + i+ ": " +k);
                   // System.out.println("Case #" + i+ ": " +k);
                else
                    out.write("Case #" + i+ ": " +"INSOMNIA");
                
                  //  System.out.println("Case #" + i+ ": " +"INSOMNIA");
                
            }   } catch (IOException ex) {
            Logger.getLogger(Google.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Google.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
//                            int N = 0;
//        ArrayList <Integer>list = new ArrayList<>();
       
    
}
