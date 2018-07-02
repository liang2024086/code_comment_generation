package methodEmbedding.Magic_Trick.S.LYD1067;

import java.util.*;
class magician
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int arr[][]=new int[4][4];
            int ch1=sc.nextInt();
            for(int a=0;a<=3;a++)
            {
                for(int b=0;b<=3;b++)
                {
                    arr[a][b]=sc.nextInt();
                }
            }
            int ch2=sc.nextInt();
            int arr2[][]=new int[4][4];
            for(int a=0;a<=3;a++)
            {
                for(int b=0;b<=3;b++)
                {
                    arr2[a][b]=sc.nextInt();
                }
            }
            int c=0,ans=0;
            for(int a=0;a<=3;a++)
            {
                for(int b=0;b<=3;b++)
                {
                    if(arr[ch1-1][a]==arr2[ch2-1][b])
                    {
                        c++;
                        ans=arr[ch1-1][a];
                    }
                }
            }
            if(c==1)
                System.out.println("Case #"+i+": "+ans);
            else if(c==0)
                System.out.println("Case #"+i+": Volunteer cheated!");
            else
                System.out.println("Case #"+i+": Bad magician!");
        }
    }
}
                
                           
            
