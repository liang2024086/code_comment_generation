package methodEmbedding.Standing_Ovation.S.LYD1309;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = 
                new BufferedReader(new InputStreamReader(System.in));
		
    	int testCases=Integer.parseInt(input.readLine()); //number of test cases
    	String[][] data=new String[testCases][];//data

    	///move data to charArray
    	for (int j=0;j<testCases;j++){
    		data[j]=input.readLine().split("");
    		
		    							
			int currentlyClapping=0;
			int friendsAdded=0;
			int peopleNeeded=0;
			
			for (int i=2;i<data[j].length;i++){
				if (Integer.parseInt(data[j][i])!=0){
					peopleNeeded=i-2-currentlyClapping;
					if (peopleNeeded>0){
						friendsAdded+=peopleNeeded;
						currentlyClapping+=peopleNeeded;
					}
					currentlyClapping+=(Integer.parseInt(data[j][i]));
				}
				if (currentlyClapping>=data[j].length-2)
					break;				
			}
			System.out.println("Case #"+(j+1)+": "+friendsAdded);
    	}
    	
		
	}

}
