package methodEmbedding.Speaking_in_Tongues.S.LYD963;


import java.util.HashMap;
import java.util.Scanner;

public class CodeJamA {
	public static void main(String args[]){
		HashMap<String, String> mapping = new HashMap<String, String>();
				mapping.put("a" , "y");
				
				mapping.put("b" , "h");
				mapping.put("c" , "e");
				mapping.put("d" , "s");
				mapping.put("e" , "o");
				mapping.put("f" , "c");
				mapping.put("g" , "v");
				mapping.put("h" , "x");
				mapping.put("i" , "d");
				mapping.put("j" , "u");
				mapping.put("k" , "i");
				mapping.put("l" , "g");
				mapping.put("m" , "l");
				mapping.put("n" , "b");
				mapping.put("o" , "k");
				mapping.put("p" , "r");
				mapping.put("q" , "z");
				mapping.put("r" , "t");
				mapping.put("s" , "n");
				mapping.put("t" , "w");
				mapping.put("u" , "j");
				mapping.put("v" , "p");
				mapping.put("w" , "f");
				mapping.put("x" , "m");
				mapping.put("y" , "a");
				mapping.put("z" , "q");
					
	
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String nStr = "";
		int t = Integer.parseInt(str);
	
		for(int i = 0; i < t; i++){
			str = scn.nextLine();
			nStr = "";
			for(int j=0;j<str.length();j++){
				if(str.charAt(j) >= 'a' && str.charAt(j) <='z')
					nStr += mapping.get(""+str.charAt(j)); //str.replaceAll(mapping[j][0], mapping[j][1]);
				else
					nStr += str.charAt(j);
			}
			
			System.out.println("Case #" + ( i + 1 ) + ": " + nStr);
			
		}
	}
}
