package methodEmbedding.Magic_Trick.S.LYD205;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("magic.txt"));
			String line = null;
			boolean firstLoop = true;
			int counter = 0;
			String[] firstSelectedRow = null;
			String[] secondSelectedRow = null;
			int rowNumber = 0;
			String result = "";
			Boolean secondGrid = false;
			int outputCounter = 1;
			while ((line = reader.readLine()) != null) {
				if(firstLoop){
					firstLoop = false;
				}
				else{
					if(counter == 0){
						rowNumber = Integer.parseInt(line);
						counter++;
					}
					else{
						if(counter == rowNumber && !secondGrid){
							firstSelectedRow = line.split("\\s+");
						}
						else if(counter == rowNumber && secondGrid){
							secondSelectedRow = line.split("\\s+");
							int match = 0;
							int found = 0;
							for (int i = 0; i < firstSelectedRow.length ; i++) {
								for (int j = 0; j < secondSelectedRow.length ; j++) {
									if(firstSelectedRow[i].equals(secondSelectedRow[j])){
										match++;
										found = Integer.parseInt(firstSelectedRow[i]);
									}
									
								}
							}
							result +="Case #"+outputCounter+": ";
							if(match == 1){
								result +=found+"\n";
							}
							else if(match == 0){
								result +="Volunteer cheated!\n";
								}
							else if(match > 1){
								result +="Bad magician!\n";
								}
							firstSelectedRow = null;
							secondSelectedRow = null;
							match = 0;
							rowNumber = 0;
							outputCounter++;
						}
						if(counter == 4){
							counter = 0;
							secondGrid = !secondGrid;
						}
						else{
							counter++;
						}
					}
				}
			}
			result = result.substring(0, result.length()-1);
			System.out.print(result);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
	}

}
