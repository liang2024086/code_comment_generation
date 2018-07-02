package methodEmbedding.Speaking_in_Tongues.S.LYD1686;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author Manu Ram Pandit
 * 
 */
public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fStream = new FileInputStream(
				"FileUrl");
		DataInputStream in = new DataInputStream(fStream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
	
		char mappedArray[]= {'y','h','e','s','o','c','v','x','d','u','i','g','l','b',
				'k','r','z','t','n','w','j','p','f','m','a','q'
				
		};
		
		// Read File Line By Line
		Writer out = new OutputStreamWriter(new FileOutputStream("output.txt"));
		strLine = br.readLine();
		int count=0;
		while ((strLine = br.readLine()) != null) {
			// Print the content on the console
			char[] charBuffer= strLine.toCharArray();
			++count;
			out.write("Case #"+ count+ ": ");
			
			for (int i = 0;i<charBuffer.length;i++) {
				if(charBuffer[i]==' '){
					
					out.write(' ');
				}
				else{
					
					out.write(mappedArray[charBuffer[i]-97]);
				}
				
			}
			
			out.write("\n");

			//System.out.println(strLine);
		}
		// Close the input stream
		in.close();
		out.close();

	}

}
