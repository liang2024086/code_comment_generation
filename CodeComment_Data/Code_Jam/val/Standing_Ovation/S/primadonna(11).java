package methodEmbedding.Standing_Ovation.S.LYD1058;

import java.io.BufferedReader;
import java.io.FileReader;


public class primadonna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader dataFile = new FileReader(args[0]);
			BufferedReader buffDataFile = new BufferedReader(dataFile);
			String line = buffDataFile.readLine(); // read away the first line
			int testCases = Integer.parseInt(line);
			int testNumber = 0;
			for (int j = 0; j < testCases; j++) {
				testNumber++;
				line = buffDataFile.readLine(); // reads in the line of max shyness level and audience numbers
				String tokens[] = line.split(" "); // get the maxShyness value
				int maxShyness = Integer.parseInt(tokens[0]); // convert to int
				int friendsToAdd = 0;
				int count = 0;
				for (int i = 0; i <= maxShyness; i++){
					// for each level of shyness
					int shyFactor = i;
					String getPeople;
					if ( maxShyness > 1 && i == maxShyness){
			//			System.out.println("enter if");
						getPeople = tokens[1].substring(i);
					}
					else if (maxShyness == 1 && i == maxShyness){
			//			System.out.println("enter else if");
						getPeople = tokens[1].substring(i);
					}
					else {
			//			System.out.println("enter else");
						getPeople = tokens[1].substring(i, i+1);
					}
					int people = Integer.parseInt(getPeople);
					if (shyFactor > count){
						int needed = shyFactor - count;
						friendsToAdd += needed;
						count += needed;
						count += people;
					}
					else {
						count += people;
					}
				}
				System.out.println("Case #" + testNumber + ": " + friendsToAdd);
			}
			
		//	while(line!=null){	
		//	}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
