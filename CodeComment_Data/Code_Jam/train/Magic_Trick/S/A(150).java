package methodEmbedding.Magic_Trick.S.LYD499;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class A {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=null;
		try {
			sc = new Scanner(new FileReader("A-small-attempt1.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			
			int r1=sc.nextInt()-1;
			int [][]grid=new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					grid[j][j2]=sc.nextInt();
				}
			}
			//System.out.println(Arrays.toString(grid));
			int [] row=grid[r1];

			int r2=sc.nextInt()-1;
			int [][]grid2=new int[4][4];
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					grid2[j][j2]=sc.nextInt();
				}
			}

			int [] row2=grid2[r2];
			//System.out.println(Arrays.toString(row) +"*"+Arrays.toString(row2));
			boolean bad=false; int ans=0; boolean badc=false;
			for (int j = 0; j < row2.length; j++) {
				for (int k = 0; k < row2.length; k++) {
					if( row[j] == row2[k] && !bad){
						ans=row[j];
						bad=true;
					}
					else if(row[j] == row2[k] && bad){
						badc=true;
					}
				}
			}
			
			if(badc)
				System.out.println("Case #"+(i+1)+": Bad magician!");
			else if(ans ==0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else
				System.out.println("Case #"+(i+1)+": "+ans);
		}

	}

}
