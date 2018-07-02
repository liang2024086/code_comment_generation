package methodEmbedding.Speaking_in_Tongues.S.LYD1163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class SpeakingInTongues {

	private static HashMap<Character,Character> convertMap = new HashMap<Character,Character>(){
		{
			put('y','a');
			put('n','b');
			put('f','c');
			put('i','d');
			put('c','e');
			put('w','f');
			put('l','g');
			put('b','h');
			put('k','i');
			put('u','j');
			put('o','k');
			put('m','l');
			put('x','m');
			put('s','n');
			put('e','o');
			put('v','p');
			put('z','q');
			put('p','r');
			put('d','s');
			put('r','t');
			put('j','u');
			put('g','v');
			put('t','w');
			put('h','x');
			put('a','y');
			put('q','z');
		}
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int totalLineNumber = Integer.parseInt(br.readLine().trim());
			for(int i = 0;i < totalLineNumber;i++){
				input.add(br.readLine());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0;i < input.size();i++){
			char[] chars = input.get(i).toCharArray();
			String result = null;
			for(int j = 0;j < chars.length;j++){
				char c = chars[j];
				if(convertMap.containsKey(c)){
					chars[j] = convertMap.get(c);
				}
				result = new String(chars);
			}
			int flag = i + 1;
			System.out.print("Case #" + flag + ":");
			System.out.println(result);
		}
	}

}
