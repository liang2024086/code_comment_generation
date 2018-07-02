package methodEmbedding.Counting_Sheep.S.LYD494;


import java.util.Scanner;


public class Mommy {
    public static void main(String[] args) {
        int count,l,d,k;
        Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           for(int i=1;i<=t;i++)
           {
               int n = sc.nextInt();
               boolean a[]= new boolean[10];
               count = 10;
               l=1;
               if(n==0){
                   System.out.println("Case #"+i+": INSOMNIA");   
               }
               else {
               while(count !=0){
                   k = l * n;
                   while(k!=0){
                   d = k%10;
                   if(!a[d])
                   {
                       count = count -1;
                       a[d]= true;
                   }
                    k /= 10;
                    
                   }
               l++;
               }
                   System.out.println("Case #"+i+": "+n*(l-1));
               } 
           }
    }
  
}
