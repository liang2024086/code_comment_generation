package methodEmbedding.Magic_Trick.S.LYD2222;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class A {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("in.in"));
		PrintWriter out = new PrintWriter(new File("out.txt"));
		
		int ncas = sc.nextInt();
		for(int cas = 0; cas < ncas; cas++) {
			int one = sc.nextInt();
			for(int i = 0; i < (one - 1) * 4; i++) sc.nextInt();
			Set<Integer> ans = new HashSet<>();
			for(int i = 0; i < 4; i++) ans.add(sc.nextInt());
			for(int i = 0; i < (4 - one) * 4; i++) sc.nextInt();
			
			int two = sc.nextInt();
			for(int i = 0; i < (two - 1) * 4; i++) sc.nextInt();
			Set<Integer> ans2 = new HashSet<>();
			for(int i = 0; i < 4; i++) ans2.add(sc.nextInt());
			for(int i = 0; i < (4 - two) * 4; i++) sc.nextInt();
			
			ans.retainAll(ans2);
			
			if(ans.size() == 1) out.printf("Case #%d: %d\n", cas + 1, ans.iterator().next());
			else if(ans.size() > 1) out.printf("Case #%d: Bad magician!\n", cas + 1);
			else out.printf("Case #%d: Volunteer cheated!\n", cas + 1);
			
 		}
		
		out.flush();
	}
}
