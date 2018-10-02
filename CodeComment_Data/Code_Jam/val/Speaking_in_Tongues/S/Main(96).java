package methodEmbedding.Speaking_in_Tongues.S.LYD1566;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
			
		int testcases = Integer.parseInt(br.readLine());
		
		HashMap<Character,Character> map = new HashMap<Character, Character>();
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
		
	for(int i=0;i<testcases;i++){
			String gl = br.readLine();
			char[] glca= gl.toCharArray();
			
			for(int j=0;j<glca.length;j++){
				if(glca[j]!=' '){
				glca[j]= map.get(glca[j]);
				}
			}
			System.out.println("Case #"+(i+1)+": "+String.copyValueOf(glca));
		}

		
	}

}
