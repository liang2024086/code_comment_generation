package methodEmbedding.Revenge_of_the_Pancakes.S.LYD156;

import java.util.*;
import java.io.*;

public class B
{
    public static void main(String[] args) throws Exception
    {
        int dataset = 10;
        Scanner input = new Scanner(System.in);
        int numCases = Integer.parseInt(input.nextLine());

        
        for (int n = 0; n < numCases; n++)
        {
            int num = 0;
            String pCakes = input.nextLine();
            
            for (int i = 0; i < pCakes.length(); i++) {
                if (pCakes.charAt(i) == '+')
                    continue;

                if (pCakes.charAt(i) == '-') {
                    
                    if ((i-1) >= 0  && pCakes.charAt(i-1) == '+') {

                        String front = pCakes.substring(0,i);
                        String back = pCakes.substring(i,pCakes.length());
                        front = front.replace("+", "-");
                        pCakes = front + back;
                        num++;
                        
                    }

                    if ((i+1) < pCakes.length() && pCakes.charAt(i+1) == '-')
                        continue;

                    // Reverse turning part
                    String front = pCakes.substring(0,i+1);
                    String back = pCakes.substring(i+1,pCakes.length());
                    StringBuilder toChange = new StringBuilder();
                    toChange.append(front);
                    front = toChange.reverse().toString(); 
                    
                    front = front.replace("+", "0");
                    front = front.replace("-", "+");
                    front = front.replace("0", "-");

                    pCakes = front + back;
                    num++;
                    //
                }
            }

            System.out.printf("Case #%d: %d\n", n + 1, num);
            
        }
    }
}
