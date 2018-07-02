package methodEmbedding.Speaking_in_Tongues.S.LYD1500;


import java.util.ArrayList;
import java.util.HashMap;
import utilities.FileReadWrite;;

public class SpeakinginTongues {

	public static HashMap<Character, Character> myDic;
	
	public static void main(String[] args) {
		 
		myDic = new HashMap<Character, Character>();
		myDic.put('y', 'a');
		myDic.put('n', 'b');
		myDic.put('f', 'c');
		myDic.put('i', 'd');
		myDic.put('c', 'e');

		myDic.put('w', 'f');
		myDic.put('l', 'g');
		myDic.put('b', 'h');
		myDic.put('k', 'i');
		myDic.put('u', 'j');

		myDic.put('o', 'k');
		myDic.put('m', 'l');
		myDic.put('x', 'm');
		myDic.put('s', 'n');
		myDic.put('e', 'o');

		myDic.put('v', 'p');
		myDic.put('z', 'q');
		myDic.put('p', 'r');
		myDic.put('d', 's');
		myDic.put('r', 't');

		myDic.put('j', 'u');
		myDic.put('g', 'v');
		myDic.put('t', 'w');
		myDic.put('h', 'x');
		myDic.put('a', 'y');

		myDic.put('q', 'z');
		
		FileReadWrite myFile = new FileReadWrite();
		ArrayList<String> lines = myFile.readFile();
		int N = Integer.parseInt(lines.get(0));
		
		String outputString="";
		String str, tempLine;
		String temp="";
		String[] words;
		for (int i = 1; i < lines.size(); i++) 
		{
			str = lines.get(i);
			words = str.split(" ");
			tempLine = "Case #"+i+": ";
			for (int j = 0; j < words.length; j++) 
			{
				char[] x = words[j].toCharArray();
				temp = "";
				for (int k = 0; k < x.length; k++) 
				{
					temp = temp + myDic.get(x[k]);
				}
				tempLine = tempLine + temp + " ";
			}
			outputString = outputString + tempLine + "\n";
		}
		System.out.println(outputString);
		myFile.writeFile(outputString);

	}

}
