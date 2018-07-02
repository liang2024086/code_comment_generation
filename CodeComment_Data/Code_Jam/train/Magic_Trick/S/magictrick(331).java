package methodEmbedding.Magic_Trick.S.LYD1088;

import java.util.ArrayList;
import java.util.Scanner;


public class magictrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new magictrick();

	}
	
	magictrick(){
		Scanner in = new Scanner(System.in);
		
		int loops = in.nextInt();
		
		for(int i = 0; i < loops; i++){
			int guess1 = in.nextInt();
			ArrayList<Integer> possnums = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
			int waste;
			for(int j = 1; j <= 4; j++){
				ArrayList<Integer> row = new ArrayList<Integer>();
				for(int k = 0; k < 4; k++){
					row.add(in.nextInt());
				}
				rows.add(row);
			}
			
			int guess2 = in.nextInt();
			String ans;
			ArrayList<ArrayList<Integer>> newrows = new ArrayList<ArrayList<Integer>>();
			for(int j = 0; j < 4; j++){
				ArrayList<Integer> newrow = new ArrayList<Integer>();
				for(int k = 0; k < 4; k++){
					newrow.add(in.nextInt());
				}
				newrows.add(newrow);
			}
			
			
			int possans = -1;
			boolean messedup = false;
			int count = 0;
			for(Integer val : rows.get(guess1-1)){
				if(newrows.get(guess2-1).contains(val)){
					count++;
					possans = val;
				}
			}
			if(count == 0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(count == 1)
				System.out.println("Case #"+(i+1)+": "+possans);
			else
				System.out.println("Case #"+(i+1)+": Bad magician!");
			
		}
	}

}
