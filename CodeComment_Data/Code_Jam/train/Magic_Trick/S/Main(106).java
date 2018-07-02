package methodEmbedding.Magic_Trick.S.LYD1953;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception {

		String filename = args[0];

		File f = new File(filename);

		BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"));

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {

			String res = "";
			int[][] matrix1 = new int[4][4];
			int[][] matrix2 = new int[4][4];

			int p1 = Integer.parseInt(br.readLine()) -1;
			for (int k = 0; k < 4; k++) {

				String line = br.readLine();
				String delims = "[ ]+";
				String[] stringMatrix = line.split(delims);
				for (int j = 0; j < 4; j++)
					matrix1[k][j] = Integer.parseInt(stringMatrix[j]);

			}

			int p2 = Integer.parseInt(br.readLine()) -1;
			for (int k = 0; k < 4; k++) {

				String line = br.readLine();
				String delims = "[ ]+";
				String[] stringMatrix = line.split(delims);
				for (int j = 0; j < 4; j++)
					matrix2[k][j] = Integer.parseInt(stringMatrix[j]);

			}

			int pos = -1;
			int posSav = -1;
			for (int k = 0; k < 4; k++) {
				for (int j = 0; j < 4; j++) {
					if (matrix1[p1][k] == matrix2[p2][j]) {
						pos = matrix2[p2][j];
						break;
					}
				}
				if(posSav != -1)
					if(pos != -1){
						res="Bad magician!";
						break;
					}
				if (pos != -1){
					posSav=pos;
					res=String.valueOf(pos);
					pos = -1;
				}
			}
			
			if(posSav == -1)
				res="Volunteer cheated!";

			//System.out.println("Case #" + i + ": " + res);
			bw.write("Case #" + i + ": " + res + "\n");

		}

		bw.close();
		br.close();

	}
}
