package methodEmbedding.Magic_Trick.S.LYD1361;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;


public class TruqueMagica {
	
	private static String in;
	private static BufferedReader buffer;
	private static File arquivo = new File("output.txt");
	private static FileOutputStream fos;
	private static int casos;
	
	
	public static void main(String[] args) {
		
		try {
			fos = new FileOutputStream(arquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		} 

		//buffer = new BufferedReader(new InputStreamReader(System.in));
		try {
			buffer = new BufferedReader(new FileReader("C:/Users/Yuji/workspace/teste/A-small-attempt1.in"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.exit(0);
		} 
		
		try {
			in = buffer.readLine();
			casos = Integer.parseInt(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}

		for (int i = 1; i <= casos; i++) {
			int resposta;
			String[] possibilidades = null;

			try {
				in = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			resposta = Integer.parseInt(in);

			for (int k = 1; k <= 4; k++) {
				try {
					in = buffer.readLine();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
				
				if (k != resposta) continue;
				
				possibilidades = in.split(" ");
			}

			try {
				in = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
			resposta = Integer.parseInt(in);
			
			
			int numeroMagico = 0;
			String mensagem = null;
			for (int k = 1; k <= 4; k++) {
				try {
					in = buffer.readLine();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}

				if (k != resposta) continue;
				
				String[] possibilidades2 = in.split(" ");

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
