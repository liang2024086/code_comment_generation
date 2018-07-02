package methodEmbedding.Counting_Sheep.S.LYD1199;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int counter = 1;
		for (int i = 0; i < loop; i++) {
			String N = sc.next();
			HashSet<Character> set = new HashSet<Character>();
			
			boolean possible = true;
			int lastNum = 0;
			int multiply = 1;
			String n = N;
			while(set.size() < 10) {

				if (n.equals("0")) {
					possible = false;
					break;
				}
				for (int j = 0; j < n.length(); j++) {
					set.add(n.charAt(j));
				}
				if (set.size() == 10) {
					lastNum = Integer.parseInt(n);
					possible = true;
					break;
				}
				multiply++;
				int temp = Integer.parseInt(N)*multiply;
				
				n = temp + "";
			}
			if (possible == true) {
				
				System.out.printf("Case #%d: %d\n", counter, lastNum);
			}
			else {
				System.out.printf("Case #%d: INSOMNIA\n", counter);
			}
			counter++;
		}

	}

}
