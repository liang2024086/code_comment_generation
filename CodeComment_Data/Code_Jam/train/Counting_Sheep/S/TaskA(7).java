package methodEmbedding.Counting_Sheep.S.LYD1263;

import java.util.HashSet;
import java.util.Scanner;

public class TaskA {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int numOfCases = in.nextInt();
		for(int i = 0 ; i < numOfCases; i++){
			int n = in.nextInt();
			if(n == 0) System.out.println("Case #" + (i+1) + ": "+ "INSOMNIA");
			else{
				HashSet<Integer> digits = new HashSet<Integer>();
				int temp = 0;
				int core = n;
				while(true){
					temp = n;
					while(temp > 0) {
						digits.add(temp%10);
						temp /=10;
					}
					if(digits.size() == 10) break;
					n+= core;
				}
				System.out.println("Case #" + (i+1) + ": " + n);
			}

		}
	}
}
