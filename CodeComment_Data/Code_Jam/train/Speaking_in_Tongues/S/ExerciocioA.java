package methodEmbedding.Speaking_in_Tongues.S.LYD1254;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExerciocioA {

	public static void main(String args []) throws IOException{
		Map<Character, Character> dicionario = new HashMap<Character, Character>();

		dicionario.put('z', 'q');
		dicionario.put('q', 'z');
		
		File fileGooglerese = new File("src/exercicio/a/googlerese.txt");
		File fileIngles = new File("src/exercicio/a/ingles.txt");
	
		FileReader fileReaderGooglerese = new FileReader(fileGooglerese);
		FileReader fileReaderIngles = new FileReader(fileIngles);
		
		BufferedReader leitorGoo = new BufferedReader(fileReaderGooglerese);
		BufferedReader leitorIng = new BufferedReader(fileReaderIngles);
		
		String linhaGoo = null;
		String linhaIngles = null;
		while ((linhaGoo = leitorGoo.readLine())!= null) {
			linhaIngles = leitorIng.readLine();
			
			for(int i = 0; i < linhaGoo.length(); i++){
				dicionario.put(linhaGoo.charAt(i), linhaIngles.charAt(i));
			}
		}
		
		for (Character c : dicionario.keySet()) {
			System.out.println(c + " -> " + dicionario.get(c));
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	
		File fileInput = new File("src/exercicio/a/input.txt");
		
		FileReader fileReaderInput = new FileReader(fileInput);
		
		BufferedReader leitorInput = new BufferedReader(fileReaderInput);
	
		String numeroLinhas = leitorInput.readLine();
		Integer numero = new Integer(numeroLinhas);
		
		String linhaInput = null;
		for(int j = 0; j< numero; j++){
		linhaInput = leitorInput.readLine();
		System.out.print("Case #"+(j+1)+": ");
			for(int i = 0; i < linhaInput.length(); i++){
				System.out.print(dicionario.get(linhaInput.charAt(i)));
			}
			System.out.print("\n");
		}
	}
		
}


