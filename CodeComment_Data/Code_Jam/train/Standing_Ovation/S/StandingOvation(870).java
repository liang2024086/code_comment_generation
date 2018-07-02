package methodEmbedding.Standing_Ovation.S.LYD462;


import java.util.Scanner;


public class StandingOvation {
 
    public static void main(String cd[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int smax=in.nextInt();
            String s=in.next();
            int temp=Integer.parseInt(s.charAt(0)+"");
            long ans=0;    
            for(int j=1;j<s.length();j++)
            {
                int shy=Integer.parseInt(s.charAt(j)+"");
                if(shy>0)
                {if(temp-j>0)
                {
                    temp+=shy;
                }
                else
                {
                    ans+=j-temp;
                    temp+=shy+ans;
                }
               // System.out.println(temp +" "+ ans);
                }
            }
            System.out.println("Case #"+(i+1)+": "+ans);
            
        }
    }
}
