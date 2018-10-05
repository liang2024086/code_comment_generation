package methodEmbedding.Standing_Ovation.S.LYD1872;

/**
	Google Code Jam
	Qualification Round 2015
	Problem A. Standing Ovation
	@Autor: Camilo Pinilla
*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.io.IOException; 

public class Problem_A{
	public static void main (String[] args){
	
		String inFile = "A-small-attempt1.in";
		String outFile = inFile.substring(0, inFile.lastIndexOf('.')).concat(".out");

		Charset charset = Charset.forName("UTF-8");
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile), charset);
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile), charset))
			{
			String line = null;
			
			line = reader.readLine();
			int cases = Integer.parseInt(line);
			
			int c, people, invited, standUp;
			c=people=invited=0;
			String audience = null;
			
			for (int i=0;i<cases;i++){
				line = reader.readLine();
				c = line.indexOf(' ');
				people = Integer.parseInt(line.substring(0, c));
				audience = line.substring((c+1), line.length());
				invited = 0;
				standUp = 0;
				
				for (int j=0;j<people+1;j++){
					int ob = Integer.parseInt(audience.substring(j,j+1));
					
					while((standUp+invited)<j && ob!=0){
						invited++;
					}
					standUp += ob;
				}
				
				writer.write("Case #" + (i+1) + ": " + invited);
				writer.newLine();
			}
			
			writer.close();
			
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} 
				
	}
	
}
