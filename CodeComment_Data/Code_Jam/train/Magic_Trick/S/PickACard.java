package methodEmbedding.Magic_Trick.S.LYD309;

import java.math.BigInteger;
import java.util.Scanner;

public class PickACard {

	public static void main(String[] args) {
		//first set
		// int arr1[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		// int arr2[][] = {{1,2,5,4},{3,11,6,15},{9,10,7,12},{13,14,8,16}};

		// second set 
		//int arr1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
		//int arr2[][] ={ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
		
		// Third set
		
		int arr1[][] =new int[4][4];//{ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
		int arr2[][] =new int[4][4];//{ { 1, 2, 3, 4 }, { 5, 6, 7, 16 }, { 9, 10, 11, 12 },{ 13, 14, 15, 8 } };
		int firstIp = 0;
		int secondIp = 0;
		int answer = 0;
		int count =0;
		
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int c=0;c<testCases;c++){
		firstIp = in.nextInt();
		for(int l=0;l<4;l++){
			for(int m=0;m<4;m++){
				arr1[l][m]=in.nextInt();
			}
			
		}
		secondIp = in.nextInt();
		for(int l=0;l<4;l++){
			for(int m=0;m<4;m++){
				arr2[l][m]=in.nextInt();
			}
			
		}
		
		/*
		for(int k=0;k<testCases;k++){
			firstIp = in.nextInt();
			secondIp = in.nextInt();
			
			
		}*/

		 //System.out.println(" firstIp "+firstIp);
		// System.out.println(" secondIp "+secondIp);
		/* for(int l=0;l<4;l++){
				for(int m=0;m<4;m++){
					System.out.println("First Array "+arr1[l][m]);
					System.out.println("Second Array "+arr2[l][m]);
				}
				
			}*/
		

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr1[firstIp - 1][i] == arr2[secondIp - 1][j]) {
					// System.out.println(arr2[secondIp-1][j]);
					answer = arr2[secondIp - 1][j];
					count++;
				}
			}
		}
		//System.out.println("Count is "+count);
		if (answer != 0) {
			if(count>1){
				System.out.println("Bad magician!");
			}else{
				System.out.println("Answer is " + answer);
			}
		} else {
			System.out.println("Volunteer cheated!");
		}
		count =0;
		 firstIp = 0;
		 secondIp = 0;
		 answer = 0;
	}
		
	}
	
}
