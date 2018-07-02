package methodEmbedding.Speaking_in_Tongues.S.LYD788;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/* Jin Hao Chong
 * Google Code Jam 2012 Qualification Round Question 1
 * In this program, I used the Java standard library of java.io;
 */
public class Googlerese {
	public static void main(String args[]){
		BufferedReader in = null;
		BufferedWriter out = null;

		try{
			//input and output
			in = new BufferedReader(new FileReader("A-small-attempt0.in"));
			out = new BufferedWriter(new FileWriter("Output.txt"));
			
			int totalround, round;
			String read, output;
			
			//get rounds
			read = in.readLine();
			round = Integer.parseInt(read);
			totalround = round;
			
			//Map character for each line
			while(round > 0){
				output = "Case #" + (totalround - round + 1) + ": ";
				read = in.readLine();
				
				//actual mapping of the characters
				for(int i = 0; i < read.length(); i++){
					switch(read.charAt(i)){
					case 'a' : output += "y"; break;
					case 'b' : output += "h"; break;
					case 'c' : output += "e"; break;
					case 'd' : output += "s"; break;
					case 'e' : output += "o"; break;
					case 'f' : output += "c"; break;
					case 'g' : output += "v"; break;
					case 'h' : output += "x"; break;
					case 'i' : output += "d"; break;
					case 'j' : output += "u"; break;
					case 'k' : output += "i"; break;
					case 'l' : output += "g"; break;
					case 'm' : output += "l"; break;
					case 'n' : output += "b"; break;
					case 'o' : output += "k"; break;
					case 'p' : output += "r"; break;
					case 'q' : output += "z"; break;
					case 'r' : output += "t"; break;
					case 's' : output += "n"; break;
					case 't' : output += "w"; break;
					case 'u' : output += "j"; break;
					case 'v' : output += "p"; break;
					case 'w' : output += "f"; break;
					case 'x' : output += "m"; break;
					case 'y' : output += "a"; break;
					case 'z' : output += "q"; break;
					case ' ' : output += " "; break;
					default: break;
					}
				}
				
				//write output to file
				out.write(output);
				if(round != 1) out.newLine();
				round--;
			}
			in.close();
			out.close();
		}catch(Exception e){
			System.err.print(e);
		}
	}
}
