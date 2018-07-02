package methodEmbedding.Revenge_of_the_Pancakes.S.LYD648;

import java.util.Scanner;

class Main
{
   
   public static void main(String ar[])
    {

        Scanner in=new Scanner(System.in);
        int t;
        t=in.nextInt();

        for(int i=0;i<t;i++)
        {
            String s=in.next();
            int ans;
            if (s.charAt(0)=='+')
                ans=0;
            else
                ans=1;
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(j)=='-' && s.charAt(j-1)=='+')
                    ans=ans+2;
            }
            
                System.out.println("Case #"+(i+1)+": "+ans);
         }
        }

}

