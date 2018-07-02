package methodEmbedding.Counting_Sheep.S.LYD261;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;


public class Sheep {
	
	public static void main(String args[]) throws Exception {
		InputStream in = Sheep.class.getResourceAsStream("/A-small.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		PrintWriter out = new PrintWriter(new FileWriter(new File("A-small.out")));
		
		int total = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= total; i++) {
				out.print("Case #" + i + ": ");
				Set<Integer> set = new HashSet<Integer>();
				
				long n = Integer.parseInt(br.readLine());
				if(n == 0) {
					 out.println("INSOMNIA");
					 continue;
				}
				int mul = 1;
				long x = 0;
				while(set.size() != 10) {
					x = n * mul;
					for(char c : String.valueOf(x).toCharArray()) set.add(c - '0');
					mul++;
				}
				
				out.println(x);
		}
		
		out.close();
		br.close();
	}
}
