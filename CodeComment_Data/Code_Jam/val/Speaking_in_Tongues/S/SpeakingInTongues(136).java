package methodEmbedding.Speaking_in_Tongues.S.LYD1244;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class SpeakingInTongues {

	public static void main(String[] args) throws IOException{
		SpeakingInTongues speakingInTongues = new SpeakingInTongues();
	HashMap<Character, Character> hashMap = new HashMap<Character, Character>();	
	hashMap.put('a','y');
	hashMap.put('b','h');
	hashMap.put('c','e');
	hashMap.put('d','s');
	hashMap.put('e','o');
	hashMap.put('f','c');
	hashMap.put('g','v');
	hashMap.put('h','x');
	hashMap.put('i','d');
	hashMap.put('j','u');
	hashMap.put('k','i');
	hashMap.put('l','g');
	hashMap.put('m','l');
	hashMap.put('n','b');
	hashMap.put('o','k');
	hashMap.put('p','r');
	hashMap.put('q','z');
	hashMap.put('r','t');
	hashMap.put('s','n');
	hashMap.put('t','w');
	hashMap.put('u','j');
	hashMap.put('v','p');
	hashMap.put('w','f');
	hashMap.put('x','m');
	hashMap.put('y','a');
	hashMap.put('z','q');
	hashMap.put(' ', ' ');
	
	int testCaseNumber;
	
	String input;
	BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
	input = in.readLine();
	
	testCaseNumber = Integer.parseInt(input.trim());
	String[] newLineArray = new String[testCaseNumber];
	
	
	for(int i=0; i<testCaseNumber; i++){
		input = in.readLine();
		String newLine = "";
		for(int j=0; j<input.length(); j++){
			newLine += hashMap.get(input.charAt(j));
		}
		newLineArray[i] = newLine;
		System.out.println(newLine);
	}
	
	in.close();

	FileWriter fstream = new FileWriter("A-small-attempt0.out");
	BufferedWriter out = new BufferedWriter(fstream);
	
	for(int i=1; i<=testCaseNumber;i++){
		String outLine = "Case #"+i+": "+newLineArray[i-1]+"\n";
		out.write(outLine);
	}
	out.close();
	System.out.println("File created successfully.");
	
	}
	
}
