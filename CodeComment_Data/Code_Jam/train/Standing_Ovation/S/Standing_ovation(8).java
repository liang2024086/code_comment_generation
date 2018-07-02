package methodEmbedding.Standing_Ovation.S.LYD2047;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Adithya Rao
 */
public class Standing_ovation
{
    public static void main(String args[])
    {
        Scanner in = new Scanner ( System.in);
        int t= in.nextInt();
        int i = 1 ;
        while ( i <= t)
        {
            int s = in.nextInt();
            String s1= in.next();
            int [] a = new int [s+1];
            for ( int j = 0 ; j <= s ; ++j)
            {
                a[j]=s1.charAt(j)-48;
            }
           
            System.out.print("Case #"+i+": ");
            int total = 0;
            int ans = 0 ;
            if(s==0)
            {
                System.out.print("0");
            }
            else
            {
                for(int j = 0 ; j < s ;++j)
                {
                    
                    total += a[j];
                    if(j+1 > total)
                    {
                        ans += j+1-total;
                        total = total + 1;
                    }
                }
                System.out.print(ans);
                
            }
            System.out.println();
            ++i;
                
            
        }
    }
}
