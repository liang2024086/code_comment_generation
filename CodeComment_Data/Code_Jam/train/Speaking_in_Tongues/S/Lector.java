package methodEmbedding.Speaking_in_Tongues.S.LYD817;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class Lector {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fisEntrada = new FileInputStream("src/entrada.in");
			FileWriter fwSalida = new FileWriter("src/salida.out");
			BufferedWriter bwSalida = new BufferedWriter(fwSalida);
			DataInputStream disEntrada = new DataInputStream(fisEntrada);
			String sEntrada;
			String sSalida;
			StringBuilder sbParteSalida;
			BufferedReader brEntrada = new BufferedReader(new InputStreamReader(disEntrada));
			int contador;
			
			try
			{
				contador = Integer.parseInt(brEntrada.readLine());
				for(int i = 1; i<=contador; i++)
				{
					sbParteSalida = new StringBuilder();
					sEntrada = brEntrada.readLine();
					for(int j = 0; j < sEntrada.length(); j++)
					{
						switch(sEntrada.charAt(j))
						{
							case 'y':
								sbParteSalida.append('a');
								break;
							case 'n':
								sbParteSalida.append('b');
								break;
							case 'f':
								sbParteSalida.append('c');
								break;
							case 'i':
								sbParteSalida.append('d');
								break;
							case 'c':
								sbParteSalida.append('e');
								break;
							case 'w':
								sbParteSalida.append('f');
								break;
							case 'l':
								sbParteSalida.append('g');
								break;
							case 'b':
								sbParteSalida.append('h');
								break;
							case 'k':
								sbParteSalida.append('i');
								break;
							case 'u':
								sbParteSalida.append('j');
								break;
							case 'o':
								sbParteSalida.append('k');
								break;
							case 'm':
								sbParteSalida.append('l');
								break;
							case 'x':
								sbParteSalida.append('m');
								break;
							case 's':
								sbParteSalida.append('n');
								break;
							case 'e':
								sbParteSalida.append('o');
								break;
							case 'v':
								sbParteSalida.append('p');
								break;
							case 'z':
								sbParteSalida.append('q');
								break;
							case 'p':
								sbParteSalida.append('r');
								break;
							case 'd':
								sbParteSalida.append('s');
								break;
							case 'r':
								sbParteSalida.append('t');
								break;
							case 'j':
								sbParteSalida.append('u');
								break;
							case 'g':
								sbParteSalida.append('v');
								break;
							case 't':
								sbParteSalida.append('w');
								break;
							case 'h':
								sbParteSalida.append('x');
								break;
							case 'a':
								sbParteSalida.append('y');
								break;
							case 'q':
								sbParteSalida.append('z');
								break;
							default:
								sbParteSalida.append(sEntrada.charAt(j));
						}
					}
					sSalida = "Case #" + i + ": " + sbParteSalida.toString() + "\n";
					bwSalida.write(sSalida);
				}
				bwSalida.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		
	}

}
