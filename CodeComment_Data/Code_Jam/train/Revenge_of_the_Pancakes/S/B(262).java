package methodEmbedding.Revenge_of_the_Pancakes.S.LYD68;

import java.util.*;
import java.util.Set;
import java.io.*;

public class B
{
    public static void main(String[] args) throws Exception
    {
    	File file = new File("B-small-attempt0.in");
        Scanner input = new Scanner(file);
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            String str = input.next();
			char[] charArray = str.toCharArray();
			int posTill = 0;
			boolean contLoop = false;
			int flips = 0;
			do {
				posTill = -1;
				for(int i=0; i<charArray.length; i++) {
					if(charArray[i] == '-')
						posTill = i;
				}
				if(posTill > -1)
					flips++;
				for(int i=0; i<=posTill; i++) {
					charArray[i] = (charArray[i] == '-') ? '+' : '-';
				}
				String str1 = String.valueOf(charArray);
				if(str1.contains("-"))
					contLoop = true;	
				else
					contLoop = false;			
			} while(contLoop);
			System.out.println("Case #"+(n+1)+": "+flips);
        }
    }
}
