package methodEmbedding.Standing_Ovation.S.LYD1271;


import java.util.Scanner;

public class Prob1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0 ; i < T ; i++ ){
			scan.nextInt();
			String s = scan.next();
			int tot = 0;
			int added = 0;
			for(int a = 0 ; a<s.length();a++){
				if(tot < a){
					added += a - tot;
					tot = a;
				}
				tot += s.charAt(a) - 48;
			}
			System.out.printf("Case #%d: %d\n",i+1,added);
		}

	}

}

