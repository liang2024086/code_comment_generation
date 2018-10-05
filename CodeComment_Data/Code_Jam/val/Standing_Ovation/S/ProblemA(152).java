package methodEmbedding.Standing_Ovation.S.LYD2118;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ProblemA {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
//		Scanner sc = new Scanner(new File("A.in"));
		int n = sc.nextInt();
		int count = 1;
		
		while(n --> 0) {
			int result = 0;
			
			int maxShy = sc.nextInt();
			String people = sc.next();
			int[] peopleShy = new int[maxShy+1];
			int peopleStanding = 0;
			
			for(int i = 0; i <= maxShy; i++) {
				peopleShy[i] = Integer.parseInt(""+people.charAt(i));
				
				if(i == 0) {
					peopleStanding += peopleShy[i];
				} else if(peopleStanding >= i) {
					peopleStanding += peopleShy[i];
				} else {
					result += i - peopleStanding;
					peopleStanding += i - peopleStanding;
					peopleStanding += peopleShy[i];
					
				}
				
//				System.out.println("Result: " + result + " PeopleStanding: " + peopleStanding);
			}
			
//			System.out.print("Array: ");
//			for(int i = 0; i <= maxShy; i++) {
//				System.out.print(peopleShy[i] + " ");
//			}
//			System.out.println("");
			
			System.out.println("Case #" + count + ": " + result);
			count++;
		}
	}
}
