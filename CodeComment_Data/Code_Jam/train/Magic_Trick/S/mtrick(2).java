package methodEmbedding.Magic_Trick.S.LYD2067;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mtrick {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		StringTokenizer st;
		int T, a, b, res;
		int arr[] = new int[4];
		int brr[] = new int[4];

		s = br.readLine();
		T = Integer.parseInt(s);
		for (int I = 0; I < T; I++) {
			s = br.readLine();
			a = Integer.parseInt(s);
			for (int i = 1; i < a; i++) {
				s = br.readLine();
			}
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			for (int i = 0; i < 4; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = a+1; i <= 4; i++) {
				s = br.readLine();
			}
			
			s = br.readLine();
			b = Integer.parseInt(s);
			for (int i = 1; i < b; i++) {
				s = br.readLine();
			}
			s = br.readLine();
			st = new StringTokenizer(s, " ");
			for (int i = 0; i < 4; i++) {
				brr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = b+1; i <= 4; i++) {
				s = br.readLine();
			}
			

			res = -1;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (arr[i] == brr[j]) {
						if (res == -1) {
							res = i;
						} else {
							res = 5;
						}
					}
				}
			}
			System.out.print("Case #" + (I+1) + ": ");
			if (res == -1) {
				System.out.println("Volunteer cheated!");
			} else if (res == 5) {
				System.out.println("Bad magician!");
			} else {
				System.out.println(arr[res]);
			}
		}
	}
}
