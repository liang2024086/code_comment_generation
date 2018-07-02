package methodEmbedding.Speaking_in_Tongues.S.LYD1653;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


public class problemA {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char tableauCaractere[] = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char tableauCaractere2[] = {' ','y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};

		String outputFile = "C:\\Users\\mejdi\\Documents\\A-small.out";
		String inputFile = "C:\\Users\\mejdi\\Documents\\A-small-attempt2.in";

		BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
		DataInputStream in = new DataInputStream(new FileInputStream(inputFile));
		
		

		int T = Integer.valueOf(in.readLine());

		for (int o = 0; o < T; o++) {
			int x = o + 1;
			out.write("Case #" + x + ": ");
 
		
			String list = in.readLine();
			int h=list.length();
			char[] tab = new char[h];
			
			for (int j = 0; j < (h); j++) {
				
				tab[j] = String.valueOf(list.substring(0)).charAt(j);}
			
			for (int j = 0; j < (h); j++) {
				for (int i = 0; i < (27); i++) {
					if (tab[j]==tableauCaractere[i])
						out.write(tableauCaractere2[i]);
				}
			}
			
			
			out.newLine();
		}
		in.close();
		out.close();
	}
}

		
		
		
		
		
	
