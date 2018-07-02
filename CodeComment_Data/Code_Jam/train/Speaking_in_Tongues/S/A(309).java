package methodEmbedding.Speaking_in_Tongues.S.LYD584;

/**
 * 
 */

import java.util.Scanner;
/**
 * @author Nuno Miguel dos Santos Reis
 *
 */
public class A {
	public static void main(String[] Args){
		
		Scanner inText = new Scanner(System.in);
		int t = inText.nextInt();
		String g = inText.nextLine();
		String output = "";
		
		for(int i = 0; i < t; i++){
			output += "Case #" + (i+1) + ": ";
			g = inText.nextLine();
			
			for(int a = 0; a < g.length(); a++){
				
				switch(g.charAt(a)){
				case ' ': output += " ";break;
				case 'a': output += "y";break;
				case 'b': output += "h";break;
				case 'c': output += "e";break;
				case 'd': output += "s";break;
				case 'e': output += "o";break;
				case 'f': output += "c";break;
				case 'g': output += "v";break;
				case 'h': output += "x";break;
				case 'i': output += "d";break;
				case 'j': output += "u";break;
				case 'k': output += "i";break;
				case 'l': output += "g";break;
				case 'm': output += "l";break;
				case 'n': output += "b";break;
				case 'o': output += "k";break;
				case 'p': output += "r";break;
				case 'q': output += "z";break; //----
				case 'r': output += "t";break;
				case 's': output += "n";break;
				case 't': output += "w";break;
				case 'u': output += "j";break;
				case 'v': output += "p";break;
				case 'w': output += "f";break;
				case 'x': output += "m";break;
				case 'y': output += "a";break;
				case 'z': output += "q";break;
				}
				
				
			}
			output += "\n";
		}
		
		System.out.print(output);
	}
}

