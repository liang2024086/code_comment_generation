package methodEmbedding.Magic_Trick.S.LYD1474;

import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		int a [][] = new int[4][4];
		int b [][] = new int[4][4];
		int t = lee.nextInt();
		int l1,l2,j,i;
		int c=0;
		for(int k=0; k<t; k++){
			int con =0;
			int x = 0;
			
			l1=lee.nextInt();
			for(i=0; i<4 ;i++)
				for(j=0; j<4; j++)
					a[i][j]=lee.nextInt();
			l2 = lee.nextInt();
			for(i=0; i<4 ;i++)
				for(j=0; j<4; j++)
					b[i][j]=lee.nextInt();
			for(i=0; i<4 ;i++)
				for(j=0; j<4; j++)
					if (a[l1-1][i]==b[l2-1][j]){
						con++;
						x=a[l1-1][i];
					}	
			c++;
			if(con==0)
				System.out.println("Case #"+c+": Volunteer cheated!");
			else if (con>1)
				System.out.println("Case #"+c+": Bad magician!");
			else
				System.out.println("Case #"+c+": "+x);
		}
		
	}

}
