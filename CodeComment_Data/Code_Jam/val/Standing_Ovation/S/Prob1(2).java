package methodEmbedding.Standing_Ovation.S.LYD2131;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		
		for (int t = 0; t < T; t++) {
			String line = in.nextLine();
			String[] ss = line.split(" ");
			int shyNo = Integer.parseInt(ss[0]);
			int[] s = new int[shyNo + 1];
			for(int i = 0; i<shyNo+1; i++) {
				s[i] = Character.getNumericValue(ss[1].charAt(i));
			}

			int standups = 0;
			standups += s[0];
			int req = 0;
			int i = 0;
			for (i=1; i< s.length; i++){
				if (s[i]>0 && standups < i) { // not enough are stands
					while (standups<i){
						req += 1;
						standups += 1;
					}
				} 
				standups += s[i];	
				
			}

			System.out.printf("Case #%d: ", t + 1);
			System.out.println(req);
		}

	}

}
