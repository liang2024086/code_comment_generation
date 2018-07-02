package methodEmbedding.Magic_Trick.S.LYD259;

import java.util.*;
import java.io.*;
public class practice {
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(new File("input"));
			
			int N = sc.nextInt();
			
			
			int caseNum = 1;
			while (caseNum<=N){
				int row = sc.nextInt();
				ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
				for (int i=0;i<4;i++){
					ArrayList<Integer> aRow = new ArrayList<Integer>();
					for (int j=0;j<4;j++){
						aRow.add(sc.nextInt());
					}
					board.add(aRow);
				}
				ArrayList<Integer> cur = board.get(row-1);
				int row2 = sc.nextInt();
				ArrayList<ArrayList<Integer>> board2 = new ArrayList<ArrayList<Integer>>();
				for (int i=0;i<4;i++){
					ArrayList<Integer> aRow = new ArrayList<Integer>();
					for (int j=0;j<4;j++){
						aRow.add(sc.nextInt());
					}
					board2.add(aRow);
				}
				ArrayList<Integer> cur2 = board2.get(row2-1);
				ArrayList<Integer> cur3 = new ArrayList<Integer>();
				for (Integer i:cur){
					for (Integer i2:cur2){
						if (i==i2){
							cur3.add(i);
						}
					}
				}
				if (cur3.size() == 1){
					System.out.println("Case #"+ caseNum + ": "+cur3.get(0));
				}
				if (cur3.size() > 1){
					System.out.println("Case #"+ caseNum + ": Bad magician!");
				}
				if (cur3.size() < 1){
					System.out.println("Case #"+ caseNum + ": Volunteer cheated!");
				}
			
				caseNum++;
			}
		}catch (Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
