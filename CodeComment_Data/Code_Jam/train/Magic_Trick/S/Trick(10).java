package methodEmbedding.Magic_Trick.S.LYD1322;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.Scanner;


public class Trick {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("src/sample"));
		int reps = input.nextInt();
		
		String[][] orig = new String[4][4];
		String[][] cards= new String[4][4];
		String guess[] = new String[reps * 2];
		
		
		
		//Input get
		for(int x = 0; x < (reps*2); x++){
			guess[x] = input.nextLine();
			if( x == 0)
				guess[x] = input.nextLine();
			for(int y = 0; y<4; y++){
				String temp = input.nextLine();
				if(x%2 != 0)
					cards[y] = temp.split(" ");
				else{
					orig[y] = temp.split(" ");
					//System.out.println(temp + "\n" + Arrays.deepToString(orig));
					//System.out.print(Arrays.toString(guess));
				}
				//System.out.print(orig[0][x%4] + ", ");
			}
			//System.out.println("\n");
			
			if((x+1) % 2 == 0){
				int possib = 0;
				int times = 0;
				
				for(int n = 0; n < 4; n++){
					
					int temp1 = Integer.parseInt(orig[Integer.parseInt(guess[x - 1]) - 1][n]);
					//int temp2 = Integer.parseInt(cards[ Integer.parseInt(guess[x]) - 1 ][n]);
					
					//System.out.println(orig[Integer.parseInt(guess[x - 1]) - 1][n] + " and " + Integer.parseInt(cards[ Integer.parseInt(guess[x])-1 ][n]));
					//System.out.println(Integer.parseInt(guess[x - 1]) - 1);
					
					for(int c = 0; c < 4; c++){
						int temp2 = Integer.parseInt(cards[ Integer.parseInt(guess[x]) - 1 ][c]);
						if(temp1 == temp2){
							times++;
							possib = temp1;
						}
					}	
						
					if(n == 3 && times == 1){
						System.out.println("Case #" + (x+1)/2 + ": "+ possib);
					}
					else if(n == 3 && times > 1){
						System.out.println("Case #" + (x+1)/2 + ": Bad magician!");
					}
					else if(n == 3 && times == 0){
						System.out.println("Case #" + (x+1)/2 + ": Volunteer cheated!");
					}
				}
					
				
				
			}
				
		}
		
		
	}

}
