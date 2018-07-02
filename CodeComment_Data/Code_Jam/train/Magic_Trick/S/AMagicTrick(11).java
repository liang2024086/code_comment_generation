package methodEmbedding.Magic_Trick.S.LYD942;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class AMagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>(), b = new HashSet<Integer>();
		Scanner in = new Scanner(System.in);
		
	    int T = in.nextInt();
	    
		for(int t = 1; t <= T; t++)
		{
			a.clear();
			int r = in.nextInt() - 1;
			for(int i=0; i<4; i++) 
				for(int j=0; j<4; j++) 
					if(i == r) 
						a.add(in.nextInt()); 
					else 
						in.nextInt();
			
			b.clear();			
			r = in.nextInt() - 1;
			for(int i=0; i<4; i++) 
				for(int j=0; j<4; j++) 
					if(i == r) 
						b.add(in.nextInt()); 
					else
						in.nextInt();
			
			a.retainAll(b);
			
			System.out.print("Case #" + t + ": ");
			if(a.isEmpty())
				System.out.println("Volunteer cheated!");
			else if(a.size() == 1)
				System.out.println(a.iterator().next());
			else
				System.out.println("Bad magician!");
				
		}
	}

}
