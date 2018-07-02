package methodEmbedding.Speaking_in_Tongues.S.LYD1365;

import java.util.Scanner;


public class A {
	
	

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for (int x = 0; in.hasNext(); x++) {
		String inputbuff = in.nextLine();
		
		StringBuffer input = new StringBuffer(inputbuff);
		int length = input.length();

		for (int i = 0; i < length; i++) {

			switch (input.charAt(i)) {
			case 'y':  input.setCharAt(i, 'a');
			break;
			case 'n':  input.setCharAt(i, 'b');
			break;
			case 'f':  input.setCharAt(i, 'c');
			break;
			case 'i':  input.setCharAt(i,'d');
			break;
			case 'c':  input.setCharAt(i, 'e');
			break;
			case 'w':  input.setCharAt(i, 'f');
			break;
			case 'l':  input.setCharAt(i, 'g');
			break;
			case 'b':  input.setCharAt(i, 'h');
			break;
			case 'k':  input.setCharAt(i, 'i');
			break;
			case 'u': input.setCharAt(i, 'j');
			break;
			case 'o': input.setCharAt(i,'k');
			break;
			case 'm': input.setCharAt(i,'l');
			break;
			case 'x': input.setCharAt(i,'m');
			break;
			case 's': input.setCharAt(i,'n');
			break;
			case 'e': input.setCharAt(i,'o');
			break;
			case 'v': input.setCharAt(i,'p');
			break;
			case 'z': input.setCharAt(i,'q');
			break;
			case 'p': input.setCharAt(i,'r');
			break;
			case 'd': input.setCharAt(i,'s');
			break;
			case 'r': input.setCharAt(i,'t');
			break;
			case 'j': input.setCharAt(i,'u');
			break;
			case 'g': input.setCharAt(i,'v');
			break;
			case 't': input.setCharAt(i,'w');
			break;
			case 'h': input.setCharAt(i,'x');
			break;
			case 'a': input.setCharAt(i,'y');
			break;
			case 'q': input.setCharAt(i,'z');
			break;
	        default:
	        break;
	        }
			
				
		}

		
			System.out.println("Case #" + x + ": "+ input);
		}
	}
}
