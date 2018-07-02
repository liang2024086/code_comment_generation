package methodEmbedding.Magic_Trick.S.LYD1026;

import java.util.*;
import java.io.*;

class magic {
    public static void main(String[] args) throws IOException{
         
         int i, j, k, t, temp;
         
         int ans1;
         int ans2;
         int[][] Board1 = new int[4][4];
         int[][] Board2 = new int[4][4];
         
         
         
         Scanner reader = new Scanner(new File("input.txt"));
         
         t = reader.nextInt();
         
         for(i=0;i<t;i++){
            ArrayList answers = new ArrayList();
            ans1 = reader.nextInt() - 1;
            
            for(j=0;j<4;j++){
               for(k=0;k<4;k++){
                  Board1[j][k] = reader.nextInt();
               }
            }
            
            ans2 = reader.nextInt() - 1;
            
            for(j=0;j<4;j++){
               for(k=0;k<4;k++){
                  Board2[j][k] = reader.nextInt();
               }
            }
            
            
            for(j=0;j<4;j++){
               for(k=0;k<4;k++){
                  
                  if(Board1[ans1][j] == Board2[ans2][k]){
                     answers.add(Board1[ans1][j]);
                  }
                  
               }
            }
            
            
            System.out.print("Case #"+(i+1)+": ");
            
            if(answers.size() == 1){
               System.out.println(answers.get(0));
            }
            if(answers.size() < 1){
               System.out.println("Volunteer cheated!");
            }
            if(answers.size() > 1){
               System.out.println("Bad magician!");
            }
            
            
            
            
         }   
            
         
         
         
         
         
    }
    
    
}
