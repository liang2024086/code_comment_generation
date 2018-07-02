package methodEmbedding.Standing_Ovation.S.LYD459;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int x = 1; x <= T; x++) {
			int maxShyness = in.nextInt();
			int[] people = new int[maxShyness + 1];
			int input = in.nextInt();
			for (int person = maxShyness; person >= 0; person--) {
				people[person] = input % 10;
				input /= 10;
			}
			int sum = people[0];
			int result = 0;
			for (int person = 1; person < people.length; person++) {
				if (sum < person) {
					int tmp = person - sum;
					result += tmp;
					sum += people[person] + tmp;
				} else {
					sum += people[person];
				}
			}
			System.out.println("Case #" + x + ": " + result);
		}
		in.close();
	}
}
