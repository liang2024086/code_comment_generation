package methodEmbedding.Standing_Ovation.S.LYD1724;


import java.util.HashSet;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num_test_cases = in.nextInt();
		for (int t = 1; t <= num_test_cases; t++) {
			int max = in.nextInt();
			
			String next = in.nextLine().replaceAll("\\s","");
			
			int currentSum = 0;
			int neededPeopleTotal = 0;
			for (int k = 0; k < max + 1; k++) {
				int neededPeopleCurrent = 0;
				int currentPeople = Character.getNumericValue(next.charAt(k));
				if (currentSum < k && currentPeople > 0) {
					neededPeopleCurrent = k - currentSum;
					neededPeopleTotal += neededPeopleCurrent;
				}
				currentSum = currentPeople + currentSum + neededPeopleCurrent;
			}
			System.out.printf("Case #%d: ", t);
			System.out.println(neededPeopleTotal);
		}
		
	}	
}
