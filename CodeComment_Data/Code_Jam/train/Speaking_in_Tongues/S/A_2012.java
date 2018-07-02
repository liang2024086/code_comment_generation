package methodEmbedding.Speaking_in_Tongues.S.LYD1155;


import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class A_2012 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
		
		HashMap<Character,Character> a = new HashMap<Character,Character>();
		
		a.put('y', 'a');
		a.put('n', 'b');
		a.put('f', 'c');
		a.put('i', 'd');
		a.put('c', 'e');
		a.put('w', 'f');
		a.put('l', 'g');
		a.put('b', 'h');
		a.put('k', 'i');
		a.put('u', 'j');
		a.put('o', 'k');
		a.put('m', 'l');
		a.put('x', 'm');
		a.put('s', 'n');
		a.put('e', 'o');
		a.put('v', 'p');
		a.put('z', 'q');
		a.put('p', 'r');
		a.put('d', 's');
		a.put('r', 't');
		a.put('j', 'u');
		a.put('g', 'v');
		a.put('t', 'w');
		a.put('h', 'x');
		a.put('a', 'y');
		a.put('q', 'z');
		
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i=0;i<cases;i++){
			String input = in.nextLine();
			String salida="";
			for(int j=0;j<input.length();j++)
				if(input.charAt(j)==' ') salida+=' ';
				else salida+=a.get(input.charAt(j));
		    out.println("Case #"+(i+1)+": "+salida);
		}
		out.close();
		System.exit(0);
		
		
		

	}

}
