package methodEmbedding.Magic_Trick.S.LYD1023;

import java.util.Scanner;


public class Main {
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for(int i=0;i<T;i++){
			int ans1 = in.nextInt();
			in.nextLine();
			int [][] grid1 = new int[4][4];
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					grid1[j][k] = in.nextInt();
				}
				in.nextLine();
			}
			int ans2 = in.nextInt();
			in.nextLine();
			int [][] grid2 = new int[4][4];
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					grid2[j][k] = in.nextInt();
				}
				in.nextLine();
			}
			int count =0;
			int decans =0;
			for(int j=0;j<4;j++){		
				for(int k=0;k<4;k++){
					if(grid1[ans1-1][j]==grid2[ans2-1][k]){
						count++;
						decans =grid1[ans1-1][j]; 
					}
				}
			}
			if(count==0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(count==1)
				System.out.println("Case #"+(i+1)+": "+decans);
			else if(count > 1)
				System.out.println("Case #"+(i+1)+": Bad magician!");
		}
	}

}
