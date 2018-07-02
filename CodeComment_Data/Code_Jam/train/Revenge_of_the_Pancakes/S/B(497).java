package methodEmbedding.Revenge_of_the_Pancakes.S.LYD956;


import java.util.*;
import java.io.*;

public class B
{
    public static void main(String ... orange) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            String S = input.next();
            int compare = 0;
            int result = 0;
            for (int i = 1; i < S.length(); i++) {
            	
            	if (S.charAt(i)!=S.charAt(compare)) {
					compare = i;
					result++;
				}
            }
            if (S.charAt(S.length()-1)=='-') {
				result++;
			}
            
            
            System.out.println("Case #" + (n+1) +": "+result);
        }
    }
}
