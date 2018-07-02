package methodEmbedding.Magic_Trick.S.LYD1640;

import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws java.io.FileNotFoundException,java.io.IOException{
		java.io.BufferedReader bRead=new java.io.BufferedReader(new java.io.FileReader("F:\\A-small-attempt0.in"));
		java.io.BufferedWriter bWrite=new java.io.BufferedWriter(new java.io.FileWriter("F:\\A-small-attempt0.out"));
		StringBuffer output=new StringBuffer();
		int noCases=Integer.parseInt(bRead.readLine());
		Set<Integer> numbers = new HashSet<>();
		
		for(int i=0;i<noCases;i++){
			boolean badMagician = false, volunteerCheated = true;
			int chosenNumber = -1; String resultStr = "";
			numbers.clear();
			
			//Processing the first chosen number
			int chosenRow = Integer.parseInt(bRead.readLine());
			for(int row=1; row<=4; row++) {
				String[] curRowArray = bRead.readLine().split(" ");
				if(row == chosenRow) {
					for(String str : curRowArray)
						numbers.add(Integer.parseInt(str));
				}
			}

			//Processing the second chosen number
			int secondChosenRow = Integer.parseInt(bRead.readLine());
			for(int row=1; row<=4; row++) {
				String[] curRowArray = bRead.readLine().split(" ");
				if(row == secondChosenRow) {
					for(String str : curRowArray){
						int num = Integer.parseInt(str);
						if(numbers.contains(num)){
							volunteerCheated = false;
							if(chosenNumber != -1)
								badMagician = true;
							chosenNumber = num;
						}
					}
				}
			}
			
			if(volunteerCheated)
				resultStr = "Volunteer cheated!";
			else if(badMagician)
				resultStr = "Bad magician!";
			else
				resultStr = Integer.toString(chosenNumber);
			output.append("Case #"+(i+1)+": "+resultStr+"\n");			
			}//end noCases
		bWrite.write(output.toString());
		bWrite.close();bRead.close();
		}
	
	}

