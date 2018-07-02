package methodEmbedding.Magic_Trick.S.LYD1723;

import java.util.ArrayList;
import java.util.Scanner;


public class prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][4];
		int[][] b = new int[4][4];

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			int count=0;
			ArrayList<Integer> sol = new ArrayList<Integer>();
			
			int ans1 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					a[j][j2] = sc.nextInt();
				}
			}
			int ans2 = sc.nextInt();
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					b[j][j2] = sc.nextInt();
				}
			}
			
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if(a[ans1-1][j]==b[ans2-1][j2])
						sol.add(a[ans1-1][j]);
				}

			}
			String s="";
			if(sol.size() == 0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(sol.size() > 1)
				System.out.println("Case #"+(i+1)+": Bad magician!");
			else
				System.out.println("Case #"+(i+1)+": "+sol.get(0));

		}
	}

}
