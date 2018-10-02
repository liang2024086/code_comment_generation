package methodEmbedding.Counting_Sheep.S.LYD861;


import edu.princeton.cs.algs4.*;

public class CodeJam {
	
	public static void main(String[] args) {
		In in = new In("input.txt");
		Out out = new Out("output.txt");
			boolean[] seen = new boolean[12];
			int cont;
			int T = in.readInt();
			
			for (int i = 1; i <= T; i++) {
				for (int j = 0; j < 12; j++) seen[j] = false;
				cont = 0;
				int N = in.readInt();
				int M = N;
				if (N == 0) 
					out.println("Case #" + i + ": INSOMNIA");
				else {
					while (cont < 10) {
						int aux = M;
						while (aux > 0) {
							if (seen[aux%10] == false) cont++;
							seen[aux%10] = true;
							aux /= 10;
						}
						M += N;
					}
					out.println("Case #" + i + ": " + (M-N));
				}
			}
			
		}
	}
