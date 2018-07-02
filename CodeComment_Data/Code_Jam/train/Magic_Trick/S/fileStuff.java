package methodEmbedding.Magic_Trick.S.LYD777;

import java.util.*;
import java.io.*;

public class fileStuff {

    public static Map<Integer, Boolean> isCaseAnalyzed = new HashMap<Integer, Boolean>();
    public static Map<Integer, Boolean> isCaseIncomplete = new HashMap<Integer, Boolean>();
	
	public static void main(String[] args){
		try {
//			BufferedReader br = new BufferedReader(new FileReader(new File("E:\\junk\\code jam problem1 input.txt")));
			BufferedReader br = new BufferedReader(new FileReader(new File("E:\\junk\\A-small-attempt2.in")));
			int numberOfTests = Integer.parseInt(br.readLine());//the first line of the file will be the number of tests which will follow, 	
																//it will blow up if not (could add a try catch for this but oh well)
			for(int i = 0; i < numberOfTests; i++){
				int caseNumber = i+1;
				int firstRowSelectedByVolunteer = Integer.parseInt(br.readLine());//this will also blow up to if not an int...
				
				String[] selectedRow1 = null;
				for(int j = 1; j < 5; j++){//move through the next 4 rows of our input file and store the one the volunteer selected
					if(j == firstRowSelectedByVolunteer){
						selectedRow1 = br.readLine().split(" ");
					}
					else{
						br.readLine();
					}
				}

				String[] selectedRow2 = null;
				int secondRowSelectedByVolunteer = Integer.parseInt(br.readLine());//this too :)
				for(int k = 1; k < 5; k++){//move through the next 4 rows of our input file and store the one the volunteer selected
					if(k == secondRowSelectedByVolunteer){
						selectedRow2 = br.readLine().split(" ");
					}
					else{
						br.readLine();
					}
				}
				
				//compare first row selected to second row selected and find any matching values to determine our answer
				List<String> matches = new ArrayList<String>();
				for(String s: selectedRow1){
					for(String s2: selectedRow2){
						if(s2.equals(s)){
							matches.add(s);
						}
					}
				}
//				System.out.println("matches: " + matches);
				String message = "Case #" + caseNumber + ": ";
				if(matches.size() == 0){
					message += "Volunteer cheated!";
				}
				else if(matches.size() == 1){
					message += matches.get(0);
				}
				else if(matches.size() > 1){
					message += "Bad magician!";
				}
				System.out.println(message);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

