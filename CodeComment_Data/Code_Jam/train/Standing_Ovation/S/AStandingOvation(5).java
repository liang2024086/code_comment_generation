package methodEmbedding.Standing_Ovation.S.LYD232;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class AStandingOvation {
	
	public static void main(String args[]){
		
		try{
		File input = new File("C:/Users/Rishabh/Desktop/input.in");
		File output = new File("C:/Users/Rishabh/Desktop/A-standingOvation.out");
		
		BufferedReader br = new BufferedReader(new FileReader(input));
		
		
		//get number of test cases
		
		int testCases = Integer.parseInt(br.readLine());
		
		
		for(int test=1;  test<=testCases; test++){
		
			BufferedWriter bw;
			
			if(output.exists())
				bw = new BufferedWriter(new FileWriter(output,true));
			else
				 bw = new BufferedWriter(new FileWriter(output,false));
			
			
					int friends=0;
					
					String line=br.readLine();
					
					String[] values = line.split("\\s");
					
					int sMax = Integer.parseInt(values[0]);
					
					String[] splitValues = values[1].split("(?!^)");
					
					int audience[] = new int[(sMax+1)];
					
					int stoodUp = 0;
					
					for(int shyness =0; shyness<= sMax; shyness++){
						
								audience[shyness] = Integer.parseInt(splitValues[shyness]);
								
								if(stoodUp < shyness && audience[shyness]>0){
									friends += (shyness-stoodUp);
									stoodUp += audience[shyness] + friends;
								}
								else{
									stoodUp += audience[shyness];
								}
							
					}
					
									bw.write("Case #"+ test +": "+friends );
									bw.newLine();
									bw.close();
			}

			br.close();
		}
		
		catch(Exception  e){
			
		}
	
		
	}// END OF MAIN()
	
	

}// END OF CLASS
