package methodEmbedding.Magic_Trick.S.LYD1028;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner in;
		PrintWriter out;
		try {
			in = new Scanner(new File("A-small-attempt0.in"));
			out = new PrintWriter("a0.out");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
			return;
		}
		
		int numCases = in.nextInt();
		
		for (int t = 1; t <= numCases; t++){
			HashSet<Integer> s1 = new HashSet<Integer>();
			HashSet<Integer> s2 = new HashSet<Integer>();
			
			int r = in.nextInt();
			for (int i = 1; i <= r; i++){
				in.nextLine();
			}
			
			for (int i = 0; i < 4; i++){
				s1.add(in.nextInt());
			}
			
			for (int i = r; i <= 4; i++){
				in.nextLine();
			}
			
			r = in.nextInt();
			for (int i = 1; i <= r; i++){
				in.nextLine();
			}
			
			for (int i = 0; i < 4; i++){
				s2.add(in.nextInt());
			}
			for (int i = r; i <= 4; i++){
				in.nextLine();
			}
			
			
			s1.retainAll(s2);
			
			out.print("Case #" + t + ": ");
			
			if (s1.isEmpty()) out.println("Volunteer cheated!");
			else if (s1.size() > 1) out.println("Bad magician!");
			else out.println(s1.toArray(new Integer[1])[0]);
		}
		
		out.flush();
		
		in.close();
		out.close();
		
	}

	
}
