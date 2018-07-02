package methodEmbedding.Magic_Trick.S.LYD1388;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author GARVITA ALLABADI
 */
public class magic {
    
   public static void main(String args[]) throws IOException{
    
    BufferedReader newScanner = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(newScanner.readLine());
       
       for (int i=0;i<t;i++){
            
            int n = Integer.parseInt(newScanner.readLine());
            n--;
            
            String a=newScanner.readLine();
            String [] arr1=a.split(" ");
            int [][] a1=new int [4][4];
            
            
            for(int j=0;j<4;j++){
                a1[0][j]=Integer.parseInt(arr1[j]);
                }
            
            a=newScanner.readLine();
            arr1=a.split(" ");
            
            for(int j=0;j<4;j++){
                a1[1][j]=Integer.parseInt(arr1[j]);
                }
            
            a=newScanner.readLine();
            arr1=a.split(" ");
            
            for(int j=0;j<4;j++){
                a1[2][j]=Integer.parseInt(arr1[j]);
                }
            
            a=newScanner.readLine();
            arr1=a.split(" ");
            
            for(int j=0;j<4;j++){
                a1[3][j]=Integer.parseInt(arr1[j]);
                }
            
            int m = Integer.parseInt(newScanner.readLine());
            m--;
            
            String b=newScanner.readLine();
            String [] brr1=b.split(" ");
            int [][] b1=new int [4][4];
            
            
            for(int j=0;j<4;j++){
                b1[0][j]=Integer.parseInt(brr1[j]);
                }
            
            b=newScanner.readLine();
            brr1=b.split(" ");
            
            for(int j=0;j<4;j++){
                b1[1][j]=Integer.parseInt(brr1[j]);
                }
            
            b=newScanner.readLine();
            brr1=b.split(" ");
            
            for(int j=0;j<4;j++){
                b1[2][j]=Integer.parseInt(brr1[j]);
                }
            
            b=newScanner.readLine();
            brr1=b.split(" ");
            
            for(int j=0;j<4;j++){
                b1[3][j]=Integer.parseInt(brr1[j]);
                }
            
            int count=0,temp=0;
            for(int k=0;k<4;k++){
                for(int l=0;l<4;l++){
                if(a1[n][k]== b1[m][l]){
                    count++;
                    temp=a1[n][k];
                    
                }
                    
            }
            }
    
            System.out.print("Case #"+(i+1)+": ");
            
            if(count==1){
                System.out.print(temp);
            }
            
            else if(count==0){
                System.out.print("Volunteer cheated!");
       }
            
            else if(count>1){
                System.out.print("Bad magician!");
       }
            
            System.out.print("\n");
            
       }
    
   }
    
}
