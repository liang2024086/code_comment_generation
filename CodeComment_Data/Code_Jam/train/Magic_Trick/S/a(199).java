package methodEmbedding.Magic_Trick.S.LYD402;

import java.util.*;

public class a {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		for(int i = 0; i < K; i++){
			System.out.print("Case #"+(i+1)+": ");
			int nums[] = new int[16];
			//For each case
			int row = in.nextInt();
			//read row
			for(int j = 0; j < 4; j++){
				for(int x = 0; x < 4; x++){
					int n = in.nextInt();
					if(j == row-1)
						nums[n-1]++;
				}
			}
			row = in.nextInt();
			in.nextLine();
			//next number
			for(int j = 0; j < 4; j++){
				for(int x = 0; x < 4; x++){
					int n = in.nextInt();
					if(j == row-1)
						nums[n-1]++;
				}
			}
			int max = 0;
			boolean found = false;
			boolean die = false;
			for(int m=0;m<16;m++){
				if(2 == nums[m]){
					if(found){
						System.out.println("Bad magician!");
						die = true;
						break;
					}
					max = m+1;
					found = true;
				}
			}
			if(die)
				continue;
			if(found){
				System.out.println(max);
			} else {
				System.out.println("Volunteer cheated!");
			}

		}
	}

}
