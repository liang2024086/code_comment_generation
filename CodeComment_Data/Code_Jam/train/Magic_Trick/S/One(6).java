package methodEmbedding.Magic_Trick.S.LYD986;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class One {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader myReader = new BufferedReader(new FileReader("C:\\Users\\William Li\\Desktop\\A-small-attempt1.in"));
		PrintWriter myWriter = new PrintWriter(new FileWriter("C:\\Users\\William Li\\Desktop\\output.out"));
		
		int T = Integer.parseInt(myReader.readLine());
		
		for (int t = 1; t <= T; t++){
			
			int firstRow = Integer.parseInt(myReader.readLine());
			int[] firstLine = new int[4];
			
			for (int i = 1; i < 5; i++){
				
				if (i == firstRow){
					
					String[] line = myReader.readLine().split(" ");
					
					for (int index = 0; index < 4; index++){
						
						firstLine[index] = Integer.parseInt(line[index]);
						
					}
					
				}else{
					
					myReader.readLine();
					
				}
					
			}
			
			int secondRow = Integer.parseInt(myReader.readLine());
			int[] secondLine = new int[4];
			
			for (int i = 1; i < 5; i++){
				
				if (i == secondRow){
					
					String[] line = myReader.readLine().split(" ");
					
					for (int index = 0; index < 4; index++){
						
						secondLine[index] = Integer.parseInt(line[index]);
						
					}
					
				}else{
					
					myReader.readLine();
					
				}
				
			}
			
			int count = 0;
			int answer = -1;
			
			for (int i = 0; i < 4; i++){
				
				for (int a = 0; a < 4; a++){
					
					if (firstLine[i] == secondLine[a]){
						
						answer = firstLine[i];
						count++;
								
					}
					
				}
				
			}
			
			if (count > 1){
				
				myWriter.println("Case #" + t + ": Bad magician!");
				
			}else if (count == 1){
				
				myWriter.println("Case #" + t + ": " + answer);
				
			}else{
				
				myWriter.println("Case #" + t + ": Volunteer cheated!");
				
			}
			
		}
		
		myReader.close();
		myWriter.close();
		
		System.exit(0);
		
	}

}
