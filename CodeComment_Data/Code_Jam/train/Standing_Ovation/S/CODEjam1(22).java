package methodEmbedding.Standing_Ovation.S.LYD2091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CODEjam1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int j = 1; j<=T;j++) {
			String input[] = br.readLine().split(" ");
			int number = Integer.parseInt(input[0]);
			// int number1 = Integer.parseInt(input[1]);

			int need = 0;
			int total = 0;

			if (number == 0) {
				System.out.println("Case #" + j + ": 0");
			} else {
				char all[] = input[1].toCharArray();
				total = Integer.parseInt(String.valueOf(all[0]));
				for (int i = 0; i <= number ; i++) {
					String temp = String.valueOf(all[i]);
					int temp1 = Integer.parseInt(temp);
					//System.out.println("temp :"+temp1);
					if (temp1 == 0) {
						continue;
					} else {
						if (i <= total) {
							if (i != 0)
								total += temp1;
							//System.out.println("							here total :"+total);
						} else {
							need = need + (i - total);
							total = total + need + temp1;
							//System.out.println("need :"+need);
							//System.out.println("							here total :"+total);
						}
					}
				}
				System.out.println("Case #" + j + ": " + need);
			}
		}

	}

}
