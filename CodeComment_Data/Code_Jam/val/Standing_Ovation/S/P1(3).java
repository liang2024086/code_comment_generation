package methodEmbedding.Standing_Ovation.S.LYD709;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author fabriziodemaria
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fis = new FileInputStream("/Users/fabriziodemaria/NetBeansProjects/P1/src/A-small-attempt0.in");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        
        String line = null;
        line = br.readLine();
        
        int T = new Integer(line);
        
        for(int i = 0; i<T; i++){
            
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int levels = new Integer(st.nextToken());
            String audience = st.nextToken();
            
            int counter = 0;
            int friends = 0;
            
            for(int j = 0; j < levels; j++){
                //System.out.println("-> " + counter);
                counter += audience.charAt(j)-'0';
                if(counter<=j){
                    friends++;
                    counter++;
                }          
            }
         System.out.println("Case #" + (i+1) + ": " + friends);   
        }
        
    }
    
}
