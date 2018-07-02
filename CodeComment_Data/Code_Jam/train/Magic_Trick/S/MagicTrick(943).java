package methodEmbedding.Magic_Trick.S.LYD1773;

import java.io.*;
import java.util.*;

public class MagicTrick {

	/**
	 * @param args
	 * @author Vipol S
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("magic.in"));
		PrintWriter pw = new PrintWriter("magic.out");
		
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++){
			if(i != 1){
				pw.println();
				System.out.println();
			}
			//System.out.println("CASE : " + i);
			int num1 = sc.nextInt() - 1;
			int[][] m1 = new int[4][4];
			for(int j = 0; j < 4;j++){
				for(int k = 0; k < 4; k++){
					m1[j][k] = sc.nextInt();
					System.out.print(m1[j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("NUM 1 = " + num1);
			int num2 = sc.nextInt() - 1;
			int[][] m2 = new int[4][4];
			for(int j = 0; j < 4;j++){
				for(int k = 0; k < 4; k++){
					m2[j][k] = sc.nextInt();
					System.out.print(m2[j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("NUM 2 = " + num2);
			int count = 0;
			int num = 0;
			for(int j = 0; j < 4;j++){
				if(count == 2){
					break;
				}
				for(int k = 0; k < 4; k++){
					System.out.println("Comparing " + m1[num1][j] + " with " + m2[num2][k] + " and num = " + num);
					if(m1[num1][j] == m2[num2][k]){
						count++;
						
						if(count == 2){
							break;
						}
						System.out.println("COUNT 1 is " + m1[num1][j]);
						num = m1[num1][j];
						break;
					}
				}
			}
			if(count == 0){
				pw.print("Case #" + i + ": Volunteer cheated!");
				System.out.print("Case #" + i + ": Volunteer cheated!");
			}
			else if(count == 1){
				pw.print("Case #" + i + ": " + num);
				System.out.print("Case #" + i + ": " + num);
			}
			else{
				pw.print("Case #" + i + ": Bad magician!");
				System.out.print("Case #" + i + ": Bad magician!");
			}
		}
		
		
        pw.flush();
        pw.close();
        sc.close();
	}

}
