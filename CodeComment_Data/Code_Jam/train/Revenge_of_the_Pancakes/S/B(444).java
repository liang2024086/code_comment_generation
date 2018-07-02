package methodEmbedding.Revenge_of_the_Pancakes.S.LYD984;

import java.io.*;
import java.util.*;

public class B {
	static String infname = "B-small-attempt0.in";
	static String oufname = "B-small-attempt0.out";
//	static String infname = "in.txt";
//	static String oufname = "out.txt";
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader(infname));
		BufferedWriter bw = new BufferedWriter(new FileWriter(oufname));
		int Tn, T;
		Tn = sc.nextInt();
		sc.nextLine();
		for (T=1;T<=Tn;T++) {
			String s = sc.nextLine();
			bw.write(String.format("Case #%d: ", T));
			int ans = 0;
			char ch = s.charAt(0);
			for (int i=1;i<s.length();i++) {
				if (ch != s.charAt(i)) {
					ans++;
					ch = s.charAt(i);
				}				
			}
			if (s.charAt(s.length()-1) == '-') ans++;
			bw.write(ans+"\n");
		}
		bw.close();
	}

}
