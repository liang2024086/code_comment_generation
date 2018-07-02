package methodEmbedding.Counting_Sheep.S.LYD1280;

import java.math.BigInteger;
import java.util.*;

public class prob1 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String[] store = new String[T];
		scan.nextLine();
		for (int i = 1; i <= T; i++)
		{
			BigInteger N = new BigInteger(scan.nextLine()),
					   cur = BigInteger.ZERO;
			
			if (N.equals(cur)) store[i-1] = "Case #" + i + ": INSOMNIA";
			else {
				HashSet<Character> sofar = new HashSet<Character>();
				while (sofar.size() != 10) {
					cur = cur.add(N);
					for (int j = 0; j < cur.toString().length(); j++)
						sofar.add(cur.toString().charAt(j));
				}
				
				store[i-1] = "Case #" + i + ": " + cur.toString();
			}
		}
		
		for (int i = 0; i < T; i++)
			System.out.println(store[i]);
	}

}
