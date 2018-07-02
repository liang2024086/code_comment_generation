package methodEmbedding.Magic_Trick.S.LYD129;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ENVY
 */
public class Cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int [][] array = new int [4][4];
        int [][] array1 = new int [4][4];
        
        for (int k=0; k<n; k++)
        { int m = input.nextInt();
          for (int i=0; i<4; i++){
            
            for (int j=0; j<4;j++)
                array [i][j] = input.nextInt();
            
          }
          int p = input.nextInt();
          for (int i=0; i<4; i++){
            
            for (int j=0; j<4;j++)
                array1 [i][j] = input.nextInt();
            
          }
          int o=0;
          int f=0;
          for (int y=0; y<4;y++){ 
              
          
          if ((array[m-1][y] == array1[p-1][0])||(array[m-1][y] == array1[p-1][1])||(array[m-1][y] == array1[p-1][2])||(array[m-1][y] == array1[p-1][3]))
          { 
              o++;
          f = array[m-1][y];}
          }   
          if (o==1)
          System.out.println("Case #"+(k+1)+": "+f);
         else if (o<1)
           System.out.println("Case #"+(k+1)+": Volunteer cheated!");
         else if (o>1)
           System.out.println("Case #"+(k+1)+": Bad magician!");
    }
         
        
    
    
}}
