package methodEmbedding.Magic_Trick.S.LYD2183;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hppc
 */


import java.io.*;
import java.util.Scanner;

public class Comptiton {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) throws FileNotFoundException {
            // TODO code application logic here
            
            Scanner scan = new Scanner(new FileInputStream("C:\\Users\\hppc\\Desktop\\google jam\\comptiton\\src\\comptiton\\input.in"));
            PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
            
            int cas = scan.nextInt();
         for(int k =1;k<=cas;k++){
            int row = scan.nextInt();
            int [][] nums = new int[4][4];
            for(int i = 0; i<4;i++){
                  for(int j=0;j<4;j++){
                        nums[i][j]=scan.nextInt();
                  }
            }
            int row2= scan.nextInt();
               int [][] nums2 = new int[4][4];
            for(int i = 0; i<4;i++){
                  for(int j=0;j<4;j++){
                        nums2[i][j]=scan.nextInt();
                  }
            }
            int gess=0;
            int same= 0;
            boolean sheet=true; 
                    for(int i = 0;i<4;i++){
                          for(int j =0 ; j<4;j++){
                  if(nums[row-1][i]==nums2[row2-1][j])
                        same++;
                  if(nums[row-1][i]==nums2[row2-1][j])
                        sheet=false;
                  if(nums[row-1][i]==nums2[row2-1][j])
                  gess=nums[row-1][i] ;
                        
                  //System.out.println(sheet);
                          }
                  
                                          
            }
            
                    if(same>1)
                          System.out.println("Case #"+k+": Bad magician!");
                    else if(sheet)
                          System.out.println("Case #"+k+": Volunteer cheated!");
                       else   
                          System.out.println("Case #"+k+": "+gess);
                    
         }
     
      
            pw.close();}
            
            
      }

