package methodEmbedding.Magic_Trick.S.LYD1724;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class A {
	

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length > 0) {
			System.setIn(new FileInputStream(args[0] + ".in.txt"));
			System.setOut(new PrintStream(new FileOutputStream(args[0]+ ".out.txt")));
		}
		Scanner s = new Scanner(System.in);
		int[][] originalSet = new int [4][4];
		int[][] newSet = new int[4][4];
		int[] posible1 = new int[4];
		int[] posible2 = new int[4];		
		
		int n = s.nextInt();
		s.nextLine();
		for (int i=0;i<n;i++){
			int solution=0;
			int coincidences=0;
			int answer1 = s.nextInt();
			s.nextLine();
			/*read original set*/
			for (int j=0;j<4;j++){
				for (int k=0;k<4;k++){
					originalSet [j][k] = s.nextInt();
				}
			}
			int answer2 = s.nextInt();
			s.nextLine();
			/*read new set*/
			for (int j=0;j<4;j++){
				for (int k=0;k<4;k++){
					newSet [j][k] = s.nextInt();
				}
			}
			
			posible1 = originalSet[answer1-1];			
			posible2 =newSet[answer2-1]; 
			
			
			/*try solutions*/
			for (int j=0;j<4;j++){
				for (int k=0;k<4;k++){
					if (posible1[j]== posible2[k]){
						
						solution = posible1[j];		
						coincidences++;
					}
				}
			}
			
			if (coincidences ==1){
				System.out.println("Case #"+(i+1)+": "+solution);
			}else
			
			if (coincidences>1)
				System.out.println("Case #"+(i+1)+": "+"Bad Magician!");
			
			else if (coincidences==0){
				System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
			}
			
		}
		
		s.close();	
	}

	

}
