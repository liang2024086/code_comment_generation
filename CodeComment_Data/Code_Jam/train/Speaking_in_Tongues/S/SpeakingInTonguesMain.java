package methodEmbedding.Speaking_in_Tongues.S.LYD393;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SpeakingInTonguesMain {

	public static void main(String[] args) {

		
		Map<Character, Character> map=new HashMap<Character,Character>();
		map.put('a','y');
		map.put('b','h');
		map.put('c','e');
		map.put('d','s');
		map.put('e','o');
		map.put('f','c');
		map.put('g','v');
		map.put('h','x');
		map.put('i','d');
		map.put('j','u');
		map.put('k','i');
		map.put('l','g');
		map.put('m','l');
		map.put('n','b');
		map.put('o','k');
		map.put('p','r');
		map.put('q','z');
		map.put('r','t');
		map.put('s','n');
		map.put('t','w');
		map.put('u','j');
		map.put('v','p');
		map.put('w','f');
		map.put('x','m');
		map.put('y','a');
		map.put('z','q');
		map.put(' ',' ');
		
		
		
		try {
			Scanner s=new Scanner(new BufferedReader(new FileReader("A-small-attempt0.in")));
			ArrayList<SpeakingInTongues> list=new ArrayList<SpeakingInTongues>();
			int i=0;
			int totalCases=Integer.parseInt(s.nextLine());
			while(s.hasNextLine()){
				list.add(new SpeakingInTongues(++i, map, s.nextLine()));
			}
			
			for (SpeakingInTongues speakingInTongues : list) {
				speakingInTongues.process();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
	}

}
