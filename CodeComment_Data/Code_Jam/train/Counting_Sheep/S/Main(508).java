package methodEmbedding.Counting_Sheep.S.LYD614;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//arg[0] will be the path to the file, arg[1] will be the path to the result
		
		String filePath = args[0];
		File inputFile = new File(filePath);
		if(!inputFile.exists()){
			System.out.println("File not exists");
		}
		
		List<Integer> listTestCases = new ArrayList<>();

		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFile));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
		
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(args[1])));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream));
		
		int numberOfTestCases = Integer.parseInt(bufferedReader.readLine().trim());
		for (int i = 0; i < numberOfTestCases; i++) {
			listTestCases.add(Integer.parseInt(bufferedReader.readLine().trim()));
		}
		
		int caseCounter = 0;
		for (Integer testCase : listTestCases) {
			caseCounter++;
			Set<Integer> matched = new HashSet<>();
			int i=0;
			while(true){
				i++;
				int counter = testCase * i;
				if(counter ==0){
					bufferedWriter.write("Case #" + caseCounter + ": " + "INSOMNIA");
					bufferedWriter.newLine();
					break;
				}
				
				String parseCounter = Integer.toString(counter);
				for (char intChar : parseCounter.toCharArray()) {
					matched.add(Character.getNumericValue(intChar));
				}

				if(matched.size() == 10){
					bufferedWriter.write("Case #" + caseCounter + ": " + parseCounter);
					bufferedWriter.newLine();
					 break;
				} 
			}
		}
		
		// close all streams here
		bufferedReader.close();
		bufferedWriter.close();
		
	}
	
}
