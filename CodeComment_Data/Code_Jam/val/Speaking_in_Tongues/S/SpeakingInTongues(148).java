package methodEmbedding.Speaking_in_Tongues.S.LYD401;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JFileChooser;


public class SpeakingInTongues {

	
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser();
		int state = chooser.showOpenDialog(null);
		
		if(state == 0) {
			File file = chooser.getSelectedFile();
			
			try {
				FileInputStream fInputStream = new FileInputStream(file);
				DataInputStream dInputStream = new DataInputStream(fInputStream);
				BufferedReader br = new BufferedReader(new InputStreamReader(dInputStream));
				
				PrintWriter out = new PrintWriter(new FileWriter("output"));
				
				String str = br.readLine();
				int count = 1;
				
				while((str = br.readLine()) != null) {
					
					out.print("Case #" + count + ": ");
					
					for(int i=0; i<str.length(); i++) {
						
						if(str.charAt(i) == 'a') {
							out.print('y');
						} else if(str.charAt(i) == 'b') {
							out.print('h');
						} else if(str.charAt(i) == 'c') {
							out.print('e');
						} else if(str.charAt(i) == 'd') {
							out.print('s');
						} else if(str.charAt(i) == 'e') {
							out.print('o');
						} else if(str.charAt(i) == 'f') {
							out.print('c');
						} else if(str.charAt(i) == 'g') {
							out.print('v');
						} else if(str.charAt(i) == 'h') {
							out.print('x');
						} else if(str.charAt(i) == 'i') {
							out.print('d');
						} else if(str.charAt(i) == 'j') {
							out.print('u');
						} else if(str.charAt(i) == 'k') {
							out.print('i');
						} else if(str.charAt(i) == 'l') {
							out.print('g');
						} else if(str.charAt(i) == 'm') {
							out.print('l');
						} else if(str.charAt(i) == 'n') {
							out.print('b');
						} else if(str.charAt(i) == 'o') {
							out.print('k');
						} else if(str.charAt(i) == 'p') {
							out.print('r');
						} else if(str.charAt(i) == 'q') {
							out.print('z');
						} else if(str.charAt(i) == 'r') {
							out.print('t');
						} else if(str.charAt(i) == 's') {
							out.print('n');
						} else if(str.charAt(i) == 't') {
							out.print('w');
						} else if(str.charAt(i) == 'u') {
							out.print('j');
						} else if(str.charAt(i) == 'v') {
							out.print('p');
						} else if(str.charAt(i) == 'w') {
							out.print('f');
						} else if(str.charAt(i) == 'x') {
							out.print('m');
						} else if(str.charAt(i) == 'y') {
							out.print('a');
						} else if(str.charAt(i) == 'z') {
							out.print('q');
						} else if(str.charAt(i) == ' ') {
							out.print(' ');
						}
					}
					
					out.println();
					count++;
				}
				
				out.close();
				dInputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
