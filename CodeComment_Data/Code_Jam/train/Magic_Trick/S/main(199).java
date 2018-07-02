package methodEmbedding.Magic_Trick.S.LYD1669;

import java.util.*;

public class magic {

	public static void main(String args[]){
		Scanner scanner =new Scanner(System.in);
		
		int T = scanner.nextInt();
		int t=1;
		while(t<=T){
			
			int answerA = scanner.nextInt()-1;
			int[][] matA = new int[4][4];
			int[][] matB = new int[4][4];
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++){
					matA[i][j]=scanner.nextInt();
				}
			int answerB = scanner.nextInt()-1;
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++){
					matB[i][j]=scanner.nextInt();
				}
			ArrayList<Integer> resA = new ArrayList<Integer>();
			for(int i=0;i<4;i++)
				resA.add(matA[answerA][i]);
			ArrayList<Integer> resB = new ArrayList<Integer>();
			for(int i=0;i<4;i++){
				if(resA.contains(matB[answerB][i]))
					resB.add(matB[answerB][i]);
			}
			
			System.out.printf("Case #%d: ",t++);
			if(resB.size()==1){
				System.out.println(resB.get(0));
			}else if(resB.size()>1){
				System.out.println("Bad magician!");
			}else {
				System.out.println("Volunteer cheated!");
			}
		}
		
	}
}
