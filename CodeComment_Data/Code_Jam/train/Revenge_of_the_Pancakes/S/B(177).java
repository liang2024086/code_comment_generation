package methodEmbedding.Revenge_of_the_Pancakes.S.LYD350;

import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T, count;
        String i;
        T=input.nextInt();
        
        for(int k=1;k<=T;k++)
        {
            count = 0;
            i = input.next();
            char[] charArray = i.toCharArray();
            
            // Starting from the bottom/end
            char previousElement = charArray[charArray.length-1];
            for(int j=(charArray.length-1); j>=0; j--) 
            {                
                if(charArray.length-1 == j)
                {
                    if(charArray[j] == '-')
                        count++;
                    else
                      continue;
                }
                
                if((j != 0) && (charArray[j] == charArray[j-1]))
                    continue;
                
                if((previousElement != charArray[j]))
                    count++;
                
                previousElement = charArray[j];
            }
            System.out.println("Case #"+k+": "+count);
        }
    }
}

            
            
