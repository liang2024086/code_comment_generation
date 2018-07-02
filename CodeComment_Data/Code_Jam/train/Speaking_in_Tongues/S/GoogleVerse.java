package methodEmbedding.Speaking_in_Tongues.S.LYD1242;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Scanner;


public class GoogleVerse {

	static Hashtable<Character,Character> map = new Hashtable<Character,Character>();
	static{
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
	}
	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
//		Scanner scan = new Scanner(new File("A-small-attempt1.in"));
		PrintWriter print = new PrintWriter(new FileWriter("out"));
		Integer cases = Integer.parseInt(scan.nextLine());
		for(int i=0; i<cases; i++){
			String line = scan.nextLine();
			String translate = "Case #" + (i+1) + ": ";
			for(char c: line.toCharArray()){
				if(c==' '){
					translate+= " ";
				}else{
					translate+=map.get(c);
				}
			}
			System.out.println(translate);
			print.write(translate);
		}
		print.flush();
		print.close();
	}
}
