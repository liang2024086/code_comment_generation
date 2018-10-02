package methodEmbedding.Standing_Ovation.S.LYD2200;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		int t = Integer.parseInt(read.readLine());
		int t0=0;

		while (t0++ < t) {

			String[] s = read.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int [] audience = new int [ s[1].length()];
			int standing= 0;
			int friends = 0;
			
			for (int i = 0; i < s[1].length(); i++) {
				audience[i]=Character.getNumericValue(s[1].charAt(i));
			}
			
			for (int i = 0; i < audience.length; i++) {
							
				if (i>0 && i>standing){
					friends+= (i-standing);
					standing+=(i-standing);
				}
				standing+=audience[i];
			}
			System.out.println("Case #"+t0+": "+friends);
		}
	}

}
