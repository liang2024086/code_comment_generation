package methodEmbedding.Counting_Sheep.S.LYD1660;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class CountingSheep {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


		int veces = Integer.parseInt(in.readLine());
		int cont = 1;

		while (veces>0) {
			out.write("Case #"+cont+":");

			String linea = in.readLine();
			long valor = Long.parseLong(linea);

			if (valor ==0) {
				out.write("INSOMNIA\n");
			}else {

				HashSet<Character> lista = new HashSet<Character>();
				boolean stop = false;


				for (int j = 1; !stop; j++) {
					
					long n = valor*j;
					linea = n+"";

					for (int i = 0; i < linea.length() && !stop; i++) {
						lista.add(linea.charAt(i));
						if (lista.size()==10) {
							stop = true;
						}
					}
				}
				
				out.write(linea+"\n");


			}

			veces--;
			cont++;
		}
		
		out.flush();
		in.close();
		out.close();
		

	}

}
