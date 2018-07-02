package methodEmbedding.Revenge_of_the_Pancakes.S.LYD940;

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
public class Revenge_of_the_Pancakes 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i = 0 ;
        while(i < t)
        {
            String s = in.next();
            long ans = 0;
            boolean value = false;
            for(int j = s.length() -1 ; j >= 0 ; --j)
            {
                if(value == false)
                {
                    if(s.charAt(j) == '-')
                    {
                        ++ans;
                        value = true;
                    }
                }
                else
                {
                    if(s.charAt(j) == '+')
                    {
                        ++ans;
                        value = false;
                    }
                }
            }
            System.out.println("case #"+(i+1)+": "+ ans);
            //System.out.println("------------------------");
            ++i;
        }
    }
    
}
