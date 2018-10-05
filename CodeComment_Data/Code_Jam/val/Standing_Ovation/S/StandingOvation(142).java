package methodEmbedding.Standing_Ovation.S.LYD1648;


import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int tests = scanner.nextInt();

		for(int i = 1 ; i <= tests; i++){
			int maxS = Integer.valueOf(scanner.next());
			String s = scanner.next();
			int claping = 0;
			int extraAudience = 0;
			for(int si = 0; si < s.length(); si++){
				int si_audience = Character.getNumericValue(s.charAt(si));
				if(si_audience > 0){
					if(si <= claping){
						claping += si_audience;
					}else{
						extraAudience += si - claping;
						claping += si_audience + extraAudience;
					}
				}

			}
			System.out.println("Case #"+i+": "+extraAudience);

		}


		scanner.close();

	}

}
