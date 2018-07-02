package methodEmbedding.Magic_Trick.S.LYD1079;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			int count = Integer.parseInt(br.readLine().trim());
			for(int i = 1; i <= count; i++){
				int selectionRow1 = Integer.parseInt(br.readLine().trim());
				String[] numbers1 = null;
				for(int j = 1; j <= 4; j++){
					 String row = br.readLine().trim();
					if(j == selectionRow1){
						//this row was selected. store the row
						numbers1 = row.split(" ");
					}
				}
				
				int selectionRow2 = Integer.parseInt(br.readLine().trim());
				String[] numbers2 = null;
				for(int j = 1; j <= 4; j++){
					 String row = br.readLine().trim();
					if(j == selectionRow2){
						//this row was selected. store the row
						numbers2 = row.split(" ");
					}
				}
				
				
				//compare both rows
				String correctNum = "";
				int matchCount = 0;
				for(int first = 0; first < 4; first++){
					for(int second = 0; second < 4; second++){
						if(numbers1[first].equals(numbers2[second])){
							correctNum = numbers1[first];
							matchCount++;
							break;
						}
					}
					if(matchCount > 1){
						//bad magician
						System.out.println("Case #" + i + ": Bad magician!");
						break;
					}
				}
				if(matchCount == 1){
					System.out.println("Case #" + i + ": " +  correctNum);
				} 
				else if(matchCount == 0){
					System.out.println("Case #" + i +": Volunteer cheated!");
				}
				matchCount = 0;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
