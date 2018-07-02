package methodEmbedding.Magic_Trick.S.LYD1101;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akansh
 */
public class CodeJam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int t = s.nextInt();
     int a[][] = new int[4][4];
     int b[] = new int[4];
     int r=1;
     while(t-->0)
     {
         int c=0,f = 0;
         int n = s.nextInt();
         for(int i = 0;i<4;i++)
             for(int j = 0;j<4;j++)
             {   
               a[i][j] = s.nextInt();  
               if(n==i+1)
                 b[j] = a[i][j];  
             }
         int m = s.nextInt();
         for(int i = 0;i<4;i++)
             for(int j = 0;j<4;j++)
             {
                 a[i][j]= s.nextInt();
                 if(i+1==m)
                 {
                     for(int k = 0;k<4;k++)
                         if(b[k]==a[i][j])
                         {
                             c++;
                             f = b[k];
                             break;
                         }
                 }   
             } 
         
         if(c==1)
             System.out.println("Case #"+r+": "+f);
         else if(c>1)
             System.out.println("Case #"+r+": Bad magician!");
         else if(c==0)
             System.out.println("Case #"+r+": Volunteer cheated!");
         r++;
     }
    }
}
