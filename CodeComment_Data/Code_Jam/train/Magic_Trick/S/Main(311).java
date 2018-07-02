package methodEmbedding.Magic_Trick.S.LYD2111;

import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader(args[0]));
		int T = in.nextInt();
		int [] a = new int[2];
				
		HashSet<Integer> hs1 = new HashSet<Integer>(),
						 hs2 = new HashSet<Integer>();
		
		for (int i=0; i<T; i++) {
			a[0] = in.nextInt();
			in.nextLine();
			for (int j=1; j<=4; j++) {
				if (a[0]==j) {
					for (int k=1; k<=4; k++) hs1.add(in.nextInt());
					in.nextLine();
				} else in.nextLine();
			}
			a[1] = in.nextInt();
			in.nextLine();
			for (int j=1; j<=4; j++) {
				if (a[1]==j) {
					for (int k=1; k<=4; k++) hs2.add(in.nextInt());
					in.nextLine();
				} else in.nextLine();
			}
			hs1.retainAll(hs2);
			
			if (hs1.size()==0) {System.out.printf("Case #%d: Volunteer cheated!%n", i+1);}
			else if (hs1.size()==1) {System.out.printf("Case #%d: %d%n", i+1, hs1.iterator().next());}
			else if (hs1.size()>=2) {System.out.printf("Case #%d: Bad magician!%n", i+1);}
			
			hs1.clear();
			hs2.clear();
		}
		
		
	}

}
