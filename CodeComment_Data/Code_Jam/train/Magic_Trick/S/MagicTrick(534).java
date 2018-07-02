package methodEmbedding.Magic_Trick.S.LYD344;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicTrick {
	public static void main (String args[])
	{
		int [][] padraocartas = new int [4][4];
		int [][] embaralhacartas = new int [4][4];
		int [] l1 = new int [4];
		int [] l2 = new int [4];
		String home = "C:/Users/User/Desktop/Jam/";
		String input = home + "A-small-attempt0.in";
		String output = home + "output.in";
		int casoTeste;
		int linha1;
		int linha2;
        try {
        	Scanner sc = new Scanner(new FileReader(input));
			PrintWriter pw = new PrintWriter(output);
			casoTeste = sc.nextInt(); // preenche o numero de casos
			System.out.println("Casos teste: " + casoTeste);
			sc.nextLine();
			for (int i=1; i<=casoTeste; i++)
			{
				linha1 = sc.nextInt(); // preenche a linha 1
				System.out.println("Linha escolhida: " + linha1);
				for (int linha=0; linha<padraocartas.length; linha++)
				{
						for (int coluna=0; coluna<padraocartas.length; coluna++)
						{
							padraocartas[linha][coluna] = sc.nextInt();
							System.out.print("\t"+padraocartas[linha][coluna] + " ");
						}
						sc.nextLine();
						System.out.print("\n");
				}
				linha2 = sc.nextInt();
				System.out.println("Linha escolhida: " + linha2);
				for (int linha=0; linha<embaralhacartas.length; linha++)
				{
						for (int coluna=0; coluna<embaralhacartas.length; coluna++)
						{
							embaralhacartas[linha][coluna] = sc.nextInt();
							System.out.print("\t"+embaralhacartas[linha][coluna] + " ");
						}
						if(sc.hasNextInt())
						{
							sc.nextLine();
						}	
						System.out.print("\n");
					
				}
				int contador = 0;
				int numero = 0;
				for (int c=0; c<l1.length; c++)
				{
					l1[c] = padraocartas[linha1-1][c];
					l2[c] = embaralhacartas[linha2-1][c];
					if (l1[c] == l2[c])
					{
						numero = l1[c];
						contador++;
					}
				}
				String resultado = "Case #" + i + ": ";
				if (contador == 0)
				{
					pw.write(resultado + "Volunteer cheated!" + "\n");
				}
				else if (contador == 1)
				{
					pw.write(resultado + numero + "\n");
				}
				else
				{
					pw.write(resultado + "Bad magician!" + "\n");
				}
			}
			pw.close();
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
		}
	}
	
	
}
