package methodEmbedding.Revenge_of_the_Pancakes.S.LYD711;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("B-small-attempt0.in");
			//FileInputStream fi = new FileInputStream("B-large-attempt0.in");
			FileOutputStream fo = new FileOutputStream("B-small-attempt0.out");
			//FileOutputStream fo = new FileOutputStream("B-large-attempt0.out");
			BufferedReader br = new BufferedReader(new InputStreamReader(fi));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
			String s = br.readLine();
			int cases = Integer.parseInt(s);
			for(int i = 1; i <= cases; i++) {
				System.out.print("Case #" + i + ":");
				bw.write("Case #" + i + ":");

				s = br.readLine();
				int N = s.length();
				int[] from = new int[N];
				int[] to = new int[N];

				char[]c = s.toCharArray();
				int lastPlus = N;
				boolean wasMinus = false;
				for(int n = N-1; n >= 0; n--)
					if(c[n] == '+') {
						from[n] = 1;
						if(!wasMinus)
							lastPlus = n;
					}
					else if(c[n] == '-') {
						from[n] = -1;
						wasMinus = true;						
					}
					else {
						System.out.print("Should not happen");
					}

				int flips = 0;
				while(lastPlus > 0) {
					boolean firstPlus = from[0] == 1;
					int firstNumbers = 1;
					for(int n = 1; n < lastPlus; n++) {
						if(from[n] == from[0])
							++firstNumbers;
						else
							break;
					}
					int flipUpTo = firstPlus ? firstNumbers : lastPlus;
					// flip
					for(int n = 0; n < flipUpTo; n++) {
						to[flipUpTo-n-1] = -1 * from[n];
					}
					// just copy
					for(int n = flipUpTo; n < N; n++) {
						to[n] = from[n];
					}
					if(!firstPlus)
						lastPlus -= firstNumbers;

					++flips;
					int[] tmp = from;
					from = to;
					to = tmp;
				}

				System.out.print(" " + flips);
				bw.write(" " + flips);
				System.out.println("");
				bw.write("\n");
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
