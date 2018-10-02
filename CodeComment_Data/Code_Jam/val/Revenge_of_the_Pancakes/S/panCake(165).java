package methodEmbedding.Revenge_of_the_Pancakes.S.LYD662;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Sagar Bhatt
 */
public class panCake {
    
public static void main(String[] args)throws IOException{

    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int t;
    t=Integer.parseInt(br.readLine());
    int caseNo = 1;
    while(t!=0){
    
    String data=br.readLine();
    
    
    int flip =0;
    
        
        
        char[] temp=data.toCharArray();
            
        for(int i=temp.length-1;i>=0;i--){
        
            
            if(temp[i] == '-'){
            flip++;
                for(int k=0;k<=i;k++){
                
                if(temp[k] == '+'){
                    temp[k]='-';
                }else {
                    temp[k]='+';
                }
                
                }
                //System.err.println("flip:"+flip+Arrays.toString(temp));
            }
        }
    
    
        System.out.println("Case #"+caseNo+": "+flip);
        caseNo++;
    t--;
    }
    

}

}
