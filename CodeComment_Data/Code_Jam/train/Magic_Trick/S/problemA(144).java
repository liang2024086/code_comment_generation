package methodEmbedding.Magic_Trick.S.LYD1781;

import java.io.*;
import java.util.*;

public class problemA {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("out.txt");
		int loop = sc.nextInt();
		
		for (int i = 0; i<loop; i++){
			int firstRow, secondRow;
			int answer = -1;
			firstRow = sc.nextInt();
			int [] firstGrid = new int[4];
			for (int j=0; j<4 ; j++){
				for (int k = 0 ; k<4; k++){
					if (j == firstRow-1){
						firstGrid[k] = sc.nextInt();
					}else {
						sc.nextInt();
					}
				}
			}
			secondRow = sc.nextInt();
			for (int j=0; j<4 ; j++){
				for (int k = 0 ; k<4; k++){
					if (j == secondRow -1){
						int x = sc.nextInt();
						for (int m =0;m <4 ;m++){
							if (x == firstGrid[m]){
								if (answer==-1 && answer!=-2){
									answer = x;
								}else {
									answer = -2;
								}
							}
						}
					}else {
						sc.nextInt();
					}
				}
			}
			if (answer == -2){
				out.write(String.format("Case #%d: Bad magician!\n",  i+1 ).getBytes());

			}
			else if (answer == -1){
				out.write(String.format("Case #%d: Volunteer cheated!\n",  i+1 ).getBytes());

			}else {
				out.write(String.format("Case #%d: %d\n",  i+1, answer ).getBytes());

			}
		}
		
	}
}
