package methodEmbedding.Magic_Trick.S.LYD277;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class MagicTrick {
	public static void main(String[] args) throws FileNotFoundException{
		int cards[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int T = 0;
		int ans1;
		int ans2;
		int[][] arr1 = new int[4][4];
		int[] row1 = new int[4];
		int[][] arr2 = new int[4][4];
		int[] row2 = new int[4];
		int magicNum = 0;
		boolean sameCard = false;
		boolean twoSameCard = false;
		
		Scanner sc = new Scanner(new File("input.in"));
		T = sc.nextInt();
		PrintWriter writer = new PrintWriter("output.out");
		for(int i = 0;i<T;i++){
			ans1 = sc.nextInt();
			for(int r = 0;r<4;r++)
				for(int c = 0; c<4; c++)
					arr1[r][c] = sc.nextInt();
			row1 = arr1[ans1-1];
			System.out.println(row1[0]+" "+row1[1]);
			ans2 = sc.nextInt();
			for(int r = 0;r<4;r++)
				for(int c = 0; c<4; c++)
					arr2[r][c] = sc.nextInt();
			row2 = arr2[ans2-1];
			System.out.println(row2[0]+" "+row2[1]);
			twoSameCard = false;
			sameCard = false;
			for(int idx = 0; idx<4; idx++){
				for(int idxx = 0;idxx<4;idxx++){
					if(row1[idx]==row2[idxx] && sameCard){
						twoSameCard = true;
					}
					if(row1[idx]==row2[idxx]){
						sameCard = true;
						magicNum = row1[idx];
					}
					
						
				}
				
				
			}
			if(twoSameCard){
				writer.println("Case #"+(i+1)+": "+"Bad magician!");
				
			}else if(sameCard){
				writer.println("Case #"+(i+1)+": "+magicNum);
			}else{
				writer.println("Case #"+(i+1)+": "+"Volunteer cheated!");
			}
				
		}
		writer.close();
		
	}
}
