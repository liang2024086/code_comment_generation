package methodEmbedding.Magic_Trick.S.LYD1255;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class MagicTrick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		int firstRowNumber = 0;
		int secondRowNumber = 0;
		Set<Integer> firstSet = new HashSet<Integer>();
		Set<Integer> secondSet = new HashSet<Integer>();
		int tem = 1;
		while(testCount != 0){
			firstRowNumber = scanner.nextInt();
		
			for(int i = 1 ; i< firstRowNumber ; i++){
				for(int j = 0 ;j < 4 ; j++){
					scanner.nextInt();
				}
			}
			for(int i = 0 ;i < 4 ; i++){
				firstSet.add(scanner.nextInt());
			}
			for (int i = 0; i < ((4-firstRowNumber)*4) ; i++) {
				scanner.nextInt();
			}
			secondRowNumber = scanner.nextInt();
			for(int i = 1 ; i< secondRowNumber ; i++){
				for(int j = 0 ;j < 4 ; j++){
					scanner.nextInt();
				}
			}
			for(int i = 0 ;i < 4 ; i++){
				secondSet.add(scanner.nextInt());
				
			}
			
			for (int i = 0; i < ((4-secondRowNumber)*4) ; i++) {
				scanner.nextInt();
			}
		
			firstSet.retainAll(secondSet);
		
			if(firstSet.size() == 0){
				System.out.println("Case #"+ tem +": "+ "Volunteer cheated!");
				firstSet.clear();
				secondSet.clear();
				testCount--;
				tem++;
				continue;
			}
			if(firstSet.size() > 1){
				System.out.println("Case #"+ tem +": "+ "Bad magician!");
				firstSet.clear();
				secondSet.clear();
				testCount--;
				tem++;
				continue;
			}
			
			System.out.println("Case #"+ tem +": "+ firstSet.iterator().next());
			firstSet.clear();
			secondSet.clear();
			testCount--;
			tem++;
		}
		
	}

}
