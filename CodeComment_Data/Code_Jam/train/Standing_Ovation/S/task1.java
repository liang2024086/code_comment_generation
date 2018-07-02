package methodEmbedding.Standing_Ovation.S.LYD2003;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julius
 */

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class task1 {
    static String line;
            
    public static void main(String[] arguments) throws IOException{
        int n;
        String[] parts ;
        String eil;
        int m; 
        int[] z = new int[1000];
        int need = 0; 
        int standing = 0;
        int num = 0; 
        
       
            BufferedWriter output = new BufferedWriter(new FileWriter("C:\\Users\\Julius\\Documents\\NetBeansProjects\\JavaApplication1\\src\\output.txt"));
           
            

        
        FileReader fr = new FileReader("C:\\Users\\Julius\\Documents\\NetBeansProjects\\JavaApplication1\\src\\A-small-attempt0.in");
        BufferedReader textReader =new BufferedReader(fr);
        
        n = Integer.parseInt(textReader.readLine());
        
        for (int i = 1; i <= n; i++) {
            line = textReader.readLine();
            need = 0;
            standing = 0;
            
            parts = line.split(" ");
            eil=parts[1];
            
            m = Integer.parseInt(parts[0]);
            for (int j = 0; j <= m; j++){
                
                num = Integer.parseInt(eil.substring(j, j+1));
                
                if(j > standing){
                     need += j - standing;
                     standing += num + j - standing;
                } else {
                    standing += num;
                }
                //System.out.print(i+" "+j+" "+standing+" "+need+"\n");
              
            }
            
             output.write("Case #"+i+": "+need+"\n"); 
           }  
        textReader.close();
        output.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
