package methodEmbedding.Revenge_of_the_Pancakes.S.LYD794;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.*;

/**
 *
 * @author sans
 */
public class Ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int nCases,count=0,j;
        String[] panCake=new String[200];
        Scanner in=new Scanner(System.in);
        nCases=in.nextInt();
        for(int i=0;i<nCases;i++){
            panCake[i]=in.next();
        } 
        for(int i=0;i<nCases;i++){
            if(panCake[i].length()==1){
                if(panCake[i].charAt(0)=='-')
                    count=1;
            }
            else{
                try{
            for(j=0;j<panCake[i].length();j++){
                if(j==panCake[i].length()-1){
                    if(panCake[i].charAt(j)=='-'){
                /*int a=0;
                do{
                  panCake[i].replace(panCake[i].charAt(a),'+');
                  a++;
                }while(a<j+2);*/
                     count++;
                     //System.out.println("Count2:"+count);
            }
                }
                else{
                if(panCake[i].charAt(j)!=panCake[i].charAt(j+1)){
                    int k=0;
                    do{
                        panCake[i].replace(panCake[i].charAt(k), panCake[i].charAt(j+1));
                        k++;
                    }while(k<j+1);
                    count++;
                    // System.out.println("Count1:"+count);
                }
            }
            }
                }catch(Exception e){}
            
        }
            System.out.println("Case #"+(i+1)+": "+count);
            count=0;
        }
        
    }
    
}
