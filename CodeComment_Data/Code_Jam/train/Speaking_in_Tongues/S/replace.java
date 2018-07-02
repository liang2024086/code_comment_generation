package methodEmbedding.Speaking_in_Tongues.S.LYD563;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class replace {

	
	public static void main(String[] args) throws IOException {
		HashMap hh=new HashMap();
		hh.put('a', 'y');
		hh.put('b', 'h');
		hh.put('c', 'e');
		hh.put('d', 's');
		hh.put('e', 'o');
		hh.put('f', 'c');
		hh.put('g', 'v');
		hh.put('h', 'x');
		hh.put('i', 'd');
		hh.put('j', 'u');
		hh.put('k', 'i');
		hh.put('l', 'g');
		hh.put('m', 'l');
		hh.put('n', 'b');
		hh.put('o', 'k');
		hh.put('p', 'r');
		hh.put('q', 'z');
		hh.put('r', 't');
		hh.put('s', 'n');
		hh.put('t', 'w');
		hh.put('u', 'j');
		hh.put('v', 'p');
		hh.put('w', 'f');
		hh.put('x', 'm');
		hh.put('y', 'a');
		hh.put('z', 'q');
		hh.put(' ', ' ');
		
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt1.in"));
        // input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("replace.out")));
		
		int x=Integer.parseInt(f.readLine());
		for (int i = 0; i < x; i++) {
			out.print("Case #"+(i+1)+": ");
			String in=f.readLine();
			for (int j = 0; j < in.length(); j++) {
				out.print(hh.get(in.charAt(j)));
			}
			out.println();
		}
		out.close();
		f.close();
		
	}
}
