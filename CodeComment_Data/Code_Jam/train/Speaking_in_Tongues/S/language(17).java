package methodEmbedding.Speaking_in_Tongues.S.LYD434;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class GoogleCypher {

	
	
	HashMap<Character, Character> code = new HashMap<Character, Character>();
	
	public static void main(String[] args){
		
		try {
			FileInputStream fstream = new FileInputStream("C:/input.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int numOfLines = Integer.parseInt(br.readLine());
			for(int i = 1; i<=numOfLines; i++){
				String input = br.readLine();
				char[] inputArray = input.toCharArray();
				for(int index = 0; index < inputArray.length; index++){
					switch(inputArray[index]){
					case 'a':
						inputArray[index] = 'y';
						break;
					case 'b':
						inputArray[index] = 'h';
						break;
					case 'c':
						inputArray[index] = 'e';
						break;
					case 'd':
						inputArray[index] = 's';
						break;
					case 'e':
						inputArray[index] = 'o';
						break;
					case 'f':
						inputArray[index] = 'c';
						break;
					case 'g':
						inputArray[index] = 'v';
						break;
					case 'h':
						inputArray[index] = 'x';
						break;
					case 'i':
						inputArray[index] = 'd';
						break;
					case 'j':
						inputArray[index] = 'u';
						break;
					case 'k':
						inputArray[index] = 'i';
						break;
					case 'l':
						inputArray[index] = 'g';
						break;
					case 'm':
						inputArray[index] = 'l';
						break;
					case 'n':
						inputArray[index] = 'b';
						break;
					case 'o':
						inputArray[index] = 'k';
						break;
					case 'p':
						inputArray[index] = 'r';
						break;
					case 'q':
						inputArray[index] = 'z';
						break;
					case 'r':
						inputArray[index] = 't';
						break;
					case 's':
						inputArray[index] = 'n';
						break;
					case 't':
						inputArray[index] = 'w';
						break;
					case 'u':
						inputArray[index] = 'j';
						break;
					case 'v':
						inputArray[index] = 'p';
						break;
					case 'w':
						inputArray[index] = 'f';
						break;
					case 'x':
						inputArray[index] = 'm';
						break;
					case 'y':
						inputArray[index] = 'a';
						break;
					case 'z':
						inputArray[index] = 'q';
						break;
						
					}
				}
				System.out.println("Case #" + i + ": " + new String(inputArray));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
