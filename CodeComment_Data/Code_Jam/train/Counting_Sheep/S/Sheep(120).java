package methodEmbedding.Counting_Sheep.S.LYD983;

import java.util.*;
import java.io.*;


class Sheep {
	public static void main(String[] args) throws Exception{
		String filename = "A-small-attempt0.in";
		Scanner scan = new Scanner(new File(filename));
		System.setOut(new PrintStream(new File("sheep-out2.txt")));
		
		int T = scan.nextInt();
		if(T < 1 || T > 100)
			System.exit(0);
		
		int i = 0;
		while(i++ < T) {
			int N = scan.nextInt();
			// System.out.println(N);
			Set<Integer> set = new TreeSet<>();
			if(N < 0 || N > 200)
				System.exit(0);
			if( N == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");	
			} else {
				// System.out.println(i);
				int nr_of_times = 0;
				int nr = 0;
				while(set.size() < 10) {
					// System.out.println(set);
					nr_of_times++;
					int sheeps = N*nr_of_times;
					nr = sheeps;
					// System.out.println(sheeps);
					while (sheeps > 0) {
						set.add(sheeps % 10);
						sheeps = sheeps / 10;
					}
				}
				// System.out.println(set);
				System.out.println("Case #" + i + ": " + nr);
				
			}
		}
	}
}
