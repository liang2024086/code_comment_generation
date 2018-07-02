package methodEmbedding.Speaking_in_Tongues.S.LYD1215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Translate {

	public static void main(String[] args) throws IOException{
		FileInputStream fstream = new FileInputStream("A-small-attempt1.in");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String inputCnt = br.readLine();
		FileOutputStream outFile = new FileOutputStream("output.txt");
		DataOutputStream out = new DataOutputStream(outFile);
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(out));
		
		int cnt = Integer.parseInt(inputCnt);
		for(int line=1;line<=cnt;line++){
			String inputString = br.readLine();
			String outputString = "Case #"+line+": ";
			for(int i=0;i<inputString.length();i++){
				char c = inputString.charAt(i);
				switch (c){
				case(' '): c = ' '; break;
				case('a'): c = 'y'; break;
				case('b'): c = 'h'; break;
				case('c'): c = 'e'; break;
				case('d'): c = 's'; break;
				case('e'): c = 'o'; break;
				case('f'): c = 'c'; break;
				case('g'): c = 'v'; break;
				case('h'): c = 'x'; break;
				case('i'): c = 'd'; break;
				case('j'): c = 'u'; break;
				case('k'): c = 'i'; break;
				case('l'): c = 'g'; break;
				case('m'): c = 'l'; break;
				case('n'): c = 'b'; break;
				case('o'): c = 'k'; break;
				case('p'): c = 'r'; break;
				case('q'): c = 'z'; break;
				case('r'): c = 't'; break;
				case('s'): c = 'n'; break;
				case('t'): c = 'w'; break;
				case('u'): c = 'j'; break;
				case('v'): c = 'p'; break;
				case('w'): c = 'f'; break;
				case('x'): c = 'm'; break;
				case('y'): c = 'a'; break;
				case('z'): c = 'q'; break;
				}
				outputString+=c;
			}
			wr.write(outputString);
			wr.newLine();
			wr.flush();
			
		}
		wr.close();
		out.close();
		br.close();
		in.close();
		fstream.close();
		outFile.close();
	}
}
