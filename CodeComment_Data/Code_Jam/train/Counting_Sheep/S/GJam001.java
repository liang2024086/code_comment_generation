package methodEmbedding.Counting_Sheep.S.LYD1118;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
class GJam1
{
    public static void main(String [] args)
    {
        try{
        Scanner sc=new Scanner(System.in);
        int i=0;
        int t=sc.nextInt();
        boolean []digits=new boolean[10];
        Arrays.fill(digits,false);
        for(i=0;i<t;i++)//test cases
        {
            int x=1;
            int n=sc.nextInt();
            boolean ch=true;
            int count=0;
            Arrays.fill(digits,false);
            if(n!=0)
            {
            while(count<10)
            {
                int p=n*(x++);
                while(p!=0)
                {
                    if(!digits[p%10])
                    {
                        count++;
                        digits[p%10]=true;
                    }
                    else
                    {
                        digits[p%10]=true;
                    }
                    p/=10;
                }
            }
            System.out.println("Case #"+(i+1)+": "+n*(x-1));
            }
            else
            System.out.println("Case #"+(i+1)+": "+"INSOMNIA");
        }
    }
    catch(Exception e){};
    }
}
        
