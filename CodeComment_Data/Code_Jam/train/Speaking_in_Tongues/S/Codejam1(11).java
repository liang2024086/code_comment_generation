package methodEmbedding.Speaking_in_Tongues.S.LYD741;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Codejam1 {
	
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		
		int ln = 1;
		char c;
		int line;
		String s;
		
		line = scanner.nextInt();
		for(int i=0; scanner.hasNextLine(); i++) {	// her bir satir okuma
			
			s = scanner.nextLine();
			out.print("Case #"+i+": ");
			for(int j=0; j<s.length(); j++) {
				
				switch(s.charAt(j)) {
				//case '\n' : out.print("\nCase #"+ln+": "); ln++; break;
				case ' ' : out.print(" "); break;
				case 'a' : out.print("y"); break;
				case 'b' : out.print("h"); break;
				case 'c' : out.print("e"); break;
				case 'd' : out.print("s"); break;
				case 'e' : out.print("o"); break;
				case 'f' : out.print("c"); break;
				case 'g' : out.print("v"); break;
				case 'h' : out.print("x"); break;
				case 'i' : out.print("d"); break;
				case 'j' : out.print("u"); break;
				case 'k' : out.print("i"); break;
				case 'l' : out.print("g"); break;
				case 'm' : out.print("l"); break;
				case 'n' : out.print("b"); break;
				case 'o' : out.print("k"); break;
				case 'p' : out.print("r"); break;
				case 'q' : out.print("z"); break;
				case 'r' : out.print("t"); break;
				case 's' : out.print("n"); break;
				case 't' : out.print("w"); break;
				case 'u' : out.print("j"); break;
				case 'v' : out.print("p"); break;
				case 'w' : out.print("f"); break;
				case 'x' : out.print("m"); break;
				case 'y' : out.print("a"); break;
				case 'z' : out.print("q"); break;
				}
			}
			out.println();
		}
		
		out.close();
		return;
	}

}
