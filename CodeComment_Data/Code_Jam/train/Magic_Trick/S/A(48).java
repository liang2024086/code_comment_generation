package methodEmbedding.Magic_Trick.S.LYD1378;


import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
	
		int arr1[][] = new int[4][4];
		int arr2[][] = new int[4][4];
		int n1, n2, num = 0;
		
		for(int i = 1; i <= t; i++){
			n1 = scn.nextInt();
			for(int j = 0;j<4;j++)
				for(int k=0;k<4;k++){
					arr1[j][k] = scn.nextInt();
				}
			n2 = scn.nextInt();
			for(int j = 0;j<4;j++)
				for(int k=0;k<4;k++){
					arr2[j][k] = scn.nextInt();
				}
			int found = 0;
			for(int j = 0;j<4;j++){
				for (int k=0;k<4;k++){
					if(arr1[n1-1][j]==arr2[n2-1][k]){
						found++;
						num = arr1[n1-1][j];
					}
				}
			}
			if(found==0){
				System.out.println("Case #" + i + ": Volunteer cheated!");
			}else if(found==1){
				System.out.println("Case #" + i + ": " + num);
			}else{
				System.out.println("Case #" + i + ": Bad magician!");
			}
			
		}
		
		scn.close();

	}

}
