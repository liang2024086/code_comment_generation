package methodEmbedding.Speaking_in_Tongues.S.LYD193;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Driver {

	static String map = "ynficwlbkuomxsevzpdrjgthaq";
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		FileReader fr = new FileReader("A-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		
		int num = Integer.parseInt(br.readLine());
		String in[] = new String[num];
		for(int i = 0; i < num; i++){
			in[i] = br.readLine();
		}
		fr.close();
		
		String out[] = new String[num];
		for(int i = 0; i < num; i++){
			String s = in[i];
			out[i] = "Case #" + (i+1) + ": ";
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j) == ' '){
					out[i] += ' ';
				}
				else{
					int k = map.indexOf(s.charAt(j));
					out[i] += (char)(k+'a');
				}
			}
		}
		
		for(int i = 0; i < num; i++){
			System.out.println(out[i]);
		}
		
	}
}
