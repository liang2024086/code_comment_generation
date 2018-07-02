package methodEmbedding.Revenge_of_the_Pancakes.S.LYD603;

import java.util.Scanner;

public class HappyfuckingPancakes {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int x = 1;
        
        for (int i = 0; i < times; i++)
        {
            System.out.println(scanner.nextLine());
            
            int flips = 0; 
            String str = scanner.next(); 
            char[] stuff = str.toCharArray();
            char sign = stuff[0];
            for (int j = 1; j < stuff.length; j++)
            {
                if(stuff[j] != sign)
                {
                    flips++;
                    sign = stuff[j];
                }
            }
            
            if(sign == '-')
            {
                flips++; 
            }
            System.out.print("Case #" + x +": " + flips);
            x++; 
            
        }

    }

}
