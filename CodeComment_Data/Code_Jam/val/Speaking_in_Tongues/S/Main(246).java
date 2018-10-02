package methodEmbedding.Speaking_in_Tongues.S.LYD1209;


import java.io.*;

public class Main {

	public static void main(String args[]) {
		try {
			char[] mapa = { 'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u',
					'o', 'm', 'x', 's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g',
					't', 'h', 'a', 'q' };
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream("A-small-attempt3.in");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			// Create file
			FileWriter ostream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(ostream);

			String strLine = br.readLine();
			System.out.println(strLine);
			int n = Integer.parseInt(strLine);
			for (int i = 0; i < n; i++) {
		
				out.append('C');
				out.append('a');
				out.append('s');
				out.append('e');
				out.append(' ');
				out.append('#');

				String s = Integer.toString(i+1);
				
				char c1 = s.charAt(0);
				out.append(c1);
				char c2=' ';
				if(s.length()==2){
				 c2 = s.charAt(1);
				 out.append(c2);
				}
				
				
				System.out.print(c1);
				System.out.print(c2);
				out.append(':');
				out.append(' ');

				strLine = br.readLine();
				System.out.println(strLine);
				String[] zborovi = strLine.split(" ");
				for (int j = 0; j < zborovi.length; j++) {
					for (int k = 0; k < zborovi[j].length(); k++) {
						char c = zborovi[j].charAt(k);
						int l = 0;
						for (l = 0; l < mapa.length; l++) {
							if (c == mapa[l])
								break;
						}
						char a = (char) (97 + l);
						out.append(a);

						System.out.print(a);
					}
					out.append(' ');
					System.out.print(" ");
				}
				out.append('\n');
				System.out.println();

			}

			// Close the input stream
			in.close();
			out.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
