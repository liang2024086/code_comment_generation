package methodEmbedding.Standing_Ovation.S.LYD285;

import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t=0;t<testCases;t++){
			int maxShyness = scan.nextInt() + 1;
			String audience = scan.next();
			//initial person (Saves on cpu usage)
			int total = Character.getNumericValue(audience.charAt(0));
			int countFriends = 0;
			// for every person thereafter
			for(int a=1;a<maxShyness;a++){
				if(total<a){
					countFriends++;
					total++;
				}
				total += Character.getNumericValue(audience.charAt(a));
				//countFriends += people;
			}
			System.out.println("Case #" +(t+1)+ ": "+countFriends);
		}
	}
}

/*
System.out.println("hey");
Scanner scan = new Scanner(System.in);
int testCases = scan.nextInt();
for(int t=0;t<testCases;t++){
	int maxShyness = scan.nextInt();
	String audience = scan.next();
	for(int a=0;a<audience.length();a++){
		int people = Character.getNumericValue(audience.charAt(a));
	}
}
*/
