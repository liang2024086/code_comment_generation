package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1004;

import java.util.*;
class panackle
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int t;
      t=in.nextInt();
      in.nextLine();
      for(int k=1;k<=t;k++)
      {
            String str;
            int flips=0;
            str=in.nextLine();
            boolean pom=false;
             if(str.charAt(0)=='-')
               {
                  pom=true;
                  flips+=1;
               }
            for(int i=1;i<str.length();i++)
            {
               if(str.charAt(i)=='+')
               {
                   pom=false;
                   continue;
               }
               
               if(pom==true)
               continue;
               pom=true;
               flips+=2;
            }
            System.out.println("Case #"+k+": "+flips);
      }
   }
}
