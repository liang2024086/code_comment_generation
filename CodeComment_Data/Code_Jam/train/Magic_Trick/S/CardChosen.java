package methodEmbedding.Magic_Trick.S.LYD1620;

import java.util.Scanner;


public class CardChosen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int Test = scanner.nextInt();
		for(int nTest = 0; nTest < Test ;nTest++ ){
			
			int [][] t1 = new int [2][4];
			
			for(int trial = 0 ; trial < 2 ; trial ++){
				int row = scanner.nextInt();
				int [][] card = new int [4][4]; 
				
				for (int i =0 ;  i < 4 ; i++){
					for (int j =0 ;  j < 4 ; j++){
						card[i][j]  = scanner.nextInt();
					}
				}
				
				for (int i =0 ;  i < 4 ; i++){
					t1[trial][i] = card[row-1][i];
				}
				
			}
			int ans = 0;
			int count = 0;
			for(int i = 0 ; i < 4 ; i ++){
				
				for (int j =0 ;  j < 4 ; j++){
					if(t1[0][i] == t1[1][j]){
						ans = t1[0][i];
						count ++;
					}
				}
			}
			
			if(count ==1 ){
				System.out.println("Case #"+(nTest+1)+": "+ans);
			}else if(count  > 1){
				System.out.println("Case #"+(nTest+1)+": Bad magician!");
			}else{
				System.out.println("Case #"+(nTest+1)+": Volunteer cheated!");
			}
		}
	}

}
