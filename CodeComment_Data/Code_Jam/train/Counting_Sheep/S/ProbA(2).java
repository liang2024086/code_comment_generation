package methodEmbedding.Counting_Sheep.S.LYD1473;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class ProbA {
    public static void main(String[] args) {
        try{
          Scanner sc = new Scanner(new File("A.in"));
          int T= sc.nextInt();
          
            for (int i = 0; i < T; i++) {
               int N=sc.nextInt();
               if (N==0)
                   System.out.println("Case #"+(i+1)+": INSOMNIA");
               else
               {
                   ArrayList<Integer> List = new ArrayList<>();                
                   int j=1; 
                   int b=1;
                   int s=0;
                   while (List.size()!=10 )
                   {
                       
                        b=N*j;
                        s=b;
                       while (b!=0)
                       {
                         int t=b%10;
                         b=b/10;
                         if (!List.contains(t))
                             List.add(t);
                          
                       }
                        j++;
                   }
                   System.out.println("Case #"+(i+1)+": "+s);
               }
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
