package methodEmbedding.Standing_Ovation.S.LYD25;

import java.util.*;
public class A {
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		int numtest = sc.nextInt();
		//for each test case
		for(int counter = 0; counter < numtest; counter++){
			int maxShy = sc.nextInt();
			String people = sc.next();
			int invitation = 0;
			int peopleStanding = Integer.parseInt(people.substring(0, 1));
			for(int i = 1; i <= maxShy; i++){
				if(peopleStanding < i){
					invitation = invitation + (i - peopleStanding);
					peopleStanding = i;
				}
				peopleStanding += Integer.parseInt(people.substring(i, i+1));
				
			}
			System.out.format("Case #%d: %d\n", (counter+1), invitation);
		}
		sc.close();
	}
}
