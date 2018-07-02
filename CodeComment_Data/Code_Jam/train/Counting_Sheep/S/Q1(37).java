package methodEmbedding.Counting_Sheep.S.LYD1493;


import java.io.*;
import java.util.*;

public class Class8 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int temp,temp1;
        int aj [];
        int i;
        int rec;
        int t2;
        int tempini;
        boolean ans;
        int sum = 0;
        
        for (int j=0;j<t;j++) {
            aj = new int [10];
            ans = true;
            i=1;
            rec = 0;
            temp = in.nextInt();
            tempini = temp;
            
            //System.out.println(temp+"     1     "+j);
            
     if (temp>0) {
         //sum = 0;
            while (i<=100 && ans) {
                temp =  tempini*i;
                sum = 0;
                rec = 0;
                t2 = temp/(int)Math.pow(10,rec);  
                
                while (t2>0) {
                    //System.out.println("t2 : " + t2);
                    rec++;
                    t2 = temp/(int)Math.pow(10,rec);
                        
                }
                
                //System.out.println("rec "+rec);
                t2 = temp;
                temp1 = temp;
                for (int l=0;l<rec;l++) {
                    t2 = temp1/(int)Math.pow(10,rec-l-1);
                    
                    
                    temp1 = temp1 - t2*(int)Math.pow(10,rec-l-1);
                    if (aj[t2]==0) {aj[t2]=1;}
                    //aj[t2]++;
                    
                    //System.out.println("Indices : "+t2);
                    
                }
                    
                
                for (int k=0;k<10;k++) {
                       sum = sum + aj[k];
                    //System.out.print("indi : "+k+":  "+aj[k]+", ");
                }
                //System.out.println();
                if (sum==10) {ans = false;}
                   //System.out.println(ans);
                   //System.out.println(sum);
                  
                   i++;
                 
             }
               
               System.out.println("Case #"+(j+1)+": "+temp); 
            }
                
                else {System.out.println("Case #"+(j+1)+": "+"INSOMNIA");}
                
                 
            
            
        }
        
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
