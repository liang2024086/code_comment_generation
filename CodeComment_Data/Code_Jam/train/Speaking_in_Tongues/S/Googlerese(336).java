package methodEmbedding.Speaking_in_Tongues.S.LYD125;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Googlerese {

	private static int[] codes= {-24,-6,-2,-15,-10,3,-15,-16,5,-11,2,5,1,12,4,-2,-9,-2,5,-3,11,6,17,11,24,9};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			File input=new File(args[0]);
			File output=new File("result.out");
			bufferedReader = new BufferedReader(new FileReader(input));
			bufferedWriter = new BufferedWriter(new FileWriter(output));
			int testCases = Integer.parseInt(bufferedReader.readLine());
			System.out.println(testCases);
			int value;
			int currentTestCase = 1;
			boolean newLine=true;
			while((value = bufferedReader.read()) != -1)
			{
				switch(value)
				{
					case '\n':
					case '\r':
						newLine=true;
					case ' ':
						bufferedWriter.write((char)value);
						continue;
				}
				if(newLine)
				{
					bufferedWriter.write("Case #" + (currentTestCase++)+": ");
					newLine=false;
				}
				bufferedWriter.write((char)(value-codes[value-97]));
			}
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
