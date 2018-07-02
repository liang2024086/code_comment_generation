package methodEmbedding.Magic_Trick.S.LYD2031;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.HashSet;


    


public class CodeJam2 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        
        int t,r1,r2;
        int arr1[]=new int[16];
        int arr2[]=new int[16];
        
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            r1=sc.nextInt();
            int j=0;
            //int r=0;
            while(j<16){
                arr1[j++]=sc.nextInt();
            }
            r2=sc.nextInt();
            j=0;
            while(j<16){
                arr2[j++]=sc.nextInt();
            }
            
            int count=0,num=0;
            j=0;
            for(j=r1*4 -4;j<r1*4;j++){
                for(int k=r2*4 -4;k<r2*4;k++){
                   if(arr1[j]==arr2[k]){
                       count++;
                       num=arr1[j];
                   }
                }
            }
            
            if(count==0)
                System.out.println("Case #" + (i+1)+ ": Volunteer cheated!\n");
            else if(count==1)
                 System.out.println("Case #" + (i+1)+": "+num +"\n");
            else
                 System.out.println("Case #" + (i+1)+": Bad magician!\n");
            
        }
    }
    
       }


