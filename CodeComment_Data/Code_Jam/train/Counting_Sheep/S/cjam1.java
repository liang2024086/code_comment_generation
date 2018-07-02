package methodEmbedding.Counting_Sheep.S.LYD1715;

import java.util.*;
public class cjam1
{
   public static void main(String args[])
   {
      Scanner cin = new Scanner(System.in);
      int X[]={20,0,0,0,0,0,0,0,0,0};
      int j,k=1,h=1,l,p=1;
      
     // System.out.println("Enter the number of test cases");
      int N=cin.nextInt();
      while(N!=0)
      {    
         //  System.out.println("Enter the value of N");
           j=cin.nextInt();
           if(j!=0)
           {
              k=0;h=1;
              while(h==1)
              {   k++;
                 l=j*k;
                 while(l!=0)
                 {  
                     X[l%10]=l%10;
                      l=l/10;
                      
                 }
                 h=0;
                 for(int y=0;y<10;y++)
                 {
                     if(X[y]!=y)
                         h=1;           
                 }    
             
               
              } 
               System.out.println("Case #"+p +": "+k*j); 
               for(int y=0;y<10;y++)
                 {
                     X[y]=20;
                 }
            }    
            else  System.out.println("Case #"+p +": INSOMNIA");
           N--;p++;
      }
   }
}
