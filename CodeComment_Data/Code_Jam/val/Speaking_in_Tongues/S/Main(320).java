package methodEmbedding.Speaking_in_Tongues.S.LYD200;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public Main() throws Exception{
		FileReader fr = new FileReader(new File("input.txt"));
		BufferedReader in = new BufferedReader(fr);
		
		File outFile = new File("output.txt");
		outFile.createNewFile();
		FileWriter fw = new FileWriter(outFile);
		BufferedWriter out = new BufferedWriter(fw);
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('z', 'q');
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z');
		map.put(' ', ' ');
		
		int numLines = Integer.parseInt(in.readLine());
		for(int x = 0; x<numLines; x++){
			String line = in.readLine();
			String outLine = "Case #" + (x+1) + ": ";
			for(char c: line.toCharArray()){
				outLine += map.get(c);
			}
			outLine += "\n";
			out.write(outLine);
		}
		
		in.close();
		out.close();
	}
	
	
	
	
	public static void main(String[] args) throws Exception{
		new Main();
	}
}
