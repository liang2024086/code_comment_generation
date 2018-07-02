package methodEmbedding.Magic_Trick.S.LYD329;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class A {
	static String problem = "A-small-attempt0";
	
	public static void main(String[] args) throws Throwable {
		Scanner in = new Scanner(new FileInputStream(problem + ".in"));
		PrintWriter out = new PrintWriter(new FileOutputStream(problem + ".out"));
		
		int T = Integer.parseInt(in.nextLine());
		for(int t = 1; t <= T; t++) {
			int row1 = Integer.parseInt(in.nextLine());
			List<String> map1 = new ArrayList<>();
			for(int i = 0; i < 4; i++) {
				map1.add(in.nextLine());
			}
			
			int row2 = Integer.parseInt(in.nextLine());
			List<String> map2 = new ArrayList<>();
			for(int i = 0; i < 4; i++) {
				map2.add(in.nextLine());
			}
			
			Set<String> a = new HashSet<>(Arrays.asList(map1.get(row1 - 1).split(" ")));
			Set<String> b = new HashSet<>(Arrays.asList(map2.get(row2 - 1).split(" ")));
			a.retainAll(b);
			
			out.print("Case #" + t + ": ");
			if(a.size() == 0) {
				out.println("Volunteer cheated!");
			}
			else if(a.size() == 1) {
				out.println(a.iterator().next());
			}
			else {
				out.println("Bad magician!");
			}
 		}
		
		out.flush(); 
		in.close();
		out.close();
	}
}
