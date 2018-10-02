package methodEmbedding.Counting_Sheep.S.LYD1484;

import java.io.*;
import java.util.*;

public class Codejamp {

    public static void main(String[] args) {
       
        
        try{
            FileInputStream in = new FileInputStream("A.in");
            Scanner sc = new Scanner(in);
         
            int T = sc.nextInt();
         
        
            for(int i =1; i<T+1;i++){
                int n = sc.nextInt();  
                Set<Integer> list = new TreeSet<>();
                int plus=n; int compteur=1;
                //remplisssage de list par caract????re ;
                if(n==0){System.out.println("Case #"+i+": INSOMNIA");}
                
                else{
                    String line=n+"";
                    
                    do{
                           plus=n*compteur;
                           compteur++; 
                           line=plus+"";
                            for(int j=0;j<line.length();j++){
                           list.add(line.charAt(j)-'0');
                             }  
                           
                     }while(list.size()<10);
                
                     System.out.println("Case #"+i+": "+plus)    ; 
                
                }
                
             
            }
            
        
        }
        catch(Exception e){
            System.out.println("erreur");
        }
    }
    
}
