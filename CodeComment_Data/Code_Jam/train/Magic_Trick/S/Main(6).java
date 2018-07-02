package methodEmbedding.Magic_Trick.S.LYD1971;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int n= 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 0 ; i < n ; i++){
			
			ArrayList<Integer> poss1 = new ArrayList<>();
			ArrayList<Integer> poss2 = new ArrayList<>();
			
			for(int j = 0 ; j < 2 ; j++){
				int row = scan.nextInt();
				
				for(int r = 0 ; r < 4 ; r++){
					for(int s = 0 ; s < 4 ; s++){
						int kk = scan.nextInt();
						
						if(r+1 == row){
							if(j == 0){
								poss1.add(kk);
							}
							else{
								poss2.add(kk);
							}
						}
					}
				}
			}
			
			ArrayList<Integer> poss3 = new ArrayList<>();
			for(Integer val : poss1){
				if(poss2.contains(val)){
					poss2.remove(val);
					poss3.add(val);
				}
			}
			
			int res = (4-poss2.size());

			System.out.print("Case #"+(i+1)+": ");
			if(res == 1){
				System.out.println(poss3.get(0));
			}
			else if(res <= 0){
				System.out.println("Volunteer cheated!");
			}
			else{
				System.out.println("Bad magician!");
			}
		}
	}

}
