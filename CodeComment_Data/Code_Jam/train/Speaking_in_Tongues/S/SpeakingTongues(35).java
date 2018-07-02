package methodEmbedding.Speaking_in_Tongues.S.LYD1338;

import java.io.*;
public class SpeakingTongues {	
	public static void main(String[] args) {
		String out = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:/Users/Ross/Downloads/A-small-attempt2.in"));
			int n = Integer.parseInt(in.readLine());
			for(int i = 0; i < n; i++) {
				String line = in.readLine();
				for(int j = 0; j < line.length(); j++) {
					char ch = line.charAt(j);
					String before = line.substring(0,j);
					String after = line.substring(j+1,line.length());
					switch(ch) {
					case 'a':
						line = before + "y" + after;
						break;
					case 'b':
						line = before + "h" + after;
						break;
					case 'c':
						line = before + "e" + after;
						break;
					case 'd':
						line = before + "s" + after;
						break;
					case 'e':
						line = before + "o" + after;
						break;
					case 'f':
						line = before + "c" + after;
						break;
					case 'g':
						line = before + "v" + after;
						break;
					case 'h':
						line = before + "x" + after;
						break;
					case 'i':
						line = before + "d" + after;
						break;
					case 'j':
						line = before + "u" + after;
						break;
					case 'k':
						line = before + "i" + after;
						break;
					case 'l':
						line = before + "g" + after;
						break;
					case 'm':
						line = before + "l" + after;
						break;
					case 'n':
						line = before + "b" + after;
						break;
					case 'o':
						line = before + "k" + after;
						break;
					case 'p':
						line = before + "r" + after;
						break;
					case 'q':
						line = before + "z" + after;
						break;
					case 'r':
						line = before + "t" + after;
						break;
					case 's':
						line = before + "n" + after;
						break;
					case 't':
						line = before + "w" + after;
						break;
					case 'u':
						line = before + "j" + after;
						break;
					case 'v':
						line = before + "p" + after;
						break;
					case 'w':
						line = before + "f" + after;
						break;
					case 'x':
						line = before + "m" + after;
						break;
					case 'y':
						line = before + "a" + after;
						break;
					case 'z':
						line = before + "q" + after;
						break;					
					}
				}
				out += "Case #" + (i+1);
				out += ": "+line+"\n";
			}
			System.out.println(out);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
