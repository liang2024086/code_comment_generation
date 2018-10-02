package methodEmbedding.Speaking_in_Tongues.S.LYD1550;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("F:\\download\\A-small-attempt0.in");
		BufferedReader br = new BufferedReader(in);
		FileWriter out = new FileWriter("F:\\download\\out.txt");
		BufferedWriter bw = new BufferedWriter(out);

		char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};

		int t = Integer.parseInt(br.readLine());
		for (int c = 0; c < t; c++){
			String line;
			line = br.readLine();
			String line_out = "";
			for (int i = 0; i < line.length(); i++){
				if (line.charAt(i) == ' '){
					line_out += ' ';
				}
				else{
					line_out += map[line.charAt(i) - 97];
				}
			}
			bw.write("Case #" + String.valueOf(c+1) + ": " + line_out + "\n");
		}
		
		br.close();
		in.close();
		bw.close();
		out.close();

	}

}
