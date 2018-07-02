package methodEmbedding.Magic_Trick.S.LYD364;

import java.util.Scanner;
import java.util.ArrayList;

public class Magician {

	public static void main(String[] args) {
		int matrix1[][] = {{0,0,0,0}, {0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int matrix2[][] = {{0,0,0,0}, {0,0,0,0},{0,0,0,0},{0,0,0,0}};
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int row1;
		int row2;
		
		int answer=0;
		
		
		for (int i=1;i<=T;i++){
			int same =0;
			row1 = sc.nextInt()-1;
			for (int j=0;j<4;j++){
				for (int k =0;k<4;k++){
					matrix1[j][k]=sc.nextInt();
				}
			}
			row2 = sc.nextInt()-1;

			for (int j=0;j<4;j++){
				for (int k =0;k<4;k++){
					matrix2[j][k]=sc.nextInt();
				}
			}
			ArrayList<Integer> initialrow = new ArrayList<Integer>();
			for (int p=0; p<4;p++){
				initialrow.add(matrix1[row1][p]);
			}
			same =0;
			for (int m=0;m<4;m++){
				if (initialrow.contains(matrix2[row2][m])){
					same++;
					answer=matrix2[row2][m];
				}
			}
			
			if (same==0){
				System.out.printf("Case #%d: Volunteer cheated!",i);
				System.out.println();
			} else if (same==1){
				System.out.printf("Case #%d: %d",i, answer);
				System.out.println();
			} else {
				System.out.printf("Case #%d: Bad magician!",i);
				System.out.println();
			}
			
			
			
			
			
			/*
			for (int n=0;n<4;n++){
				same =0;
				for (int k = 0;k<4;k++){
					if (initialrow.contains(matrix2[k][n])){
						same++;
					}
				}
				if (same==4){
					break;
				}
			}
			
			
			if (same==4){
				//search row
				for (int m=0;m<4;m++){
					if (initialrow.contains(matrix2[row2][m])){
						answer = matrix2[row2][m];

					}
				}
				System.out.printf("Case #%d: %d",i, answer);
				System.out.println();
			} else{
				same =0;
				for (int m=0;m<4;m++){
					if (initialrow.contains(matrix2[row2][m])){
						same++;
					}
				}
				if (same==0){
					System.out.printf("Case #%d: Volunteer cheated!",i);
					System.out.println();
				} else {
					System.out.printf("Case #%d: Bad magician!",i);
					System.out.println();
				}
			}
			*/

		}
		
		
	}

	
}
