package methodEmbedding.Speaking_in_Tongues.S.LYD749;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Tongues {

	public static void main(String[] args) {
		
		//File read & write variables
		File inputFile = new File("C:/Users/SNALLAMA/Desktop/A-small-attempt1.in");
		File outputFile = new File("C:/Users/SNALLAMA/Desktop/A-small-attempt1.out");
		String line = null;
		StringBuilder finalOutput = new StringBuilder(""); // To store final output
		int t, length;
		
		//Map to store all alphabets and replacing alphabets
		HashMap<String, String> alphaMap = new HashMap<String, String>();
		alphaMap.put("a", "y");
		alphaMap.put("b", "h");
		alphaMap.put("c", "e");
		alphaMap.put("d", "s");
		alphaMap.put("e", "o");
		alphaMap.put("f", "c");
		alphaMap.put("g", "v");
		alphaMap.put("h", "x");
		alphaMap.put("i", "d");
		alphaMap.put("j", "u");
		alphaMap.put("k", "i");
		alphaMap.put("l", "g");
		alphaMap.put("m", "l");
		alphaMap.put("n", "b");
		alphaMap.put("o", "k");
		alphaMap.put("p", "r");
		alphaMap.put("q", "z");
		alphaMap.put("r", "t");
		alphaMap.put("s", "n");
		alphaMap.put("t", "w");
		alphaMap.put("u", "j");
		alphaMap.put("v", "p");
		alphaMap.put("w", "f");
		alphaMap.put("x", "m");
		alphaMap.put("y", "a");
		alphaMap.put("z", "q");
		
		String convertedValue;
		
		try {
			BufferedReader bReader =  new BufferedReader(new FileReader(inputFile));
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(outputFile));
			try {
				t = Integer.parseInt(bReader.readLine().trim());
				//System.out.println("No. Of Cases"+t);
				for(int index=0;index<t;index++) {
					line = bReader.readLine().trim();
					length = line.length();
					finalOutput = new StringBuilder("");
					for(int i=0;i<length;i++){
						convertedValue=alphaMap.get(new Character(line.charAt(i)).toString());
						finalOutput.append((convertedValue == null ) ? " ":convertedValue);
					}
					bWriter.write("Case #"+(index+1)+": "+finalOutput.toString());
					bWriter.write("\n");					
				}
			} catch(Exception e) {
				System.out.println("Exception Message: "+ e.getMessage());
				e.printStackTrace();
			}finally{
				bReader.close();
				bWriter.close();
			}
			
		} catch(Exception e) {
			System.out.println("Exception Message: "+ e.getMessage());
			e.printStackTrace();
		} 				

	}

}
