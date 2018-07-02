package methodEmbedding.Magic_Trick.S.LYD673;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class main {
	
	public static void main(String args[])
	{
		//System.out.println("Hello, world!");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i = 1;
		while( i <= N)
		{	
			int FirstRow = in.nextInt();
			HashSet<Integer> s = new HashSet<Integer>();
						
			for (int j=0;j<16;j++){
				int c = in.nextInt();
				if ( (j/4) == (FirstRow-1) ){
					s.add(c);
				}
			}
			
			int SecondRow = in.nextInt();
			int count = 0;
			int Result = -1;
			
			for (int j=0;j<16;j++){
				int t = in.nextInt();
				if ( (j/4) == (SecondRow-1) ){
					if (s.contains(t)){
						count ++;
						Result = t;
					}
				}
			}
			
						
			if ( count == 1 )
				System.out.println("Case #" + i + ": " + Result);
			else if ( count == 0  )
				System.out.println("Case #" + i + ": " + "Volunteer cheated!");
			else
				System.out.println("Case #" + i + ": " + "Bad magician!");
			
			i++;
		}
		
	}

}

