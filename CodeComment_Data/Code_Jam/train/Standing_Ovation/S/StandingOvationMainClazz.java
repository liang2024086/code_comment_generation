package methodEmbedding.Standing_Ovation.S.LYD733;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StandingOvationMainClazz {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Incorrect input. Enter input file name");
			System.exit(0);
		}
		BufferedReader br = null;
		BufferedWriter bw = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader(args[0]));
			File file = new File("Output.txt");
			 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			
			int inputSize = Integer.parseInt(br.readLine().trim());
			for(int index =0; index < inputSize; index++) {
				sCurrentLine = br.readLine().trim();
				String[] input = sCurrentLine.split(" ");
				List<Integer> audienceArray = new ArrayList<Integer>();
				String[] audienceList = input[1].trim().split("");
				for(int arrayIterator = 1; arrayIterator < audienceList.length; arrayIterator ++) {
					audienceArray.add(Integer.parseInt(audienceList[arrayIterator])); 
				}
				Integer standingCount = 0;
				Integer requiredFrnds = 0;
				Integer shynessLevel = null;
				standingCount += audienceArray.get(0);
				for(int arrayIterator = 1; arrayIterator < audienceArray.size(); arrayIterator ++) {
					shynessLevel = arrayIterator;
					Integer audienceCount = audienceArray.get(arrayIterator);
					if (audienceCount > 0) {
						if (shynessLevel > standingCount) {
							requiredFrnds += (shynessLevel - standingCount);
							standingCount += requiredFrnds;
						}
						standingCount += audienceCount;
					}
				}
				bw.write("Case #" + (index+1) + ": " + requiredFrnds);
				if(index < inputSize -1) {
					bw.newLine();
				}
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
				if (bw != null) bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
