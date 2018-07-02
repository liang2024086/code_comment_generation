package methodEmbedding.Magic_Trick.S.LYD1652;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class magickTrick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
		String sCurrentLine;
		
		List<String> inputFile = new ArrayList<String>();
		
		while ((sCurrentLine = br.readLine()) != null) {
			inputFile.add(sCurrentLine);
		}
		
		int testCaseCount = Integer.parseInt(inputFile.get(0));
		
		int ans1;
		int ans2;
		
		int count = 1;
		for(int i = 0 ; i < testCaseCount ; i++){
			List<String> testCase = inputFile.subList(count, count + 10);
			ans1 = Integer.parseInt(testCase.get(0));
			String[] row1 = testCase.get(ans1).split(" ");
			
			ans2 = Integer.parseInt(testCase.get(5));
			String[] row2 = testCase.get(ans2 + 5).split(" ");
			List<String> row2List = Arrays.asList(row2);
			
			String ansValue = "";
			int ansCount = 0;
			for (String temp : row1) {
				if(row2List.contains(temp)){
					ansValue = temp;
					ansCount++;
				}
			}
			
			int tempCount = i + 1;
			
			if(ansCount == 0){
				System.out.println("Case #" + tempCount + ": Volunteer cheated!");
			}
			else if(ansCount == 1){
				System.out.println("Case #" + tempCount + ": " + ansValue);
			}
			else if(ansCount > 1){
				System.out.println("Case #" + tempCount + ": Bad magician!");
			}
			
			count = count + 10;
			
		}

	}

}
