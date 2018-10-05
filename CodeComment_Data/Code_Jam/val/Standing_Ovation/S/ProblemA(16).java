package methodEmbedding.Standing_Ovation.S.LYD1772;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemA {
	public static final int MAX = 1000;

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int res,max_S,j;
		String s;
		int[] input = new int[MAX];
		int[] scan = new int[MAX];
		StringTokenizer st;
		for (int i=1; i<=T; i++) {
			st = new StringTokenizer(in.readLine());
			max_S = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			
			// parse input
			for (j=0; j<=max_S; j++) {
				input[j] = Integer.parseInt(String.valueOf(s.charAt(j)));
			}
			/*
			for (j=0; j<=max_S; j++) {
				System.out.print(input[j] + " ");
			}
			System.out.println();
			*/
			
			// prefix scan
			res = 0;
			scan[0] = input[0];
			scan[1] = scan[0];
			j = 1;
			if (scan[j] < j) {
				// if not, add people
				res += j - scan[j];
				scan[j] = j;
			}
			
			for (j=2; j<=max_S; j++) {
				scan[j] = input[j-1] + scan[j-1];
				// check if enough people already standing up
				if (scan[j] < j) {
					// if not, add people
					res += j - scan[j];
					scan[j] = j;
				}
			}
			
			System.out.println("Case #" + i + ": " + res);
		}
	}

}
