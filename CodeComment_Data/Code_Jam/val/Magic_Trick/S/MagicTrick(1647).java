package methodEmbedding.Magic_Trick.S.LYD1880;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author sahilthakur1
 */
public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       int T,ans1,ans2,count=0,m = 0;
       int[][] arr1 = new int[4][4];
       int[][] arr2 = new int[4][4];
       Scanner in = new Scanner(new FileReader("/Users/sahilthakur1/Documents/A-small-attempt1.in"));
       FileWriter wr = new FileWriter(new File("/Users/sahilthakur1/Documents/smalloutput.txt"));
       T = in.nextInt();
       if(T>=1 && T<=100){
           String[] str = new String[T];
           for(int z=0;z<T;z++){
           
           ans1 = in.nextInt()-1;
           if(ans1>=0 && ans1<=3){
           for(int i=0; i<4;i++){
               for(int j=0;j<4;j++){
                   arr1[i][j] = in.nextInt();
               }
           }
           }
           ans2 = in.nextInt()-1;
           if(ans2>=0 && ans2<=3){
           for(int i=0;i<4;i++){
               for(int j=0;j<4;j++){
                   arr2[i][j] = in.nextInt();
               }
           }
           }
           for(int l=0;l<4;l++){
           for(int k=0;k<4;k++){
               if(arr1[ans1][l]==arr2[ans2][k]){
                   m=l;
                   count=count+1;
               }
                   
               }
               
           }
           if(count==0){
                       str[z] = " Volunteer cheated!";
                   }
                   if(count>1){
                       str[z] = " Bad magician!";
                   }
                   if(count==1){
                       str[z] =  " "+ arr1[ans1][m];
           }
                   count=0;
           } 
       
           for(int x=0;x<T;x++){
               wr.write("Case #"+(x+1)+":"+str[x]+"\n");
               wr.flush();
          
           }    
       }
       
    }
}


