package methodEmbedding.Speaking_in_Tongues.S.LYD795;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mapping {
	public static void main(String[] args) {
		String line = null;
		int mapping[] = new int[26];
		
		
		mapping[0] = 'y';
		mapping[1]= 'h';
		mapping[2] = 'e';
		mapping[3] = 's';
		mapping[4] ='o';
		mapping[5] = 'c';
		mapping[6] = 'v';
		mapping[7]= 'x';
		mapping[8] = 'd';
		mapping[9] = 'u';
		mapping[10] ='i';
		mapping[11] = 'g';
		mapping[12] = 'l';
		mapping[13]= 'b';
		mapping[14] = 'k';
		mapping[15] = 'r';
		mapping[16] ='z';
		mapping[17] = 't';
		mapping[18] = 'n';
		mapping[19]= 'w';
		mapping[20] = 'j';
		mapping[21] = 'p';
		mapping[22] ='f';
		mapping[23] = 'm';
		mapping[24] ='a';
		mapping[25] = 'q';
		BufferedReader reader = null;
		File file = new File("c:\\write.txt");
		BufferedWriter  output = null;
		try {
			output = new BufferedWriter(new FileWriter(file));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			reader = new BufferedReader(new FileReader("c:\\temp1.txt"));
			line = reader.readLine();
			int n = Integer.parseInt(line);
			for (int i=0;i<n;i++){
				line = reader.readLine();
				output.write("Case #"+(i+1)+" ");
				for (int j=0;j<line.length();j++){
					char c = line.charAt(j);
					if (Character.isSpace(c)){
						output.write(c);
						continue;
					}
					output.write((char)mapping[c-97]);
				}
				if (i!=n-1)
				output.write("\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				output.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
