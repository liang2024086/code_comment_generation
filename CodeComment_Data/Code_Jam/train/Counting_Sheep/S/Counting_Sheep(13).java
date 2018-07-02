package methodEmbedding.Counting_Sheep.S.LYD953;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Adithya Rao
 */
public class Counting_Sheep 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i = 0;
        while(i  < t)
        {
            int n = in.nextInt();
            long k = (long)n;
            Set<Long> set = new HashSet<>();
            int j = 0;
            for(j = 1 ; j <= 100 ; ++j)
            {
                k = (long)(n * j);
                while(k != 0)
                {
                    set.add(k%10);
                    k /= 10;
                }
                if(set.size() == 10)
                    break;
            }
            if(set.size() == 10 )
                System.out.println("case #"+(i+1)+": "+ (n*j));
            else
                System.out.println("case #"+(i+1)+": INSOMNIA");
            ++i;
        }
    }
    
}
