package methodEmbedding.Magic_Trick.S.LYD922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;


public class magic {

	public static void main(String[] args) throws FileNotFoundException {
		 if (args.length > 0) {
			System.setIn(new FileInputStream(args[0]));
			System.setOut(new PrintStream(new FileOutputStream(args[0]+ ".txt")));
		}
		
	

		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int i=0; i<t;i++){
			int where = sc.nextInt()-1;
			int[][] cards1 = new int[4][4];
			int[][] cards2 = new int[4][4];
			int cunt =0;
			int card = 0;
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					int cardo = sc.nextInt();
					cards1[j][k] = cardo;
				}
			}
			int[] chosen = cards1[where];
			int where2 = sc.nextInt()-1;
			
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					int cardo = sc.nextInt();
					cards2[j][k] = cardo;
				}
			}
			int[] chosen2 = cards2[where2];
			
			
			
			for(int j=0; j<chosen.length;j++){
				for(int k=0; k<chosen2.length;k++){
					if(chosen[j]==chosen2[k] && cunt==0){
						card = chosen[j];
						cunt++;
					}
					else if(chosen[j]==chosen2[k] && cunt==1){
						cunt++;
					}
				}
			}
			
			
			
			int caso =i+1;
					
			if(cunt>1){
				System.out.println("Case #"+caso+": "+ "Bad magician!");
			}
			else if(cunt==0){
				System.out.println("Case #"+caso+": "+"Volunteer cheated!");
			}
			else {
				System.out.println("Case #"+caso+": "+ card);
			}
			
			
		}
		
		
		
		sc.close();
		
		
	}

}
