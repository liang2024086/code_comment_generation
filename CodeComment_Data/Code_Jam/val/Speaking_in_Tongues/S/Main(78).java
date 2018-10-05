package methodEmbedding.Speaking_in_Tongues.S.LYD1441;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*Deniz Bi?er*/
public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		char[] array = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i',
				'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f',
				'm', 'a', 'q' };
		String input = args[0];
		String output = args[1];
		BufferedReader bReader = null;
		BufferedWriter bWriter = null;
		try {
			bReader = new BufferedReader(new FileReader(new File(input)));

			bWriter = new BufferedWriter(new FileWriter(new File(output)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = Integer.parseInt(bReader.readLine());
		for (int i = 0; i < count; i++) {
			String line = bReader.readLine();
			String result="Case #"+(i+1)+": ";
			for(char letter : line.toCharArray()){
				int index = letter-97;
				if(index<0)
					result+=" ";
				
				else
					result+= array[index];
			}
			bWriter.write(result+System.getProperty("line.separator"));
		}
		bReader.close();
		bWriter.close();
	}
}
