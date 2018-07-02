package methodEmbedding.Speaking_in_Tongues.S.LYD556;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A {

	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("in/A/test.in"));
//		Scanner in = new Scanner(new File("in/A/small.in"));
//		Scanner in = new Scanner(new File("in/A/big.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"out/A/test.out"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter(
//				"out/A/small.out"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter(
//				"out/A/big.out"));
		
		int cases = in.nextInt();
		in.nextLine();
		for(int c = 1; c <= cases; c++){
			String line = in.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < line.length(); i++){
				char ch = line.charAt(i);
				switch (ch) {
				case ' ':
					sb.append(ch);
					break;
				case 'y':
					sb.append('a');
					break;
				case 'n':
					sb.append('b');
					break;
				case 'f':
					sb.append('c');
					break;
				case 'i':
					sb.append('d');
					break;
				case 'c':
					sb.append('e');
					break;
				case 'w':
					sb.append('f');
					break;
				case 'l':
					sb.append('g');
					break;
				case 'b':
					sb.append('h');
					break;
				case 'k':
					sb.append('i');
					break;
				case 'u':
					sb.append('j');
					break;
				case 'o':
					sb.append('k');
					break;
				case 'm':
					sb.append('l');
					break;
				case 'x':
					sb.append('m');
					break;
				case 's':
					sb.append('n');
					break;
				case 'e':
					sb.append('o');
					break;
				case 'v':
					sb.append('p');
					break;
				case 'z':
					sb.append('q');
					break;
				case 'p':
					sb.append('r');
					break;
				case 'd':
					sb.append('s');
					break;
				case 'r':
					sb.append('t');
					break;
				case 'j':
					sb.append('u');
					break;
				case 'g':
					sb.append('v');
					break;
				case 't':
					sb.append('w');
					break;
				case 'h':
					sb.append('x');
					break;
				case 'a':
					sb.append('y');
					break;
				case 'q':
					sb.append('z');
					break;
				default:
					break;
				}
			}
			
			
			bw.write("Case #" + (c) + ": "+sb.toString());
			System.err.println("Case #" + (c) + ": "+sb.toString());
			bw.newLine();
		}
		in.close();
		bw.flush();
		bw.close();
	}
}
