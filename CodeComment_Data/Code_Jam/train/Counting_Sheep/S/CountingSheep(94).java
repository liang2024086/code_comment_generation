package methodEmbedding.Counting_Sheep.S.LYD1069;

import java.io.*;
import java.util.*;

public class CountingSheep {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("countingsheep.out"));
		
		int t = in.nextInt();
		for(int i = 0; i < t; i++){
			int n = in.nextInt();
			int m = 1;
			boolean[] b = new boolean[10];
			
			while (true){
				int N = n*m;
				
				if (N == 0){
					out.println("Case #" + (i+1) + ": INSOMNIA");
					break;
				}
				
				for (int j = N; j >= 1; j /= 10){
					b[j%10] = true;
				}
				
				boolean perfect = true;
				for (int j = 0; j < 10; j++){
					if (!b[j]){
						perfect = false;
					}
				}
				if (perfect){
					out.println("Case #" + (i+1) + ": " + N);
					break;
				}
				m++;
			}
			
		}
		
		out.close();
		in.close();
	}
}
