package methodEmbedding.Standing_Ovation.S.LYD1162;

import java.util.Scanner;

public class ProblemA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			String[] in = sc.nextLine().split(" ");
			int s = Integer.parseInt(in[0]);
			String members = in[1];
			int needed = 0;
			int standing = 0;
			for (int j = 0; j < members.length(); j++) {
				if(members.charAt(j) == '0')
					continue;
				if(standing >= j){
					standing += Integer.parseInt(members.charAt(j)+"");
				}
				else{
					needed += (j-standing);
					standing = j + Integer.parseInt(members.charAt(j)+"");
				}
			}
			System.out.printf("Case #%d: %d\n", (i+1), needed);
		}
	}

}
