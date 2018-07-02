package methodEmbedding.Magic_Trick.S.LYD1800;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.HashSet;

/**
 *
 * @author DHA
 */
public class Codejam2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
         BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/DHA/Desktop/input.txt")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/DHA/Desktop/output.txt")));
       
        int t=Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int rawno1=Integer.parseInt(br.readLine());
           String[] first = null;
            String[] second = null;
        
            
            for (int j = 1; j < 5; j++) {
                String s=br.readLine();
                
                if(j==rawno1)
                 first=s.split(" ");
                      
                          
                          }
            int rawno2=Integer.parseInt(br.readLine());
              for (int j = 1; j < 5; j++) {
                String s=br.readLine();
               
                if(j==rawno2)
                 second=s.split(" ");
                      
                          
                          }
              String guess = null;
           HashSet hs = new HashSet();
            for (int j = 0; j < 4; j++) {
               hs.add(first[j]);
            }
            for (int j = 0; j < 4; j++) {
               if(hs.add(second[j])==false)
                   guess=second[j];
            }
            if(hs.size()==7)
                 out.println("Case #"+(i+1)+": "+guess);
            else if(hs.size()==8)
                 out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
            else
                 out.println("Case #"+(i+1)+": "+"Bad magician!");
           
              
            }
            out.flush();
        }

}
