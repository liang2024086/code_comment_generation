package methodEmbedding.Speaking_in_Tongues.S.LYD979;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class Asmall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numStrings = -1;
		Vector<String> string = new Vector<String>();
			
			try {
				
				BufferedReader input = new BufferedReader(new FileReader("./src/asmall/A-small-attempt0.in"));
				
				String linha;
				
				while((linha = input.readLine()) != null){
					if(numStrings == -1) numStrings = Integer.parseInt(linha);
					else string.add(linha);
				}
				
				input.close();
				
				BufferedWriter output = new BufferedWriter(new FileWriter(new File("output.txt"))); 
				
				for(int i = 0; i<numStrings; i++) {
					
					int numCase = i+1;
					
					output.write("Case #" + numCase + ": ");
					
					char[] letras = string.get(i).toCharArray();
					
					for(int j=0; j<letras.length; j++){
						
						if(letras[j] == 'a') letras[j] = 'y';
						else if(letras[j] == 'b') letras[j] = 'h';
						else if(letras[j] == 'c') letras[j] = 'e';
						else if(letras[j] == 'd') letras[j] = 's';
						else if(letras[j] == 'e') letras[j] = 'o';
						else if(letras[j] == 'f') letras[j] = 'c';
						else if(letras[j] == 'g') letras[j] = 'v';
						else if(letras[j] == 'h') letras[j] = 'x';
						else if(letras[j] == 'i') letras[j] = 'd';
						else if(letras[j] == 'j') letras[j] = 'u';
						else if(letras[j] == 'k') letras[j] = 'i';
						else if(letras[j] == 'l') letras[j] = 'g';
						else if(letras[j] == 'm') letras[j] = 'l';
						else if(letras[j] == 'n') letras[j] = 'b';
						else if(letras[j] == 'o') letras[j] = 'k';
						else if(letras[j] == 'p') letras[j] = 'r';
						else if(letras[j] == 'q') letras[j] = 'z';
						else if(letras[j] == 'r') letras[j] = 't';
						else if(letras[j] == 's') letras[j] = 'n';
						else if(letras[j] == 't') letras[j] = 'w';
						else if(letras[j] == 'u') letras[j] = 'j';
						else if(letras[j] == 'v') letras[j] = 'p';
						else if(letras[j] == 'w') letras[j] = 'f';
						else if(letras[j] == 'x') letras[j] = 'm';
						else if(letras[j] == 'y') letras[j] = 'a';
						else if(letras[j] == 'z') letras[j] = 'q';
						
						output.write(letras[j]);
						
					}
					
					output.newLine();
					
				}			
				 
				output.close();
				
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		

	}

}
