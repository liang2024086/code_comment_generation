package methodEmbedding.Standing_Ovation.S.LYD2116;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class week3Q1 {
	public static void main(String[] args) {
	
		try {
			File file = new File("A-small-attempt2.in");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int numofNodes = Integer.parseInt(bufferedReader.readLine());

			for(int i=0;i<numofNodes;i++){
				String line = bufferedReader.readLine();
				int commaPos = line.indexOf(' ');
				int num = Integer.parseInt(line.substring(0,commaPos));
				line = line.substring(commaPos+1);
				int sum = Character.getNumericValue(line.charAt(0));
				int result = 0;
				
				for (int j=1; j<=num; j++){
					if ( sum < j){
						result = result + (j - sum);
						sum = sum + (j-sum);
					}
					
					sum = sum + Character.getNumericValue(line.charAt(j));
				}

//				
//				int must = 
//				
//				for ( int j=1; j<num-1;j++){
//					if (sum < Character.getNumericValue(line.charAt(j)))
//						result = Character.getNumericValue(line.charAt(j)) - sum;
//					sum = sum + Character.getNumericValue(line.charAt(j));
//				}
//				
				
				
//				while ( sum < 10){
//					
//					if (sum < Character.getNumericValue(line.charAt(j+1)))
//						result = result + Character.getNumericValue(line.charAt(j)) - sum;
//					j++;
//					if(j>num)
//						break;
//					
//				}
				System.out.println("Case #" + (i+1) + ": " + result);
			}
			
		
			fileReader.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
