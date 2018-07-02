package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1151;

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
            
			String s  = input.next();
			String t = "";
			int len = s.length()-1;
			boolean flag = true;
			for(int i = len;i>=0;i--) {
				if(s.charAt(i)=='+'&&flag) {
					continue;
				}
				else {
					flag = false;
					t=s.charAt(i)+t;
				}
				
			}
			int count = 0;
			if(t.length()>0) {
				count = 1;
				char ch = t.charAt(0);
				for(int i=1;i<t.length();i++) {
					if(ch!=t.charAt(i)) {
						count++;
						ch = t.charAt(i);
					}
				}
			
			}
			System.out.println("Case #"+(n+1)+": "+count);
        }
    }
}

