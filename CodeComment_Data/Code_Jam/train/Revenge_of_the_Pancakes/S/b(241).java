package methodEmbedding.Revenge_of_the_Pancakes.S.LYD399;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		long T = sc.nextLong();
		sc.nextLine();
		for (long i = 0; i < T; i++) {
			String st = sc.nextLine();
			//System.out.println(st);
			
			int[] map = new int[st.length()];
			for (int j = 0; j < st.length(); j++) {
				if (st.charAt(j)=='+')
					map[j] = 1;
				else
					map[j] = 0;
			}

			int turn = 0;			
			int target = 1;
			for (int j = st.length()-1; j>=0; j--) { 
				if (map[j]==target) {
				
				} else {
					turn++;
					target = 1-target;
				}
			}

			System.out.println("Case #"+(i+1)+": "+turn);
		}
	}
}
