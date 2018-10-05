package methodEmbedding.Revenge_of_the_Pancakes.S.LYD61;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {
	
	public static void main(String[] args) throws IOException{
		//Format into String array
		InputStream in = new java.io.FileInputStream(args[0]);
		String[] input = null;
		int index = -1;
		String word = "";
		for (int i = in.read(); i > -1;i=in.read()){
			char c = Character.toChars(i)[0];
			if (c=='\n'){
				if (index < 0){
					input = new String[Integer.parseInt(word)];
				} else {
					input[index] = word;
				}
				index++;
				word = "";
			} else {
				word += c;
			}
		}
		in.close();
		PrintStream out = new java.io.PrintStream(new java.io.FileOutputStream(args[1]));
		out.println(HappyPancakes.run(input));
		out.close();
	}

}
