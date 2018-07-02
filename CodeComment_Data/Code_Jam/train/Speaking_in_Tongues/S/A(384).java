package methodEmbedding.Speaking_in_Tongues.S.LYD214;

import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter fw = new FileWriter("A-small.out");	
		int N = new Integer(in.readLine());
		char c;
		for (int cases = 1; cases <= N; cases++){
			String s = in.readLine(), out;
			out = "Case #" + cases + ": ";
			for (int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				switch(c) {				
					case 'a': out = out + "y"; break;
					case 'b': out = out + "h"; break;
					case 'c': out = out + "e"; break;
					case 'd': out = out + "s"; break;
					case 'e': out = out + "o"; break;
					case 'f': out = out + "c"; break;
					case 'g': out = out + "v"; break;
					case 'h': out = out + "x"; break;
					case 'i': out = out + "d"; break;
					case 'j': out = out + "u"; break;
					case 'k': out = out + "i"; break;
					case 'l': out = out + "g"; break;
					case 'm': out = out + "l"; break;
					case 'n': out = out + "b"; break;
					case 'o': out = out + "k"; break;
					case 'p': out = out + "r"; break;
					case 'q': out = out + "z"; break;
					case 'r': out = out + "t"; break;
					case 's': out = out + "n"; break;
					case 't': out = out + "w"; break;
					case 'u': out = out + "j"; break;
					case 'v': out = out + "p"; break;
					case 'w': out = out + "f"; break;
					case 'x': out = out + "m"; break;
					case 'y': out = out + "a"; break;
					case 'z': out = out + "q"; break;
					case ' ': out = out + " "; break;				
				}				
			}
			fw.write(out + "\n");
		}
		fw.flush();
		fw.close();		
    }
}
