package methodEmbedding.Standing_Ovation.S.LYD1090;

import java.util.Scanner;
public class StandingOvation {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int testcases = scn.nextInt();
		for(int i = 0; i < testcases; i++){
			int shyest = scn.nextInt();
			String audience = scn.next();
			int standing = 0;
			int answer = 0;
			for(int j = 0; j < shyest+1; j++){
				int tmp = Integer.parseInt(audience.substring(j, j+1));
				if(j == 0) standing+= tmp;
				else {
					if(j <=standing || tmp == 0) standing+=tmp;
					else{
						answer+=(j-standing);
						standing+=(j-standing);
						standing+=tmp;
					}
				}
			}
			
			System.out.println("Case #"+ (i+1) + ": " + answer);
			
		}
	}

}
