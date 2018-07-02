package methodEmbedding.Speaking_in_Tongues.S.LYD748;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};;
		int t = Integer.parseInt(in.readLine());
		int cnt = 0;
		while(t>0){
			t--; cnt++;
			String data = in.readLine();
			int len = data.length();
			out.write("Case #"+ cnt +": ");
			for(int i=0; i<len; i++){
				char c = data.charAt(i);
				if( c != ' '){
					out.write(map[c - 'a']);
				}else {
					out.write(' ');
				}
			}
			System.out.println();
			out.write("\n");
			
		}
		in.close();
		out.close();
	}

}
