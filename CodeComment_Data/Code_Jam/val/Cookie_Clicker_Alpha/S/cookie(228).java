package methodEmbedding.Cookie_Clicker_Alpha.S.LYD556;

import java.util.*;

public class cookie {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			double C = in.nextDouble(), F = in.nextDouble(), X = in.nextDouble();

			double currT = 0, currCPS = 2, projected = 987654321;
			while(true) {
				double tmp = currT + X/currCPS;
				if(tmp < projected) projected = tmp;
				else {
					currT = projected;
					break;
				}

				currT += C/currCPS;
				currCPS += F;
			}

			System.out.println("Case #"+(t+1)+": "+currT);
		}

	}
}
