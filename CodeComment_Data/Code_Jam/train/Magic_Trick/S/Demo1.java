package methodEmbedding.Magic_Trick.S.LYD2068;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("D:\\DEV\\JAVA\\GoogleCodeJam_2014\\Question1\\src\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner in = new Scanner(br);

		in.nextInt();
		
		int[][] arr1 = new int[4][4];
		int sel1 = 0;
		int[][] arr2 = new int[4][4];
		int sel2 = 0;
		
		int caseNum = 0;
		
		while (in.hasNext()) {
			
			caseNum++;
			
			sel1 = in.nextInt();
			for ( int i = 0; i < 4; i++ ) {
				for ( int j = 0; j < 4; j++ ) {
					arr1[i][j] = in.nextInt();
				}
			}
			
			sel2 = in.nextInt();
			for ( int i = 0; i < 4; i++ ) {
				for ( int j = 0; j < 4; j++ ) {
					arr2[i][j] = in.nextInt();
				}
			}

			List<Integer> selRow1 = new ArrayList<Integer>();
			List<Integer> selRow2 = new ArrayList<Integer>();

			selRow1.add(arr1[sel1-1][0]);
			selRow1.add(arr1[sel1-1][1]);
			selRow1.add(arr1[sel1-1][2]);
			selRow1.add(arr1[sel1-1][3]);
			
			selRow2.add(arr2[sel2-1][0]);
			selRow2.add(arr2[sel2-1][1]);
			selRow2.add(arr2[sel2-1][2]);
			selRow2.add(arr2[sel2-1][3]);
			
			List<Integer> intersection = new ArrayList<Integer>();
			for ( int i = 0; i < 4; i++ ) {
				if ( selRow2.contains(selRow1.get(i)) ) {
					intersection.add(selRow1.get(i));
				}
			}
			

			System.out.print("Case #" + caseNum + ":" + " ");
			if ( intersection.size() == 0 ) {
				System.out.println("Volunteer cheated!");
			} else if ( intersection.size() == 1 ) {
				System.out.println(intersection.get(0));
			} else {
				System.out.println("Bad magician!");
			}
			
		}
		


	}

}
