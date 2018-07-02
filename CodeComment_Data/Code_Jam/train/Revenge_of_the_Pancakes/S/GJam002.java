package methodEmbedding.Revenge_of_the_Pancakes.S.LYD677;

import java.util.*;
class GJam002
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int t=sc.nextInt();
        for(i=0;i<t;i++)//test cases
        {
            String s=sc.next();
            int x=0;
            int l=s.length(); 
            for(int j=0;j<l-1;j++)
            {
                if(s.charAt(j+1)!=s.charAt(j))
                {
                    x++;
                }
            }
            if(s.charAt(l-1)=='-')
                x++;
            System.out.println("Case #"+(i+1)+": "+x);
        }
    }
}
