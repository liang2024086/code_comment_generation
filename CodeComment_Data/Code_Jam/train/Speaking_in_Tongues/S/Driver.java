package methodEmbedding.Speaking_in_Tongues.S.LYD644;

import java.io.*;

public class Driver {

	public static void main(String[] args) {
		Dictionary testBed = new Dictionary();
		try{
			FileInputStream filestream = new FileInputStream("test.txt");
			DataInputStream input = new DataInputStream(filestream);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
			String currentLine;
			int counter = 1;
			while ((currentLine = buffer.readLine()) != null)   {
				System.out.println("Test #" + counter + ": " + testBed.convertAndPrint(currentLine));
				counter++;
			}
			input.close();
		}
		catch (Exception e){ System.err.println("Error: " + e.getMessage()); }
	}
}
