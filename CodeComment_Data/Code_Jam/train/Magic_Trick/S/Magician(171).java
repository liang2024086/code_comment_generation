package methodEmbedding.Magic_Trick.S.LYD643;


import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Magician {

	public static void main(String[] args) {
		BufferedInputStream inputFile = (BufferedInputStream) Magician.class.getClassLoader().getResourceAsStream("input.txt");

        Scanner scanner = new Scanner(inputFile);
//        ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        int caseCount = scanner.nextInt();
        
        for(int i = 0 ; i < caseCount ; i++)
        {
        	int guessF = scanner.nextInt();
        	int[] cards = new int[16];
        	int firstIndex = (guessF - 1) * 4;
        	
        	ArrayList<Integer> firstRow = new ArrayList<Integer>();
        	for(int j = 0;j < 16;j++){
        		cards[j] = scanner.nextInt();
        		if(j >= firstIndex && j < firstIndex + 4){
        			firstRow.add(cards[j]);
        		}
        	}
        	
        	
        	int guessS = scanner.nextInt();
        	int[] cards_second = new int[16];
        	int secondIndex = (guessS - 1) * 4;
        	
        	int containing = 0;
        	int foundNumber = -1;
        	for(int k= 0;k < 16;k++){
        		cards_second[k] = scanner.nextInt();
        		if(k >= secondIndex && k < secondIndex + 4){
        			boolean doesContain = firstRow.contains(cards_second[k]);
        			if(doesContain){
        				containing++;
        				foundNumber = cards_second[k];
        			}
        		}
        	}
        	
        	if(containing == 1){
        		System.out.println("Case #" + (i + 1) + ": " + foundNumber);
        	}
        	else if(containing == 0){
        		System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
        	}
        	else{
        		System.out.println("Case #" + (i + 1) + ": Bad magician!");
        	}
        	
        }

        scanner.close();
	}

}
