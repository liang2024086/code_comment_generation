package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1172;

import java.io.*;
import java.util.*;

public class B{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));

		int N = Integer.parseInt(br.readLine());

		for(int p = 0; p < N; p++) {
			String s = br.readLine();
			int ret = 0;
			for(int i = 1; i < s.length(); i++) {
				if(s.charAt(i) != s.charAt(i-1)) ret++;
			}
			if(s.charAt(s.length()-1) == '-') ret++;
			pw.println("Case #" + (p+1) + ": " + ret);
		}


		pw.flush();
		pw.close();

	}
}
