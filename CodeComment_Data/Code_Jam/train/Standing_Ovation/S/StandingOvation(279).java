package methodEmbedding.Standing_Ovation.S.LYD1622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class StandingOvation {
	public static void main(String args[])
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		int testCase = 0;
		int result;
		String line;
		int ppl;
		try {
 
			br = new BufferedReader(new FileReader("input.txt"));
			bw = new BufferedWriter(new FileWriter(new File("output.txt")));
			testCase = Integer.parseInt(br.readLine());
			for(int i=0; i<testCase; i++)
			{
				
				line = br.readLine();
				result = 0;
				ppl = Character.getNumericValue(line.charAt(2)); 
				for(int j=3; j<line.length(); j++)
				{
					if(ppl>Character.getNumericValue(line.charAt(0)))
						break;
					if(Character.getNumericValue(line.charAt(j)) != 0 && j-ppl-2 >0 )
					{
						result += j-ppl-2;
						ppl += j-ppl-2;
					}
					ppl += Character.getNumericValue(line.charAt(j));
				}
				bw.write("Case #"+(i+1)+": "+result);
				bw.newLine();
			}
			
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
				if (bw != null)bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
