package methodEmbedding.Magic_Trick.S.LYD2099;

import java.util.Scanner;


public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int b=0;		//sets b to be 0
		
		int T = in.nextInt();			//gets number of inputs
		
		for(int i=0; i<T; i++){			
			int matched=0;				//sets matched to be 0
			int row1 = (in.nextInt()-1);	//gets row number
			
			int[][] numsone = new int[4][4];	//creates 2d array for input
			
			for(int k=0; k<4; k++){
				for(int j=0; j<4; j++){
					numsone[k][j]=in.nextInt();
					
				}
			}
			
			int[] corrnum =new int[4];
			for(int k=0; k<4; k++){
				corrnum[k]=numsone[row1][k];
			}
			
			int row2 = (in.nextInt()-1);
			
			int[][] numtwo = new int[4][4];
			
			for(int k=0; k<4; k++){
				for(int j=0; j<4; j++){
					numtwo[k][j]=in.nextInt();
					
				}
			}
				
			
			int[] corrnum2 =new int[4];
			for(int k=0; k<4; k++){
				corrnum2[k]=numtwo[row2][k];
			}
			
			for(int k=0; k<4; k++){
				for(int j=0; j<4; j++){
					if(corrnum[k]==corrnum2[j]){
						matched++;
						b=corrnum2[j];
					}
				}
			}
			
			
			
			
			if(matched==1){
				System.out.println("Case #"+(i+1)+": "+b);
				matched=0;
				b=0;
			}
			else if(matched>1){
				System.out.println("Case #"+(i+1)+": Bad magician!");
				matched=0;
				b=0;


			}
			else{
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
				matched=0;
				b=0;



			}
			
		}
		
	}

}
