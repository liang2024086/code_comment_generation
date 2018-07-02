package methodEmbedding.Magic_Trick.S.LYD1473;

import java.util.Scanner;


public class MagicShow {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int trials=input.nextInt();
		for(int trial=0;trial<trials;trial++){
			int row=input.nextInt()-1;
			int[][] grid=new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					grid[i][j]=input.nextInt();
				}
			}
			int[] initialRow=grid[row];
			row=input.nextInt()-1;
			grid=new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					grid[i][j]=input.nextInt();
				}
			}
			int[] finalRow=grid[row];
			int card=-1;
			boolean foundCard=false;
			boolean badMagician=false;
			for(int i:initialRow){
				for(int j:finalRow){
					if(i==j){
						if(foundCard){
							badMagician=true;
							break;
						}
						foundCard=true;
						card=i;
					}
				}
				if(badMagician)break;
			}
			System.out.print("Case #"+(trial+1)+": ");
			if(!foundCard)System.out.println("Volunteer cheated!");
			else if(badMagician)System.out.println("Bad magician!");
			else System.out.println(card);
		}
		input.close();
	}

}
