package methodEmbedding.Speaking_in_Tongues.S.LYD1090;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpeankingInTongues {

	private static final char[] alpha = {
		'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'
	};
	
	public static void main(String[]args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("input")));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out")));
		int T = Integer.parseInt(reader.readLine());
		
		for(int i =0 ; i<T;i++){
			String line   = reader.readLine();
			String result = "";
			for(int j = 0;j<line.length();j++){
				if(line.charAt(j)!=' '){
					result += alpha[line.charAt(j)-'a'];
				}
				else
					result+=' ';
			}
			writer.write("Case " + "#"+(i+1)+": "+result+"\n");
			writer.flush();
		}
		
	}
	
}
