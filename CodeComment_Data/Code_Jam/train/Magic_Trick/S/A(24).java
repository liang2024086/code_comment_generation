package methodEmbedding.Magic_Trick.S.LYD235;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(A.class.getSimpleName() + ".in"));
        PrintWriter out = new PrintWriter(new File(A.class.getSimpleName() + ".out"));
		
		//int[][] n1 = new int[4][4], n2 = new int[4][4];
				
		Set<Integer> s1 = new HashSet<Integer>(), s2 = new HashSet<Integer>();
		
		int tt = in.nextInt();
		for(int t=1; t<=tt; ++t) {            
            s1.clear();
			s2.clear();
			
			int a1 = in.nextInt();
					
			for(int i=1; i<=4; ++i)
				for(int j=1; j<=4; ++j) {
					int n = in.nextInt();
					if(i==a1) {
						s1.add(n);
					}
				}
			
			int a2 = in.nextInt();
			
			for(int i=1; i<=4; ++i)
				for(int j=1; j<=4; ++j) {
					int n = in.nextInt();
					if(i==a2) {
						s2.add(n);
					}
				}
			
			s1.retainAll(s2);
			
			int l = s1.size();
			if(l==1) {
				for(int n: s1) {
					out.println("Case #"+t+": "+n);
				}				
			} else if(l==0) {
				out.println("Case #"+t+": Volunteer cheated!");
			} else {
				out.println("Case #"+t+": Bad magician!");
			}
			
        }
		
		out.close();
	}
}
//C:\Program Files\Java\jdk1.8.0\bin
