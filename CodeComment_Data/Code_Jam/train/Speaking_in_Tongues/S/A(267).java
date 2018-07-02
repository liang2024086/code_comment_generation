package methodEmbedding.Speaking_in_Tongues.S.LYD168;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;


public class A {
	
	private static HashMap<Character,Character> charMap = new HashMap<Character, Character>();
	
	static{
		charMap.put('a', 'y');charMap.put('b', 'h');charMap.put('c', 'e');charMap.put('d', 's');charMap.put('e', 'o');
		charMap.put('f', 'c');charMap.put('g', 'v');charMap.put('h', 'x');charMap.put('i', 'd');charMap.put('j', 'u');
		charMap.put('k', 'i');charMap.put('l', 'g');charMap.put('m', 'l');charMap.put('n', 'b');charMap.put('o', 'k');
		charMap.put('p', 'r');charMap.put('q', 'z');charMap.put('r', 't');charMap.put('s', 'n');charMap.put('t', 'w');
		charMap.put('u', 'j');charMap.put('v', 'p');charMap.put('w', 'f');charMap.put('x', 'm');charMap.put('y', 'a');
		charMap.put('z', 'q');
	}
	
	
	
	public static void main(String args[]){
		
		try{
		
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String strTmp = br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter( new File("output.txt"),false));
			
			
			int inputSize = Integer.parseInt(strTmp);
			
			for(int i=0;i<inputSize;i++  ){

				
				String str = br.readLine();
                char[] output = new char[str.length()];
				
				// processing inputline
				int j=0;
				for(Character c:str.toCharArray()){
					if(charMap.containsKey(c)){
						output[j++] = charMap.get(c);
					}else{
						output[j++] = c;
					}
				}
				
				// produce output
                //System.out.println("Case #"+(i+1)+": " + new String(output) );			
				bw.write("Case #"+(i+1)+": " + new String(output) );
				bw.newLine();
			}
			
			bw.close();
			br.close();
		
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
