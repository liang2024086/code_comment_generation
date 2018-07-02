package methodEmbedding.Magic_Trick.S.LYD2089;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spas
 */
import java.util.*;
public class Main {
 public static void main(String args[])
 {   
     Scanner in=new Scanner(System.in);
     int arr[][]=new int[4][4];
     int temp[]=new int[4];
     int num=in.nextInt();
     for(int i=0; i<num; i++)
     {
         int x=in.nextInt();
         for(int j=0; j<4; j++)
         {
             for(int k=0; k<4; k++)
             {
                 arr[j][k]=in.nextInt();
                 if(j==x-1)
                     temp[k]=arr[j][k];
             }
         }
         int y=in.nextInt(); int count=0; int val=0;
         for(int j=0; j<4; j++)
         {
             for(int k=0; k<4; k++)
             {
                 arr[j][k]=in.nextInt();
                 if(j==y-1)
                 {
                     for(int m=0; m<4; m++)
                     {
                         if(temp[m]==arr[j][k])
                         { count++; val=arr[j][k];} 
                     }
                 }
             }
         }
         if(count==1)
             System.out.println("Case #"+(i+1)+": "+val);
         else if(count==0)
             System.out.println("Case #"+(i+1)+": Volunteer cheated!");
         else
             System.out.println("Case #"+(i+1)+": Bad magician!"); 
     }
   }
}
