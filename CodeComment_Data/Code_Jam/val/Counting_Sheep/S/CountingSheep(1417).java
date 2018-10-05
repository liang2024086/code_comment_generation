package methodEmbedding.Counting_Sheep.S.LYD1328;

import java.util.Scanner;

public class CountingSheep{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int numTest = scan.nextInt();
		for(int i = 0; i < numTest; i++){
			int n = scan.nextInt();
			if(n == 0){
				System.out.println("Case #" +( i+1) + ": INSOMNIA");
			}
			else{
				int[] digitHit = new int[10];
				for(int j = 1; j < 999999; j++){
					int orgmult = j*n;
					int mult = j*n;
					if(mult == 0){
						if(digitHit[0] == 0){
							digitHit[0]++;
						}
					}

					while(mult != 0){
						int insert = mult%10;
						if(digitHit[insert] == 0){
							digitHit[insert]++;
						}
	/*					System.out.println("");
						for(int b = 0; b < 10; b++){
						
							System.out.print(digitHit[b]);
						}
						System.out.println("");
*/
						mult = mult/10;
					/*	if(mult == 0){
							if(digitHit[0] == 0){
								digitHit[0]++;
							}
						}
					*/	
						
					}
					//Check all array slots
					int sum = 0;
					for(int a = 0; a < 10; a++){
						if(digitHit[a] == 1)
							sum++;
					}
					if(sum == 10){
						System.out.println("Case #" +( i+1) +": "+orgmult);
						break;
					}
					if(j == 999998){
						System.out.println("Case #" +( i+1)+": INSOMNIA");
						break;
					}
				}
			}
		}
	}
}









