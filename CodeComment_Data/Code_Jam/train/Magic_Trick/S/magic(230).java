package methodEmbedding.Magic_Trick.S.LYD285;

import java.util.Scanner;

public class magic{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int z = in.nextInt();
		
		for(int x=0; x<z; x++){
			int[][] l1 = new int[4][4];
			int r1 = in.nextInt();
			l1[0][0] = in.nextInt();
			l1[0][1] = in.nextInt();
			l1[0][2] = in.nextInt();
			l1[0][3] = in.nextInt();
			l1[1][0] =in.nextInt();
			l1[1][1] = in.nextInt();
			l1[1][2] = in.nextInt();
			l1[1][3] = in.nextInt();
			l1[2][0] = in.nextInt();
			l1[2][1] = in.nextInt();
			l1[2][2] = in.nextInt();
			l1[2][3] = in.nextInt();
			l1[3][0] = in.nextInt();
			l1[3][1] = in.nextInt();
			l1[3][2] = in.nextInt();
			l1[3][3] = in.nextInt();
			int[][] l2 = new int[4][4];
			int r2 = in.nextInt();
			l2[0][0] = in.nextInt();
			l2[0][1] = in.nextInt();
			l2[0][2] = in.nextInt();
			l2[0][3] = in.nextInt();
			l2[1][0] =in.nextInt();
			l2[1][1] = in.nextInt();
			l2[1][2] = in.nextInt();
			l2[1][3] = in.nextInt();
			l2[2][0] = in.nextInt();
			l2[2][1] = in.nextInt();
			l2[2][2] = in.nextInt();
			l2[2][3] = in.nextInt();
			l2[3][0] = in.nextInt();
			l2[3][1] = in.nextInt();
			l2[3][2] = in.nextInt();
			l2[3][3] = in.nextInt();
			int count = 0;
			int num=0;
			for(int i=0; i<4; i++){
				for(int j=0; j<4; j++){
					if(l1[r1-1][i]==l2[r2-1][j]){
						count++;
						num = l1[r1-1][i];
					}
				}
			}
			System.out.print("Case #"+(x+1)+": ");
			if(count>1)System.out.println("Bad magician!");
			else if(count==1)System.out.println(num);
			else System.out.println("Volunteer cheated!");
		}
	}
}
