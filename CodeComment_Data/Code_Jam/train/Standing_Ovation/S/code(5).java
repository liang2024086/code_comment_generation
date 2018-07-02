package methodEmbedding.Standing_Ovation.S.LYD1908;


import java.util.*;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String line = sc.nextLine();
			int max = Integer.parseInt(line.split(" ")[0]);
			String nums = line.split(" ")[1];
			
			int friend = 0, cur=0;
			for(int j=0;j<=max;j++) {
				int num = Integer.parseInt(nums.charAt(j) + "");
				if(cur < j) {
					friend += (j-cur);
					cur += (j-cur);
				}
				cur += num;
			}
			System.out.println("Case #"+(i+1)+": "+friend);		
		}
		sc.close();
	}
}
