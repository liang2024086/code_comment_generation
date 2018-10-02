package methodEmbedding.Speaking_in_Tongues.S.LYD479;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int testCases = 0;
		String[] input;
		String[] output;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String cases = in.readLine();
		testCases = Integer.parseInt(cases);
				
		input = new String[testCases];
		output = new String[testCases];
		
		for(int i=0;i<testCases;i++){
				input[i]=in.readLine();
		}
		
		in.close();
		
		for(int i=0;i<testCases;i++){
			input[i].toLowerCase();
			output[i] = "";
			int length = input[i].length();
			for(int j=0;j<length;j++){
				char inputChar = input[i].charAt(j);
				char outputChar;
				switch(inputChar){
				case 'y': outputChar = 'a';break;
				case 'f': outputChar = 'c';break;
				case 'i': outputChar = 'd';break;
				case 'c': outputChar = 'e';break;
				case 'w': outputChar = 'f';break;
				case 'l': outputChar = 'g';break;
				case 'b': outputChar = 'h';break;
				case 'k': outputChar = 'i';break;
				case 'u': outputChar = 'j';break;
				case 'o': outputChar = 'k';break;
				case 'n': outputChar = 'b';break;
				case 'm': outputChar = 'l';break;
				case 'x': outputChar = 'm';break;
				case 's': outputChar = 'n';break;
				case 'e': outputChar = 'o';break;
				case 'v': outputChar = 'p';break;
				case 'p': outputChar = 'r';break;
				case 'd': outputChar = 's';break;
				case 'r': outputChar = 't';break;
				case 'j': outputChar = 'u';break;
				case 'g': outputChar = 'v';break;
				case 't': outputChar = 'w';break;
				case 'h': outputChar = 'x';break;
				case 'a': outputChar = 'y';break;
				case 'q': outputChar = 'z';break;
				case 'z': outputChar = 'q';break;
				default:
					outputChar = inputChar;
				}
				output[i] += outputChar;				
			}
			System.out.println("Case #"+(i+1)+": "+output[i]);
		}
	}

}
