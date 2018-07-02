package methodEmbedding.Magic_Trick.S.LYD2181;

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
        
        FileReader fis = new FileReader("./src/MagicTrick/A-small-attempt0.in");
        BufferedReader br = new BufferedReader(fis);
        
        PrintWriter writer = new PrintWriter("./src/MagicTrick/smallOutput.in", "UTF-8");
        
        int ans1,ans2;
        int count,card = 0;
        
        String[] a1,a2;
        
        String line;
        
        int N = Integer.parseInt(br.readLine().trim());
        System.out.println(N);
        
        for(int i=0;i<N;i++){
            
            count = 0;
            ans1 = Integer.parseInt(br.readLine().trim());
            System.out.println(ans1);
            
            for(int j=1;j<ans1;j++){
                
                line = br.readLine();
            }
            
            a1 = br.readLine().trim().split(" ");
            System.out.println(Arrays.toString(a1));
            
            for(int j=4;j>ans1;j--){
                
                line = br.readLine();
            }
            
            ans2 = Integer.parseInt(br.readLine().trim());
            System.out.println(ans2);
            
            for(int j=1;j<ans2;j++){
                
                line = br.readLine();
            }
            
            a2 = br.readLine().trim().split(" ");
            System.out.println(Arrays.toString(a2));
            
            for(int j=4;j>ans2;j--){
                
                line = br.readLine();
            }
            
            for(int a=0;a<4;a++){
                for(int b=0;b<4;b++){
                    
                    if(a1[a].equals(a2[b])){
                        
                        count++;
                        card = Integer.parseInt(a1[a]);
                        System.out.println(count);
                        System.out.println(a1[a]);
                    }
                }
            }
            
            if(count == 0){
                
                writer.println("Case #" + (i+1) + ": Volunteer cheated!");
            }
            else if(count == 1){
                
                writer.println("Case #" + (i+1) + ": " + card);
            }
            else if(count > 1){
                
                writer.println("Case #" + (i+1) + ": Bad magician!");
            }
        }
        
        writer.close();
    }
}
