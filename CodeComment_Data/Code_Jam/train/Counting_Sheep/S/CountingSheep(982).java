package methodEmbedding.Counting_Sheep.S.LYD1125;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class CountingSheep {

	// passed: small, large - 15 points
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("/Users/joy/Documents/workspace/GCJ2016Qual/A-small-attempt0.in");
		FileWriter fileWriter = new FileWriter("/Users/joy/Documents/workspace/GCJ2016Qual/A-small-attempt0.out");
		BufferedReader in = new BufferedReader(fileReader);
		BufferedWriter out = new BufferedWriter(fileWriter);
		
		int t = Integer.parseInt(in.readLine());
		for(int i=0; i<t; i++) {
			int x = Integer.parseInt(in.readLine());
			HashSet<Integer> set = new HashSet<Integer>();
			if(x==0) {
				out.write(String.format("Case #%d: INSOMNIA",i+1));
			} else {
				int n = 1;
				long m = ((long)n)*x;
				while(set.size()!=10) {
					m = ((long)n)*x;
					long m2 = m;
					while(m2>0) {
						int d = (int)(m2%10);
						set.add(d);
						m2 /= 10;
					}
					n++;
				}
				out.write(String.format("Case #%d: %d",i+1,m));
			}
			if(i<t-1) 
				out.write("\n");
		}
		in.close();
		out.close();
	}
}
