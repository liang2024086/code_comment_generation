package methodEmbedding.Magic_Trick.S.LYD288;

import java.util.Scanner;


public class Magician {

	public static void main(String[] args) {

		int T,a1,a2;
		int[][] mat = new int[4][4];
		int[][] mat2 = new int[4][4];
		
		
		Scanner in = new Scanner(System.in);
		T=in.nextInt();
		//in.nextLine();
		test:
		for(int i=1;i<=T;i++){
			a1=in.nextInt();
			//in.nextLine();
			int match=0;
			boolean f = false;
			for(int k=0;k<4;k++){
				for(int l=0;l<4;l++){
					mat[k][l]=in.nextInt();
				}
				//in.nextLine();
			}
			a2=in.nextInt();
			for(int k=0;k<4;k++){
				for(int l=0;l<4;l++){
					mat2[k][l]=in.nextInt();
				}
				//in.nextLine();
			}
			for(int j=0;j<4;j++){
				for(int m=0;m<4;m++){
					if(mat[(a1-1)][j]==mat2[(a2-1)][m]){
						match=mat[(a1-1)][j];
						if(!f){
							f=true;
						}
						else if(f){
							System.out.println("Case #"+i+": "+"Bad magician!");
							continue test;
						}
					}
				}
			}
			if(f){
				System.out.println("Case #"+i+": "+match);
				continue test;
			}
			else{
				System.out.println("Case #"+i+": "+"Volunteer cheated!");
			}
			
		}
	}

}
