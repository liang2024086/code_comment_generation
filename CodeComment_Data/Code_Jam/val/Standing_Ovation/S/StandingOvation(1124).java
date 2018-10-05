package methodEmbedding.Standing_Ovation.S.LYD115;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

public class StandingOvation {

	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<String>();
		lines = (ArrayList<String>) FileUtils.readLines(new File("input.txt"));
		
		for (int i = 1; i <= Integer.parseInt(lines.get(0)); i++) {
			 int size = Character.getNumericValue(lines.get(i).charAt(0));
			 char[] arr = lines.get(i).substring(2).toCharArray();
			 int sum = 0;
			 int output = 0;
			 
			 for (int n = 0; n <= size; n++) {
				 int s = Character.getNumericValue(arr[n]);
				 
				 if(n>sum) {
				 	output = output + 1;
				 	sum = sum + 1;
				 }
				 sum = sum + s;
			 }
			 String data = "Case #" + i + ": " + output + "\n";
			 FileUtils.write(new File("output.txt"), data, true);
			 
			 System.out.println(output);
		}
	}
}
