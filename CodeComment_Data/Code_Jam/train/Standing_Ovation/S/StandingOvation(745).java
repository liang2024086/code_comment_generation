package methodEmbedding.Standing_Ovation.S.LYD1085;


import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), max = t;
		int count = 0;
		while(t-->0){
			int n = in.nextInt();
			String numbers = in.next();
			int people = 0, peopleNeeded=0;
			for (int i = 0; i < numbers.length(); i++) {
				if(people+peopleNeeded>=i)
					people+=numbers.charAt(i)-48;
				else{
					if(numbers.charAt(i)-48!=0){
						peopleNeeded+=i-(people+peopleNeeded);
						people+=numbers.charAt(i)-48;
					}
				}
			}
			System.out.println("Case #"+(max-t)+": "+peopleNeeded);
		}
	}
}
