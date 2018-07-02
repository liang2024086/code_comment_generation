package methodEmbedding.Magic_Trick.S.LYD1171;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;

public class MagicTrack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		while (sc.hasNext()) {
			int t = sc.nextInt();
			sc.nextLine();
			for (int i = 1; i <= t; i++) {
				int first = sc.nextInt();
				HashSet<Integer> hashSet = new HashSet<Integer>();
				for(int j=0;j<=first-1;j++)
					sc.nextLine();
				for(int j=0;j<4;j++)
					hashSet.add(sc.nextInt());
				for(int j=0;j<5-first;j++)
					sc.nextLine();
				
				int second = sc.nextInt(),res = 0;
				for(int j=0;j<=second-1;j++)
					sc.nextLine();
				for(int j=0;j<4;j++){
					int tmp = sc.nextInt();
					if(hashSet.contains(tmp))
						res = tmp;
					else
						hashSet.add(tmp);
				}
				for(int j=0;j<5-second;j++)
					sc.nextLine();
				if(hashSet.size()<7)
					System.out.println("Case #"+i+": Bad magician!");
				else if(hashSet.size()==7)
					System.out.println("Case #"+i+": "+res);
				else
					System.out.println("Case #"+i+": Volunteer cheated!");
			}
			
		}
	}
}
