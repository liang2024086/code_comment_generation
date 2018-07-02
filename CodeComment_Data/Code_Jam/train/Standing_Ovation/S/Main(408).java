package methodEmbedding.Standing_Ovation.S.LYD358;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int numberOfTestCases = Integer.parseInt(in.readLine());
			String[] strMainArray = new String[numberOfTestCases];
			
			for(int i=0; i<numberOfTestCases; i++){
				strMainArray[i] = in.readLine();
			}
			
			for(int i=0; i<numberOfTestCases; i++){
				
				String[] strArray = strMainArray[i].split(" ");
				String str = strArray[1];
				int numberOfPersonsTobeStanded =0;
				int counter =0;
				for(int j=0;j<=Integer.parseInt(strArray[0]); j++){
					int value = Integer.parseInt(""+str.charAt(j));
					
					if(j==0){
						counter += value;
						continue;
					} 
						if(j>counter){
							numberOfPersonsTobeStanded += 1;
							counter += j - counter;
							
						
					}
						counter += value;
				}
				System.out.print("Case #"+(i+1)+": "+ numberOfPersonsTobeStanded);
				if(i!=numberOfTestCases-1)
					System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
