package methodEmbedding.Speaking_in_Tongues.S.LYD359;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class SpeakingInTongues {

	public static void main(String[] args) throws IOException{
		
		String path = "C:\\Users\\Rapol Tongchenchitt\\Documents\\CodeJam\\";
		String year = "Qual2012\\";
		
		String test = "input.txt"; String outPath = "output.txt";
		String a = "A-small-attempt1.in"; String A = "A-small-attempt1.out";
		String b = ""; String B = "";
		String c = ""; String C = "";
		String d = ""; String D = "";
		
		String inName = path+year+a;
		String outName = path+year+A;
		
		Scanner in = new Scanner(new FileInputStream(inName));
		BufferedWriter out = new BufferedWriter(new FileWriter(outName));
		
		int caseCount = in.nextInt(); int currentCase = 0;
		in.nextLine();
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		map.put('q', 'z');
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		map.put('z', 'q');
		map.put(' ', ' ');
		
		while(currentCase++ < caseCount){
			
			String now = in.nextLine();
			StringBuilder ans = new StringBuilder("");
			
			for(int i = 0; i < now.length(); i++){
				ans.append(map.get(now.charAt(i)));
			}
			
			out.write("Case #" + currentCase + ": " + ans.toString());
			out.newLine();
		}
		
		out.close();
		
	}
	
}
