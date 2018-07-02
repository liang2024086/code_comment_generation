package methodEmbedding.Counting_Sheep.S.LYD1712;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author daishan
 */
public class Sheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long number;
        int tests,digits[],no,product,digit;
        long value;
        
        // TODO code application logic here
        try{
            BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
            tests = Integer.parseInt(br.readLine());
            for(int i=0;i<tests;i++){
                number = Long.parseLong(br.readLine());
                if(number==0){
                    bw.write("Case  #"+(i+1)+": INSOMNIA\n");
                    continue;
                }
                no=0;
                digits = new int[10];
                product=0;
                
                
                while(no<10){
                    product++;
                    value=product*number;
                    while(value!=0){
                        digit= (int) (value%10);
                        if(digits[digit]==0){
                            no++;
                            digits[digit]=1;
                        }
                        value=value/10;                        
                        
                    }
                    
                    
                }
                bw.write("Case  #"+(i+1)+": "+(number*product)+"\n");
                
            }
            br.close();
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
        
        
        
    }
    
}
