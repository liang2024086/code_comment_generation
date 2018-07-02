package methodEmbedding.Counting_Sheep.S.LYD893;

import java.util.*;
import java.io.*;

public class SheepStrategy {
	public static HashMap mapNoDigits = new HashMap();
	public static void main(String[] args){
		try{
			File inputfile = new File("input.txt");
			Scanner noScanner = new Scanner(inputfile);
			PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
			// Input for the number of test cases
			int noTestCases = noScanner.nextInt();
	
			for(int i=0; i< noTestCases; i++){
				int n = noScanner.nextInt();
				if(n==0){
					writer.println("Case #"+(i+1)+": INSOMNIA");
				}else{
					mapNoDigits.clear();
					int temp = n;
					int factor = 2;
					int result = n;
					while(temp > 0){					
						int lastDigit = temp % 10;
						if(!mapNoDigits.containsKey(lastDigit)){						
							mapNoDigits.put(lastDigit, 1);
						}
						temp = temp/10;
						if(mapNoDigits.size() >= 10){
							break;
						}
						if(temp<=0){						
							temp = n * factor;
							result = temp;
							factor ++;						
						}					
					}
					writer.println("Case #"+(i+1)+": "+result);
				}
							
			}			
			writer.close();	
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("File not found");			
        }   
					
	}
}
