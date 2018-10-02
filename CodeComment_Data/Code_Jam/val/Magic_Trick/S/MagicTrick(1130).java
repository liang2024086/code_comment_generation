package methodEmbedding.Magic_Trick.S.LYD1518;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MagicTrick {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("out");
		int t = Integer.parseInt(in.readLine());
		
		for(int i = 1; i <= t; i++) {
			
			int r1 = Integer.parseInt(in.readLine());
			Set<Integer> s1 = new HashSet<Integer>();
			for(int k = 1; k <= 4; k++) {
				
				String s = in.readLine();
				if(r1 == k) {
					
					String ss[] = s.split(" ");
					for(String sss : ss) {
						
						s1.add(Integer.parseInt(sss));
						
					}
					
				}
				
			}
			int r2 = Integer.parseInt(in.readLine());
			Set<Integer> s2 = new HashSet<Integer>();
			for(int k = 1; k <= 4; k++) {
				
				String s = in.readLine();
				if(r2 == k) {
					
					String ss[] = s.split(" ");
					for(String sss : ss) {
						
						s2.add(Integer.parseInt(sss));
						
					}
					
				}
				
			}
			s1.retainAll(s2);
			if(s1.size() == 1) {
				
				Iterator<Integer> it = s1.iterator();
				out.println("Case #" + i + ": " + it.next());
				
			}
			else if(s1.size() == 0) {
				
				out.println("Case #" + i + ": Volunteer cheated!");
				
			}
			else {
				
				out.println("Case #" + i + ": Bad magician!");
				
			}
			
		}
	
		out.close();
		
	}

}
