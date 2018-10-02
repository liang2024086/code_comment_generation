package methodEmbedding.Speaking_in_Tongues.S.LYD376;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import alien_language.Tree;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String fileName = args[0];
		String fileName = "googlerese/A-small-attempt1.in";
		Scanner sC = null;
		try {
			sC = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		char[] translator = new char[26];
		
		translator['y' - 97] = 'a';
		translator['e' - 97] = 'o';
		translator['q' - 97] = 'z';
		
		String[] in = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		String[] out = {"our language is impossible to understand", "there are twenty six factorial possibilities", "so it is okay if you want to just give up"};
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < in[i].length(); j++){
				if(in[i].toCharArray()[j] != ' ')
					translator[in[i].toCharArray()[j] - 97] = out[i].toCharArray()[j];
			}
		}
		
		for(int i = 0; i < 26; i++){
			for(int j = 0; j < 26; j++){
				if((char) (i + 97) == translator[j])
					break;
				if(j == 25){
					translator['z' - 97] = (char) (i + 97);
				}
			}
		}
		
		/*for(int i = 0; i < 26; i++){
			System.out.println((char) (i + 97) + ": " + translator[i]);
		}*/
		
		int T = sC.nextInt();
		sC.nextLine();
		for(int i = 0; i < T; i++){
			String line = sC.nextLine();
			String output = "";
			char[] inputA, outputA;
			inputA = line.toCharArray();
			outputA = inputA.clone();
			for(int j = 0; j < inputA.length; j++){
				if(inputA[j] != ' ')
					output += translator[inputA[j] - 97];
				else
					output += " ";
			}
			
			System.out.println("Case #" + (i + 1) + ": " + output);
		}

	}

}
