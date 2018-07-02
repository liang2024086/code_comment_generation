package methodEmbedding.Magic_Trick.S.LYD642;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Stack;
import java.util.ArrayList;

public class inputParser {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner inStream = new Scanner(new FileReader(args[0]));
		
		int cases = Integer.parseInt(inStream.nextLine());
		int count = 0;
		
		while(inStream.hasNextLine()){
			count++;
			System.out.print("Case #" + count + ": ");
			int rowNumber1 = inStream.nextInt();
			
			
			ArrayList<Integer> possibles1 = new ArrayList<Integer>();
			
			int i;
			int j;
			for(i = 1; i < 5; i++){
				for(j = 1; j < 5; j++){
					if(i == rowNumber1){
						possibles1.add(inStream.nextInt());
					}else{
						inStream.nextInt();
					}
				}
			}
			
			
			ArrayList<Integer> possibleFinals = new ArrayList<Integer>();
			
			int rowNumber2 = inStream.nextInt();
			
			for(i = 1; i < 5; i++){
				for(j = 1; j < 5; j++){
					if(i == rowNumber2){
						int temp = inStream.nextInt();
						if(possibles1.contains(temp)){
							possibleFinals.add(temp);
						}
					}else{
						inStream.nextInt();
					}
				}
			}
			
			
			if(possibleFinals.size() > 1){
				System.out.print("Bad magician!");
			}else if(possibleFinals.size() == 0){
				System.out.print("Volunteer cheated!");
			}else{
				System.out.print(possibleFinals.get(0));
			}
			
			if(count != cases){
				System.out.print("\n");
			}
			
			possibleFinals.clear();
			possibles1.clear();
			
		}
		assert (count == cases);
		inStream.close();
		
		
		
	}
	
}
