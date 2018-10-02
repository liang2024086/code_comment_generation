package methodEmbedding.Magic_Trick.S.LYD2023;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {

	public MagicTrick(String filename){
		Scanner s=null;
		try {
			s = new Scanner(new File(filename));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}

		String output = "";
		
		int testCases = s.nextInt();
		for (int t = 1; t <= testCases; t++){
			
			int chosenRow = s.nextInt();
			List <Integer> possibleCards = new ArrayList<Integer>();
			
			for (int r=1; r <= 4; r++){
				for (int c=1; c <= 4; c++){
					int card = s.nextInt();
					if (r == chosenRow) 
						possibleCards.add(card);
				}
			}
			int secondChosenRow = s.nextInt();
			List<Integer> finalCards = new ArrayList<Integer>();
			for (int r=1; r <= 4; r++){
				for (int c=1; c <= 4; c++){
					int card = s.nextInt();
					if (r == secondChosenRow && possibleCards.contains(card)){
						finalCards.add(card);
					}
				}
			}
			output += "Case #"+t+": ";
			if(finalCards.size() == 1)
				output += finalCards.get(0);
			if(finalCards.size() == 0)
				output += "Volunteer cheated!";
			if(finalCards.size() > 1)
				output += "Bad magician!";
			output +="\n";
		}
		
		System.out.println(output);
		
		
	}
	
	public static void main(String[] args){
		//String filename = "res/magic/input1.txt";
		String filename = "res/magic/A-small-attempt0.in";
		new MagicTrick(filename);
	}
	
}
