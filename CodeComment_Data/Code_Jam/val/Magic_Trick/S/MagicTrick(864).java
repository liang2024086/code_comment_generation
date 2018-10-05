package methodEmbedding.Magic_Trick.S.LYD105;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String args[]) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.in"));
		PrintWriter write = new PrintWriter(new File("output.out")); 
		int t= in.nextInt();
		int first,second,j,k;
		int commons,commonNumber;
		int a[][] = new int[4][4],b[][]= new int[4][4];
		for(int i = 1; i <= t;i++){
			first = in.nextInt();
			for(j = 0; j < 4;j++ ){
				for(k = 0; k < 4;k++)
					a[j][k] = in.nextInt();
			}
			second = in.nextInt();
			for(j = 0; j < 4;j++ ){
				for(k = 0; k < 4;k++)
					b[j][k] = in.nextInt();
			}
			first--;
			second--;
			commons = 0;
			commonNumber = 0;
			for(j = 0; j < 4; j++){
				for(k = 0; k < 4; k++){
					if(a[first][j] == b[second][k]){
						commons++;
						commonNumber = a[first][j];
					}
				}
			}
			if(commons == 1){
				write.println("Case #"+i+": "+commonNumber);
			}else
				if(commons > 1){
					write.println("Case #"+i+": Bad magician!");
				}
				else
					write.println("Case #"+i+": Volunteer cheated!");
		}
		in.close();
		write.close();
	}
	
}

