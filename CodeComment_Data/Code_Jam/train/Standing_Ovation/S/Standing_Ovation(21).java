package methodEmbedding.Standing_Ovation.S.LYD1893;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class Standing_Ovation {
	public static void main(String args[]) throws IOException{
		FileInputStream fstream = new FileInputStream("/Users/nitin_lomte/Downloads/A-small-attempt2.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		File file = new File("/Users/nitin_lomte/Downloads/output.txt");
		  
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		String strLine;
		int testcaseCount;
		int requiredFriends = 0;
		int shyness_Level;
		testcaseCount = Integer.parseInt(br.readLine());
		//System.out.println (testcaseCount);
		//Read File Line By Line
		int testcaseId = 1;
		//int total = 0;
		while ((strLine = br.readLine()) != null)   {
			requiredFriends = 0;
		  // Print the content on the console
		  shyness_Level =Integer.parseInt(strLine.split(" ")[0]);
		  //System.out.println (shyness_Level);
		  int index = 0;
		  int total = 0;
		  for (char shyness_String: strLine.split(" ")[1].toCharArray()) {
			  int shyness_count = Character.getNumericValue(shyness_String);
			  //System.out.println (shyness_count);
			  if (shyness_Level==index){
				//  break;
			  }
			  if (shyness_Level == 0){
				  requiredFriends = 0;
				  break;
			  }
			 
			  if (index > total){
				  requiredFriends = requiredFriends + 1;
				  total =total+1;
				  
			  }
			  total = shyness_count + total ;
			  
			  
			  index++;
		  }
		//System.out.println("Case #"+testcaseId+": "+requiredFriends);
		  
			bw.write("Case #"+testcaseId+": "+requiredFriends+"\n");
			
		  
		testcaseId++;
		}

		//Close the input stream
		br.close();
		bw.close();
	}
}
