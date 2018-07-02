package methodEmbedding.Counting_Sheep.S.LYD1003;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class SheepA{

	public static void main(String [] args) throws IOException{

		List<String> myNumbers = new ArrayList<String>();
		 BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
		 PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		 
		 HashSet<Integer> allDigits = new HashSet<Integer>();
		 
		 for(int i = 0; i <= 9; i++){
		 	allDigits.add(i);
		 }

		 String line = f.readLine();

		 StringTokenizer st = new StringTokenizer(line);
		 int numTestCases = Integer.parseInt(st.nextToken());

		 line = f.readLine();	
		 

		 while(line != null){
		 	myNumbers.add(line);

		 	line = f.readLine();	
		 }


		 for(int i = 0; i < myNumbers.size(); i++){
		 	//iterate through numbers until max size
		 	int number = Integer.parseInt(myNumbers.get(i));
		 	int multiplier = 1;
		 	HashSet<Integer> numbersSeen = new HashSet<Integer>();

		 	if(number == 0){
		 		writer.println("Case #" + (i+1) + ": INSOMNIA");
		 	}
		 	else{
			 	while(multiplier < Integer.MAX_VALUE){
			 		int newNumber = number * multiplier;

			 		

			 		while(newNumber > 0){
			 			int a = newNumber / 10;
			 			int b = newNumber - a * 10;
			 			newNumber = a;
			 			numbersSeen.add(b);

			 		}

			 		if(numbersSeen.equals(allDigits)){
			 			writer.println("Case #" + (i+1) + ": " + number * multiplier);
			 			break;
			 		}
			 		
			 		

			 		multiplier++;
			 	}
		 	}
		 }

		writer.close();


	}
}
