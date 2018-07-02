package methodEmbedding.Magic_Trick.S.LYD192;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CodeJamMagicTrick {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("D:/A-small-attempt0.in");
		try {
			FileReader fr = new FileReader(file);
			File writeFile = new File("D:/OutputAlgo.txt");
			FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			Integer noOfCases=Integer.parseInt( br.readLine().trim());
			for (int i = 0; i <noOfCases; i++) {
				String[][] matrix1 = new String[4][4];
				String[][] matrix2 = new String[4][4];
				Integer choiceFirst = Integer.parseInt( br.readLine().trim());
				for (int j = 0; j < 4; j++) {
					String[] array = br.readLine().trim().split(" ");
					matrix1[j] = array;
				}
				Integer choiceSecond = Integer.parseInt( br.readLine().trim());
				for (int j = 0; j < 4; j++) {
					String[] array = br.readLine().trim().split(" ");
					matrix2[j] = array;
				}
				List<String> rows1 = Arrays.asList(matrix1[choiceFirst - 1]);
				List<String> rows2 = Arrays.asList(matrix2[choiceSecond - 1]);
				String numberFound = null;
				Integer count = 0;
				for (String number : rows1) {
					if(rows2.contains(number)){
						count++;
						numberFound = number;
					}
				}
				String outputLine = null;
				if(count == 0){
					outputLine="Case #"+(i+1)+": Volunteer cheated!";
				}else if(count == 1){
					outputLine="Case #"+(i+1)+": "+numberFound;
				}
				else{
					outputLine="Case #"+(i+1)+": Bad magician!";
				}
				fw.write(outputLine+"\n");
				fw.write(System.getProperty("line.separator"));
				
			}
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
