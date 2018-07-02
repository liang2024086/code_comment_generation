package methodEmbedding.Speaking_in_Tongues.S.LYD327;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Translator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Mapper m = new Mapper();
		
		File f = new File("in/A-small-attempt0.in");
		File fo = new File("out/A-small.out");
		
		FileWriter w = new FileWriter(fo);
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int lines = Integer.valueOf(br.readLine());
		
		for (int i=0;i<lines;i++){
			String line = br.readLine();
			w.write("Case #"+(i + 1) +": ");
			for(int j=0;j<line.length();j++){
				w.append(m.getCharmap().get(line.charAt(j)));
			}
			w.write(String.format("%n",new Object()));
			
		}
		
		w.flush();
		w.close();
		
		br.close();
	}

}
