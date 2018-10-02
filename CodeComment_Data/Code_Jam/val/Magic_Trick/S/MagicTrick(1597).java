package methodEmbedding.Magic_Trick.S.LYD340;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MagicTrick {
	private static String in;
	private static BufferedReader buff;
	private static File arquivo = new File("output.txt");
	private static FileOutputStream fos;
	private static int cases;
	
	
	public static void main(String[] args) {
		
		//Prepare output
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		} 
		
		//Prepare input and reading first line
		try {
			buff = new BufferedReader(new FileReader("C:/Users/Arthur/Documents/Workspace Java/goojam/A-small-attempt2.in"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		}
		try {
			in = buff.readLine();
			cases = Integer.parseInt(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		//walk through all cases 
		for (int i = 1; i <= cases; i++) {
			int resposta;
			String[] possibilidades = null;
			
			/*################ FIRST ROUND ###################*/
			
			//Read the line where the answer is
			try {
				in = buff.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			resposta = Integer.parseInt(in);
			
			//Take that line possibilities
			for (int k = 1; k <= 4; k++) {
				try {
					in = buff.readLine();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
				
				if (k != resposta) continue;
				
				possibilidades = in.split(" ");
			}
			
			
			/*#################  SECOND ROUND ################*/
			
			//Take the line where answer is
			try {
				in = buff.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			resposta = Integer.parseInt(in);
			
			
			int numeroMagico = 0;
			String mensagem = null;
			for (int k = 1; k <= 4; k++) {
				try {
					in = buff.readLine();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
				
				
				//Discards the lines that are not answers
				if (k != resposta) continue;
				
				String[] possibilidades2 = in.split(" ");
				
				//Compare the two possibilities
				for (String s : possibilidades) {
					for (String s2 : possibilidades2) {
						if (s.equals(s2)) {
							if (numeroMagico == 0) {
								numeroMagico = Integer.parseInt(s);
								mensagem = numeroMagico + "";
							}
							else {
								mensagem = "Bad magician!";
							}
						}
					}
				}
				
				if (mensagem == null) {
					mensagem = "Volunteer cheated!";
				}
			}
			
			//Print
			try {
				String res = "Case #" + i + ": " + mensagem + System.getProperty("line.separator");
				fos.write(res.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			
		}

	}
}
