package methodEmbedding.Magic_Trick.S.LYD586;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Magic {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); 
		
		int T = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			int guess = Integer.parseInt(in.readLine());
			int[] a1 = new int[4];
			int[] a2 = new int[4];
			for (int j = 0; j < 4; j++) {
				String line = in.readLine();
				if (j+1 == guess) {
					StringTokenizer st = new StringTokenizer(line);
					for (int a = 0; a < 4; a++) {
						a1[a] = Integer.parseInt(st.nextToken());
					}
				}
			}
			guess = Integer.parseInt(in.readLine());
			for (int j = 0; j < 4; j++) {
				String line = in.readLine();
				if (j+1 == guess) {
					StringTokenizer st = new StringTokenizer(line);
					for (int a = 0; a < 4; a++) {
						a2[a] = Integer.parseInt(st.nextToken());
					}
				}
			}
			int ans = -1;
			for (int a = 0; a < 4; a++) {
				for (int b = 0; b < 4; b++) {
					if (a1[a] == a2[b]) {
						if (ans != -1)
							ans = -2;
						else 
							ans = a1[a];
					}
				}
			}
			
			int temp = i+1;
			out.print("Case #" + temp + ": ");
			if (ans == -1) {
				out.println("Volunteer cheated!");
			}
			else if (ans == -2) {
				out.println("Bad magician!");
			}
			else 
				out.println(""+ans);
		}
			
		
		in.close();
		out.close();
		System.exit(0);

	}
}
