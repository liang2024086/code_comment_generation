package methodEmbedding.Speaking_in_Tongues.S.LYD669;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class speakinint {

	/**
	 * @param args
	 */
	static int totalTestCase;
	public static void main(String[] args) {
		try {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("y", "a");
			map.put("n", "b");
			map.put("f", "c");
			map.put("i", "d");
			map.put("c", "e");
			map.put("w", "f");
			map.put("l", "g");
			map.put("b", "h");
			map.put("k", "i");
			map.put("u", "j");
			map.put("o", "k");
			map.put("m", "l");
			map.put("x", "m");
			map.put("s", "n");
			map.put("e", "o");
			map.put("v", "p");
			map.put("z", "q");
			map.put("p", "r");
			map.put("d", "s");
			map.put("r", "t");
			map.put("j", "u");
			map.put("g", "v");
			map.put("t", "w");
			map.put("h", "x");
			map.put("a", "y");
			map.put("q", "z");
			Scanner scanner = new Scanner(new FileInputStream("input.txt"));
			totalTestCase = scanner.nextInt();scanner.nextLine();
			for(int i=0;i<totalTestCase;i++){
				String unknow =scanner.nextLine();
				StringBuilder builder= new StringBuilder("");
				for (char eachChar : unknow.toCharArray()) {
					if(!(eachChar+"").trim().isEmpty()){
						if(eachChar>='A' && eachChar<='Z' )
						builder.append(map.get((""+eachChar).toLowerCase()).toUpperCase());
						else builder.append(map.get((""+eachChar).toLowerCase()));
					}else builder.append(" ");
				}
				System.out.println("Case #"+(i+1) +": "+builder.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
}
