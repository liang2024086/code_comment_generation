package methodEmbedding.Speaking_in_Tongues.S.LYD1618;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

    
    private static Map<Character,Character> map = new HashMap<Character,Character>(); 
    static {
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
	map.put('n', 'b');
	map.put('m', 'l');
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
	
    }
  
    public static void main(String[] args) throws Exception {
	
	int T,ca;
	String s;
	
	Scanner input = new Scanner(new FileInputStream("A-small-attempt0.in"));
	PrintWriter output = new PrintWriter(new FileOutputStream("A-small-attempt0.out"));
	
	s = input.nextLine();
	T = Integer.parseInt(s);
	
	
	 
	for(ca=1;ca<=T;ca++) {
	    s = input.nextLine();
	    
	    StringBuffer sb = new StringBuffer();
	    for(int i=0;i<s.length();i++) {
		sb.append(map.get(s.charAt(i)));
	    }
	    
	    s = sb.toString();	
	    
	    output.println(String.format("Case #%d: %s",ca,s));
	}	
	
	input.close();
	output.close();

    }

}
