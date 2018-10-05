package methodEmbedding.Magic_Trick.S.LYD1045;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaly
 */
import java.io.*;
import java.util.StringTokenizer;

public class MagicTrick {
    
     public static void main (String [] args) throws IOException {
      BufferedReader h = new BufferedReader(new FileReader("ab.in"));
           PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hell.out.txt")));
             
            int a = Integer.parseInt(h.readLine());
            
            for ( int i=1; i<=a ;i++) {
                 
                 int n = Integer.parseInt(h.readLine());
                 int ar[]=new int[4];

                              for ( int j=1; j<=4 ;j++) {
                                  
              StringTokenizer as=new StringTokenizer(h.readLine());
             if (j==n)
             for(int t=0;t<4;t++){
                 ar[t]=Integer.parseInt(as.nextToken());
                 
             }
                              }
                              
                 int m = Integer.parseInt(h.readLine());
                 int arr[]=new int[4];
                 
                  for ( int k=1; k<=4 ;k++) {
                                  
              StringTokenizer as=new StringTokenizer(h.readLine());
             if (k==m)
             for(int t=0;t<4;t++){
                 arr[t]=Integer.parseInt(as.nextToken());
             }
                              }
                  int x=0;
                  int y=0;

                 for (int c = 0; c < 4; c++) {
                 for (int d = 0; d < 4; d++) {
                 
                     if(ar[c]==arr[d]){
                         x++;
                         y=ar[c];
                     }
                     
                 }

                     
                 }
                 
                 if(x==0)
                     out.println("Case #"+i+": Volunteer cheated!");
                 if(x==1)
                     out.println("Case #"+i+": "+y);
                 if(x>1)
                     out.println("Case #"+i+": Bad magician!");



                 
             }
             
              out.close();
    System.exit(0);
     }
    
}
