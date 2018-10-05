package methodEmbedding.Standing_Ovation.S.LYD531;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.StringTokenizer;


/**
 *
 */
public class Problem1 {
	private final static int BUFFER_SIZE = 4096;

	/**
	 * Auto generated method comment
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String filename = args[0];
		
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line=bufferedReader.readLine().trim();
			
			Integer numTests = Integer.parseInt(line);
			for(int i = 0; i < numTests; i++){
				line=bufferedReader.readLine().trim();
				StringTokenizer tokenizer = new StringTokenizer(line);
				String sMaxString = tokenizer.nextToken().trim();
				String sMaxValuesString = tokenizer.nextToken().trim();
				
				Integer sMax = Integer.parseInt(sMaxString);
				Integer numExtraInvite = 0;
				Integer standing = 0;
				
				for(int j = 0; j <= sMax; j++){
					String currSValString = sMaxValuesString.substring(j,j+1);
					
					Integer currSVal = Integer.parseInt(currSValString);
					while(standing<j){
						numExtraInvite++;
						standing++;
					}
					standing+=currSVal;
				}
				
				System.out.println("Case #"+(i+1)+": "+numExtraInvite);
				
			}
			
			bufferedReader.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
}
