package methodEmbedding.Revenge_of_the_Pancakes.S.LYD124;

import java.util.*;
import java.lang.*;
import java.io.*;

class Pancake
{
	public static void main (String[] args) throws java.lang.Exception
	{
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		int T = in.nextInt();
		//System.out.println(T);
		for (int i=0; i<T; i++){
			String S = in.next();
			char[] charS = S.toCharArray();
			int last = S.length()-1;

			// remove all + from back
			for(int j=last; j>=0; j--){
				if (charS[j] == '-') break;
				else last--;
			}
			//for(int j=0;j<=last;j++) System.out.print(charS[j]);
			//System.out.println("");
			if(last == -1){
				System.out.println("Case #"+(i+1)+": 0");
				continue;
			}
			char previous = charS[0];
			int count = 1;
			for(int j=1;j<=last;j++) {
				if (charS[j] != previous) count++;
				previous= charS[j];
			}

			System.out.println("Case #"+(i+1)+": "+count);
		}
	}

}
