package methodEmbedding.Magic_Trick.S.LYD1458;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MainLine {
	public static void main(String[] args) throws FileNotFoundException {
		int[][] grid = new int[4][4];
		Scanner scan = new Scanner(new File("data.txt"));
		int[] firstRow = new int[4];
		int[] secondRow = new int[4];
		int commonNumbers = 0;
		int mainCounter = 1;
		int commonNumber = 0;
		int choice1 = 0;
		int choice2 = 0;
		int count = 0;
		int testCases = 0;
		
		testCases = scan.nextInt(); scan.nextLine();
		while(testCases-- > 0){
			commonNumbers = 0;
			choice1 = scan.nextInt();scan.nextLine();
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					grid[i][j] = scan.nextInt();
				}
				scan.nextLine();
			}
			count = 0;
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(i==(choice1-1)){
						firstRow[count] = grid[i][j];
						count++;
					}
				}
			}
			choice2 = scan.nextInt();scan.nextLine();
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					grid[i][j] = scan.nextInt();
				}
				scan.nextLine();
			}
			count = 0;
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(i==(choice2-1)){
						secondRow[count] = grid[i][j];
						count++;
					}
				}
			}
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(firstRow[i] == secondRow[j]){
						commonNumbers++;
						commonNumber = firstRow[i];
					}
				}
			}
			if(commonNumbers == 0)
				System.out.println("Case #" +mainCounter +": " +"Volunteer cheated!");
			else if(commonNumbers == 1)
				System.out.println("Case #" +mainCounter +": " +commonNumber);
			else
				System.out.println("Case #" +mainCounter +": " +"Bad magician!");
			mainCounter++;
		}
	}
}
