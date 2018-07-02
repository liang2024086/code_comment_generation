package methodEmbedding.Magic_Trick.S.LYD996;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;


public class Solver {

	public static void main(String [] args) throws NumberFormatException, IOException{
		
		FileReader fr = new FileReader("A-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		
		int numberOfGames = Integer.parseInt(br.readLine());
		int [][] arrangement = new int[4][4];
		int actualSolution1;
		int actualSolution2;
		List<Integer> listOfPosibles1 = new LinkedList<Integer>();
		List<Integer> listOfPosibles2 = new LinkedList<Integer>();
		
		String line;
		StringTokenizer st;
		
		for(int i = 1; i <= numberOfGames; i++){
			//reading solution for arrangement
			actualSolution1 = Integer.parseInt(br.readLine());
			
			//reading cards
			for(int j = 0; j < arrangement.length; j++){
				line = br.readLine();
				st = new StringTokenizer(line," ");
				for(int k = 0; k < arrangement.length; k++){
					arrangement[j][k] = Integer.parseInt(st.nextToken());
					//System.out.print(arrangement[j][k] + " ");
				}
				//System.out.println();
			}
			
			for(int j = 0; j < arrangement.length; j++){
				listOfPosibles1.add(arrangement[actualSolution1-1][j]);
			}
			//System.out.println("----------1----------");
			//System.out.println(listOfPosibles1);
			//System.out.println("----------1----------");
			//reading second solution for arrangement
			actualSolution2 = Integer.parseInt(br.readLine());
			
			//reading cards
			for(int j = 0; j < arrangement.length; j++){
				line = br.readLine();
				st = new StringTokenizer(line," ");
				for(int k = 0; k < arrangement.length; k++){
					arrangement[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int j = 0; j < arrangement.length; j++){
				listOfPosibles2.add(arrangement[actualSolution2-1][j]);
			}
			//System.out.println("-----------2----------");
			//System.out.println(listOfPosibles2);
			//System.out.println("-----------2----------");
			
			int amountOfEquals = 0;
			int solution = -1;
			for(Integer equals : listOfPosibles1){
				if(listOfPosibles2.contains(equals)){
					amountOfEquals++;
					solution = equals;
				}
			}
			if(amountOfEquals == 1){
				System.out.println("Case #" + i + ": " + solution);
			}
			else if(amountOfEquals == 0){
				System.out.println("Case #" + i + ": Volunteer cheated!");
			}
			else if(amountOfEquals > 1){
				System.out.println("Case #" + i + ": Bad magician!");
			}

			listOfPosibles1 = new LinkedList<Integer>();
			listOfPosibles2 = new LinkedList<Integer>();
		}
		
	}
	
}
