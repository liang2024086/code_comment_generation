package methodEmbedding.Standing_Ovation.S.LYD22;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; ++i) {
			String[] line = sc.nextLine().split(" ");
			int max = Integer.parseInt(line[0]);
			char[] shyness = line[1].toCharArray();
			if (Integer.parseInt(shyness[0] + "") >= max || max == 0) {
				System.out.println("Case #" + (i + 1) + ": " + 0);
			} else {
				int stands = 0;
				int need = 0;
				for(int j = 0; j < shyness.length; j++){
					int pos = Integer.parseInt(shyness[j]+"");
					if(pos != 0){
						if(stands <= j){
							int m = j - stands;
							stands = stands +  m;
							need = need + m;
						}
					}
					stands = stands + pos;
				}
				System.out.println("Case #" + (i+1) + ": " + need);
			}

		}
		sc.close();
	}
}
