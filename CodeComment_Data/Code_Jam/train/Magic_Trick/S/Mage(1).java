package methodEmbedding.Magic_Trick.S.LYD167;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mage {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader("C:/Users/Matt/Desktop/A-small-attempt1.in"));
		int count = Integer.parseInt(br.readLine());
		int[] first = new int[4];
		int[] second = new int[4];
		for(int i = 1; i <= count; i++){
			int rowNum = Integer.parseInt(br.readLine());
			String values = "";
			int missingRows = 4;
			for(int k = 1; k <= rowNum; k++){
				values = br.readLine();
				missingRows--;
			}
			if (missingRows != 0){
				for(int k = 0; k < missingRows; k++){
					br.readLine();
				}
			}
			String[] results = values.split(" ");
			for(int k = 0; k < results.length; k++){
				first[k] = Integer.parseInt(results[k]);
			}
			rowNum = Integer.parseInt(br.readLine());
			values = "";
			missingRows = 4;
			for(int k = 1; k <= rowNum; k++){
				values = br.readLine();
				missingRows--;
			}
			if (missingRows != 0){
				for(int k = 0; k < missingRows; k++){
					br.readLine();
				}
			}
			results = values.split(" ");
			for(int k = 0; k < results.length; k++){
				second[k] = Integer.parseInt(results[k]);
			}
			boolean match = false;
			int badMatch = 0;
			for(int k = 0; k < first.length; k++){
				for(int j = 0; j < second.length; j++){
					if(first[k] == second[j]){
						match = true;
						badMatch++;
						rowNum = k;
					}
				}
			}
			if(!match){
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else if (badMatch == 1) {
				System.out.println("Case #" + i + ": " + first[rowNum]);
			} else {
				System.out.println("Case #" + i +": Bad magician!");
			}
			
		}
		} catch(IOException ioe){
			
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
