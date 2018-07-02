package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1002;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rahul
 *
 */
public class FlippingPancakes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<t; i++)
        {
            String s = sc.nextLine();
            char curr = s.charAt(0);
            int flip = 0;

            for(int j=0; j<s.length(); j++)
            {
                char c = s.charAt(j);

                if(c != curr)
                {
                    flip++;
                    curr = c;
                }                
            }
            
            if(curr != '+')
                flip++;
            
            System.out.println("Case #" + (i+1) + ": " + flip);
        }
    }
}
