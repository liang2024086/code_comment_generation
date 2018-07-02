package methodEmbedding.Speaking_in_Tongues.S.LYD1520;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
//import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import com.sun.tools.hat.internal.parser.Reader;


public class ReverseWords {
	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter the name of the input file: ");
//		String fileName = sc.next();
//		
		try {
			BufferedReader br = new BufferedReader(new FileReader (args[0]));
			try {
				FileWriter fw = new FileWriter("Output.out");
				
				try {
					int numCases = Integer.parseInt(br.readLine());
					
					for(int i = 1; i <= numCases; i++) {
						String line = br.readLine();
//						StringTokenizer st = new StringTokenizer(line, " ");
//						Stack<String> wordStack = new Stack<String>();
//						while(st.hasMoreTokens()) {
//							wordStack.push(st.nextToken());
//						}
						fw.write("Case #" + i + ": ");
						for(int j = 0; j < line.length(); j++){
//							String newChar ="";
							switch(line.charAt(j)){
							case 'y':
								fw.write('a');
								break;
							case 'n':
								fw.write('b');
								break;
							case 'f':
								fw.write('c');
								break;
							case 'i':
								fw.write('d');
								break;
							case 'c':
								fw.write('e');
								break;
							case 'w':
								fw.write('f');
								break;
							case 'l':
								fw.write('g');
								break;
							case 'b':
								fw.write('h');
								break;
							case 'k':
								fw.write('i');
								break;
							case 'u':
								fw.write('j');
								break;
							case 'o':
								fw.write('k');
								break;
							case 'm':
								fw.write('l');
								break;
							case 'x':
								fw.write('m');
								break;
							case 's':
								fw.write('n');
								break;
							case 'e':
								fw.write('o');
								break;
							case 'v':
								fw.write('p');
								break;
							case 'z':
								fw.write('q');
								break;
							case 'p':
								fw.write('r');
								break;
							case 'd':
								fw.write('s');
								break;
							case 'r':
								fw.write('t');
								break;
							case 'j':
								fw.write('u');
								break;
							case 'g':
								fw.write('v');
								break;
							case 't':
								fw.write('w');
								break;
							case 'h':
								fw.write('x');
								break;
							case 'a':
								fw.write('y');
								break;
							case 'q':
								fw.write('z');
								break;
							case ' ':
								fw.write(' ');
								break;
							}
						}
						
						
//						while(!wordStack.isEmpty()) {
//							fw.write(wordStack.pop() + " ");
//						}
						fw.write("\n");
					}
					
				br.close();
				fw.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
	}
}
