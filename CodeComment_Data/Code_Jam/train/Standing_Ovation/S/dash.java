package methodEmbedding.Standing_Ovation.S.LYD1294;

import java.util.*;
public class dash 
{
    public static void main(String args[]) 
    {
      Scanner in =new Scanner(System.in);
      int test;
      test=in.nextInt();
        for (int i = 0; i <test; i++) 
        {
            int smax;
            smax=in.nextInt();
            String a=in.next();
            int stood=0;
            int invited=0;
            for (int j = 0; j <a.length(); j++) 
            {
               if(stood>=j&&(int)a.charAt(j)-48!=0)
               {
                   stood+=(int)a.charAt(j)-48;
               }
               else if(stood<j&&(int)a.charAt(j)-48!=0)
               {
                   int h=j-stood;
                   invited+=h;
                   stood+=(h+(int)a.charAt(j)-48);
               }
            }
            System.out.println("Case #"+(i+1)+": "+invited);
            
        }
    }
}
