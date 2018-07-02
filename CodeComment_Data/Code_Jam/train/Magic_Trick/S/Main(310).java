package methodEmbedding.Magic_Trick.S.LYD1014;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		
		
		int x,y, i,j;
		int answer = 0;
		int count = 0;
		
		for(int k=0; k<test_cases; k++){
			boolean[] board = new boolean[17];
			count=0;
			x = sc.nextInt();
			for(i=0; i<4; i++)
				for(j=0; j<4; j++){
					y = sc.nextInt();
					if(x==i+1) board[y] = true;
				}
			
			x = sc.nextInt();
			for(i=0; i<4; i++)
				for(j=0; j<4; j++){
					y = sc.nextInt();
					if(x==i+1)						
						if( board[y]){ 
							count++;
							answer = y;
						}
				}

			if(count==0){
				System.out.println("Case #"+ (k+1) +": Volunteer cheated!");
			}else if(count == 1){
				System.out.println("Case #"+(k+1)+": " + answer);
			}else{
				System.out.println("Case #"+ (k+1) +": Bad magician!");
			}
		}
		sc.close();
		
	}
}
