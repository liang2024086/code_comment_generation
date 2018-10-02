package methodEmbedding.Magic_Trick.S.LYD49;

import java.io.*;
import java.util.*;

public class MagicTrick {
	
	public static void main(String[] args) throws Exception{

		File file = new File("C:/Users/Rishabh/workspace/GoogleCodeJam/src/input.txt");
		Scanner scanner = new Scanner(file);
		int numberCases = Integer.parseInt(scanner.next());
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		int i = 0;
		while(i < numberCases){
			int listNumber1 = Integer.parseInt(scanner.next());
			//System.out.println(listNumber1);
			int count = 0;
			
			for(int a = 0; a < 4*(listNumber1 - 1); a++){
				int tmp = Integer.parseInt(scanner.next());
				count++;
			}
			
			for(int b = 0; b < 4; b++){
				list1.add(Integer.parseInt(scanner.next()));
				count++;
			}
			
//			System.out.print("list1: ");
//			for(int c = 0; c < list1.size(); c++){
//				System.out.print(list1.get(c));
//			}
			
			//System.out.println();
			
			for(int x = count; x < 16; x++){
				int tmp = Integer.parseInt(scanner.next());
			}
			
			count = 0;
			int listNumber2 = Integer.parseInt(scanner.next());
			//System.out.println(listNumber2);
			
			for(int a = 0; a < 4*(listNumber2 - 1); a++){
				int tmp = Integer.parseInt(scanner.next());
				count++;
			}
			
			for(int b = 0; b < 4; b++){
				list2.add(Integer.parseInt(scanner.next()));
				count++;
			}
			
//			System.out.print("list2: ");
//			for(int c = 0; c < list2.size(); c++){
//				System.out.print(list2.get(c));
//			}
			
			for(int x = count; x < 16; x++){
				int tmp = Integer.parseInt(scanner.next());
			}
			
			//System.out.println();
			
			list1.retainAll(list2);
			
			if(list1.size() == 1)
				System.out.println("Case #" + (i+1) + ": " + list1.get(0));
			
			else if(list1.size() > 1)
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			
			else
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			
			//System.out.println();
			
			list1.clear();
			list2.clear();
			
			i++;
		}
	}

}
