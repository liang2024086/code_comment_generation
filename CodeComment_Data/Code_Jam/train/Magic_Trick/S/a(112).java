package methodEmbedding.Magic_Trick.S.LYD1402;

import java.util.Scanner;

public class Scalar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int m[][] = new int[4][4];
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					m[i][j] = sc.nextInt();
				}
			}
			int o = sc.nextInt();
			int m2[][] = new int[4][4];
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					m2[i][j] = sc.nextInt();
				}
			}
			int commoncount = 0;
			int common = 0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(m[n-1][i] == m2[o-1][j]) {
						commoncount++;
						common = m[n-1][i];
					}
				}
			}
			
			int tmp = a+1;
			System.out.print("Case #"+tmp+": ");
			switch(commoncount){
			case 0: System.out.println("Volunteer cheated!");break;
			case 1: System.out.println(common);break;
			default: System.out.println("Bad magician!");break;
			}
		}
	}

}
