package methodEmbedding.Counting_Sheep.S.LYD1126;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.time.Clock.system;
import java.util.Arrays;
import java.util.Scanner; 


/**
 *
 * @author Miguel
 */
public class Codejam {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner in=new Scanner(System.in);
        
       
        int casos=in.nextInt();
        
        
        int[] compare={0,1,2,3,4,5,6,7,8,9};
        
        
        int count=0;
        int mult=1;
        int n=1;
        

        while(n<=casos){
            int input=in.nextInt();
            int aux=input;
            int aux2=input;
            count=0;
            mult=1;
            int[] nums={11,0,0,0,0,0,0,0,0,0};
            int aux3=0;
           
           
            
            while(count<10){
                if(input==0){
                    
                    break;
                }
                aux2=input*mult;
                String x=String.valueOf(aux2);  
                count=0;
                aux3=aux2;
                
                
                for (int i=0; i<x.length() ; i++){     
                    aux=aux2%10;
                    nums[aux]=aux;
                    aux2=aux2/10;

                }               
                for (int i=0;i<compare.length ; i++){
                    if(nums[i]==compare[i]){
                        count++;
                    }    
                }
                mult++;
                
            }
            if(input==0){
                System.out.println("Case #"+n+": INSOMNIA");
            }
            else{
                System.out.println("Case #"+n+": "+aux3);
            
            }n=n+1;

        } 
       
    }
    
}
