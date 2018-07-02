package methodEmbedding.Speaking_in_Tongues.S.LYD938;

import java.io.*;
import java.util.*;

class First {
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/gaurav.mishra/Desktop/codeJam/First.txt"));
	String s = br.readLine();
	int i = 1;
	while(!(s=br.readLine()).equals("8")) {
	    bw.write("Case #"+i+": ");
	    for(int j=0; j<s.length(); j++) {
		char c = s.charAt(j);
		switch (c) {    
		case 'y':
		    bw.write("a");
		    continue;
		case 'n':
		    bw.write("b");
		    continue;
		case 'f':
		    bw.write("c");
		    continue;
		case 'i':
		    bw.write("d");
		    continue;
		case 'c':
		    bw.write("e");
		    continue;
		case 'w':
		    bw.write("f");
		    continue;
		case 'l':
		    bw.write("g");
		    continue;
		case 'b':
		    bw.write("h");
		    continue;
		case 'k':
		    bw.write("i");
		    continue;
		case 'u':
		    bw.write("j");
		    continue;
		case 'o':
		    bw.write("k");
		    continue;
		case 'm':
		    bw.write("l");
		    continue;
		case 'x':
		    bw.write("m");
		    continue;
		case 's':
		    bw.write("n");
		    continue;
		case 'e':
		    bw.write("o");
		    continue;
		case 'v':
		    bw.write("p");
		    continue;
		case 'z':
		    bw.write("q");
		    continue;
		case 'p':
		    bw.write("r");
		    continue;
		case 'd':
		    bw.write("s");
		    continue;
		case 'r':
		    bw.write("t");
		    continue;
		case 'j':
		    bw.write("u");
		    continue;
		case 'g':
		    bw.write("v");
		    continue;
		case 't':
		    bw.write("w");
		    continue;
		case 'h':
		    bw.write("x");
		    continue;
		case 'a':
		    bw.write("y");
		    continue;
		case 'q':
		    bw.write("z");
		    continue;
		case ' ':
		    bw.write(" ");
		    continue;
		}
	    }
	    bw.write("\n");
	    i++;
	}
	bw.close();
    }
}
