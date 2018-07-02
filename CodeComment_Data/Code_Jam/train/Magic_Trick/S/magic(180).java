package methodEmbedding.Magic_Trick.S.LYD1054;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahesh
 */
import java.io.*;
public class magic {
     public static void main (String args []) throws IOException  {
         BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
         int n;
         int  array1[] =new int [4];
         int array2 [] = new int [4];
         int row1,row2;
         String s1,s2,s3,s4,temp[];
         n= Integer.parseInt(br.readLine());
         for(int i=1;i<=n;i++){
             int num=0,count =0;
             row1 = Integer.parseInt(br.readLine());
             s1=br.readLine();
             s2=br.readLine();
             s3=br.readLine();
             s4=br.readLine();
             if(row1==1) {
                 temp = s1.split(" ");
             }
             else if (row1==2) {
                 temp = s2.split(" ");
             } 
             else if (row1==3) {
                 temp= s3.split(" ");
             }
             else {
                 temp =s4.split(" ");
             }
             for(int j=0;j<4;j++) {
                 array1[j]= Integer.parseInt(temp[j]);
                 //System.out.println(array1[j]);
             }
             row2 = Integer.parseInt(br.readLine());
             s1=br.readLine();
             s2=br.readLine();
             s3=br.readLine();
             s4=br.readLine();
             if(row2==1) {
                 temp = s1.split(" ");
             }
             else if (row2==2) {
                 temp = s2.split(" ");
             } 
             else if (row2==3) {
                 temp= s3.split(" ");
             }
             else {
                 temp =s4.split(" ");
             }
             for(int j=0;j<4;j++) {
                 array2[j]= Integer.parseInt(temp[j]);
                 //System.out.println(array2[j]);
             }
             
            for(int j=0;j<4;j++) {
                for(int k=0;k<4;k++) {
                    if(array1[j]==array2[k]) {
                        num=array1[j];
                        count++;
                    }
                }
            }
            if(count==0) {
                System.out.println("Case #"+i+": "+"Volunteer cheated!");
            }
            else if (count >1) {
                System.out.println("Case #"+i+": "+"Bad magician!");
            }
            else {
                System.out.println("Case #"+i+": "+num);
            }
         }
     }
    
}
