package methodEmbedding.Standing_Ovation.S.LYD1215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class First {
	
	
	public static void main(String []args){
		
		File file = new File("output.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		BufferedReader br = null;
		FileWriter fw = null;				
		BufferedWriter bw = null;
		
		
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			int numOfCases =  Integer.parseInt(br.readLine());
			
			for(int i=0; i<numOfCases; i++){
				String str =  br.readLine();
				String[] arr = str.split("\\s+");
				int maxShy = Integer.parseInt(arr[0]);
				int peopleStanding = 0;
				int inviteFriends = 0;
				for(int j=0; j<arr[1].length(); j++){
					int val = Character.getNumericValue(arr[1].charAt(j));
					if(j==0){
						peopleStanding = val;
						continue;
					}
					
					if(peopleStanding < j ){
						inviteFriends += (j-peopleStanding);
						peopleStanding += (j-peopleStanding);
					}
					
						peopleStanding += val;
					
					
				}
				bw.write("Case #"+(i+1)+": "+inviteFriends+"\n");
			}
			/*while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				bw.write("Case #1: "+sCurrentLine+"\n");
			}*/
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if(bw != null)
					bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
	}
	
	
}
