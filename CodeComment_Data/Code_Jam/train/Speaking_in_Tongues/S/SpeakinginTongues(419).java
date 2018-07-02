package methodEmbedding.Speaking_in_Tongues.S.LYD941;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpeakinginTongues {
	public static void main(String[] args) {
	String patteern ="yhesocvxduiglbkrqtnwjpfmaz";
		
		FileReader fin;
		try {
			fin = new FileReader(
					new File("C:\\Users\\Subir Kumar Sao\\Desktop\\Sample\\A-small-attempt0.in"));
		
			FileWriter fr = new FileWriter(new File("C:\\Users\\Subir Kumar Sao\\Desktop\\Sample\\A-Small-out.txt"));
			BufferedReader br = new BufferedReader(fin);
			String line = br.readLine();
			int N = Integer.parseInt(line);
			for(int i=0;i<N;i++){
				String lineInput = br.readLine();
				String lineOut = "";
				for(int j=0;j<lineInput.length();j++){
					if(lineInput.charAt(j)!=' '){
						int index = lineInput.charAt(j)-'a';
						lineOut+=patteern.charAt(index);
					}
					else{
						lineOut+=' ';
					}
				}
				fr.write("Case #"+(i+1)+": "+lineOut+"\r\n");
				System.out.println("Case #"+(i+1)+": "+lineOut);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
