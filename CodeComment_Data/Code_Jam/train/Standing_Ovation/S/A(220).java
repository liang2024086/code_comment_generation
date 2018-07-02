package methodEmbedding.Standing_Ovation.S.LYD1739;

import java.util.*;
import java.io.*;
class A {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		
		int T = sc.nextInt();
		
		for (int caseNum=1; caseNum <= T; caseNum++) {
			pw.print("Case #" + caseNum + ": ");
			int N = sc.nextInt();
			String line = sc.nextLine();
			int sum = 0;
			int totalFriends = 0;
			for (int i=0; i<=N;i++) {
				
				int digit = Character.getNumericValue(line.charAt(i+1));
				if(sum<i) {
					totalFriends+= i-sum;
					sum+=i-sum;
				}
				sum+=digit;
			}
			pw.println(totalFriends);
		}
		sc.close();
		pw.flush();
		pw.close();
	}
}
