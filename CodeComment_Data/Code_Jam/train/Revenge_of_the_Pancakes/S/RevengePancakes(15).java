package methodEmbedding.Revenge_of_the_Pancakes.S.LYD550;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RevengePancakes {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			int t = 0;
			br = new BufferedReader(new FileReader("/Users/bhavesh.patel/Downloads/B-small-attempt0.in"));
			File file = new File("/Users/bhavesh.patel/Downloads/output-b-small.out");
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			if ((sCurrentLine = br.readLine()) != null) {
				t = Integer.parseInt(sCurrentLine.trim());
			}
			for (int i = 0; i < t; i++) {
				StringBuilder output = new StringBuilder("Case #" + (i + 1) + ": ");
				if ((sCurrentLine = br.readLine()) == null) {
					continue;
				}
				char sides[] = sCurrentLine.trim().toCharArray();
				int count = 0;
				int end = sides.length - 1;
				while(end>=0){
					if(sides[end]!='+'){
						break;
					}
					end--;
				}	
				if(end>=0){
					char current = sides[end];
					count++;
					for (int j = end; j >= 0; j--) {
						if(current != sides[j]){
							count++;
						}
						current = sides[j];
					}
				}
				output.append(count);
				if (i + 1 < t) {
					output.append("\n");
				}
				writer.write(output.toString());
				//System.out.print(output.toString());
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
