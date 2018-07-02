package methodEmbedding.Standing_Ovation.S.LYD548;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();
		
		FileReader fr = new FileReader(filename + ".in");
		sc = new Scanner(fr);
		
		
		int lines = sc.nextInt();
		for(int i = 0; i < lines; i++) {
			int sMax = sc.nextInt();
			int input = sc.nextInt();
			int[] people = new int[sMax+1];
			for(int j = sMax; j >= 0 ; j--) {
				people[j] = input%10;
				input /=10;
			}
			int friends = 0;
			int clapping = 0;
			for(int j = 0; j < people.length; j++) {
				int moreFriends = j-clapping;
				if(moreFriends > 0) {
					friends += moreFriends;
					clapping += moreFriends;
				}
				clapping += people[j];
			}
			System.out.println("Case #" + (i+1) + ": " + friends);
		}
		
	}
}
