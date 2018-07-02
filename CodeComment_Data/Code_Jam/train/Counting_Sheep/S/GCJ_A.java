package methodEmbedding.Counting_Sheep.S.LYD1219;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class GCJ_A {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("output_1.txt");
		FileReader in = new FileReader("A-small-attempt0.in");
	    BufferedReader input = new BufferedReader(in);
		int T = Integer.parseInt(input.readLine());
		int n, i = 1, I = 1;
		long x ,y=0;
		HashSet<Integer> set;
		while(T-- != 0){
			n = Integer.parseInt(input.readLine());
			set = new HashSet<>();
			pw.print("Case #"+(I++)+": ");
			if(n == 0){
				pw.println("INSOMNIA");
				continue;
			}
			i = 1;
			while(set.size() != 10){
				x = n*i;
				y = x;
				while(x != 0){
					if(!set.contains(x%10)){
						set.add((int)(x%10));
					}
					x /= 10;
				}	
						i++;
			
			}
			pw.println(y);
		    
		}
		
	    
	    
		pw.close();
		input.close();
		in.close();
	}
}
