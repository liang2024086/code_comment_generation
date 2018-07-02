package methodEmbedding.Magic_Trick.S.LYD2201;

import java.util.ArrayList;
import java.util.Scanner;


public class Magic {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int ncase = scan.nextInt();	
		for(int i=0; i < ncase; i++){
			int row1 = scan.nextInt();
			//System.out.println(row1);
			ArrayList<int[]> rowele1 = new ArrayList<int[]> ();
			
			for(int k=0; k < 4; k++){
				int[] ele = new int[4];
				for(int j = 0; j < 4; j++){
					ele[j] = scan.nextInt();				
				}
				//System.out.println(ele[0]);
				rowele1.add(k, ele);

			}

			int[] row1r = rowele1.get(row1-1);

			int row2 = scan.nextInt();
			ArrayList<int[]> rowele2 = new ArrayList<int[]> ();
			
			for(int k=0; k < 4; k++){
				int[] ele2 = new int[4];
				for(int j = 0; j < 4; j++){
					ele2[j] = scan.nextInt();				
				}				
				rowele2.add(k, ele2);
			}

			int[] row2r = rowele2.get(row2-1);
			ArrayList<Integer> result = new ArrayList<Integer> ();
			for(int q=0;q<row1r.length;q++){
				for(int j=0;j<row2r.length;j++){
					if(row1r[q]==row2r[j]){
						result.add(row1r[q]);
					}
				}
			}

			if(result.size() == 1){
				System.out.println("Case #"+ (i+1) + ": " +result.get(0));
			}
			else if(result.size() == 0){
				System.out.println("Case #"+ (i+1) + ": Volunteer cheated!");
			}
			else{
				System.out.println("Case #"+ (i+1) + ": Bad magician!");
			}

		}
	}
}
