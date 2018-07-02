package methodEmbedding.Standing_Ovation.S.LYD1508;


import java.util.Scanner;

public class ClapsFromAll {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfInput = scanner.nextInt();
		for(int i = 0; i < noOfInput; i++){
			int maxShyness = scanner.nextInt();
			String auditions = scanner.next();
			int j = 1;
			int totalAuditions = ((int)auditions.charAt(0) - 48);
			int needFriends = 0;
			while(j < auditions.length()){
				if(totalAuditions < j){
					int temp = j - totalAuditions;
					needFriends += temp;
					totalAuditions += temp;
				}
				totalAuditions += ((int)auditions.charAt(j) - 48);
				j++;
			}
			System.out.println("Case #" + (i + 1) + ": " + needFriends);
		}
	}
	
}
