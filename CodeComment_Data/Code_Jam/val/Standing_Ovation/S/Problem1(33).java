package methodEmbedding.Standing_Ovation.S.LYD602;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Problem1 {
	public static void main(String[] args) throws IOException {
		
		//
		
		FileInputStream fstream = new FileInputStream("problemA.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		//Read File Line By Line
		int lineCounter = 0;
		int[] output = null;
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  if (lineCounter == 0){
			  //number of test cases
			  lineCounter++;
			  output = new int[Integer.parseInt(strLine)];
		  }
		  else {
			  int sum = 0;
			  int needed = 0;
			  for (int i = 2; i < strLine.length(); i++){
				  if (strLine.charAt(i) != '0'){
					  int level = i-2;
					  if (level > sum){
						  needed += level - sum;
						  sum += needed;
					  }
					  sum += Integer.parseInt(strLine.charAt(i)+"");
				  }
			  }
			  output[lineCounter-1] = needed;
			  
			  lineCounter++;
		  }
		}
		//Close the input stream
		br.close();
		
		File fout = new File("out.txt");
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		for (int i = 0 ; i < output.length ; i++){
			bw.write("Case #"+(i+1)+": "+output[i]);
			bw.newLine();
		}
		bw.close();
		
	}
}
