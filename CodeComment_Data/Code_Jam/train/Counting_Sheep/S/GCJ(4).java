package methodEmbedding.Counting_Sheep.S.LYD256;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class GCJ {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.dat"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.dat")));
		int t = in.nextInt();
		for(int test=0; test < t; test++){
			long n = in.nextLong();
			boolean vis[] = new boolean[10];
			long curr = 0;
			int cnt = 0;
			LABEL:
			for(int mul = 1; mul <= 1000000; mul++){
				curr = curr + n;
				String str = String.valueOf(curr);
				for(int i=0; i < str.length(); i++){
					int conv = Integer.parseInt(str.charAt(i)+"");
					if(!vis[conv]){
						vis[conv] = true;
						cnt++;
						if(cnt==10){
							break LABEL;
						}
					}
				}
			}
			if(cnt==10){
				out.println("Case #" + (test+1) + ": " + curr);
			}
			else{
				out.println("Case #" + (test+1) + ": " + "INSOMNIA");
			}
		}
		out.close();
	}
	

}
