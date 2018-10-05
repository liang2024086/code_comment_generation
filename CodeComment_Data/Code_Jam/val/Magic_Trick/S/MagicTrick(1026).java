package methodEmbedding.Magic_Trick.S.LYD1600;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-large-practice.in"));
		
		FileWriter fw = new FileWriter("result.txt");
		
		int number = Integer.parseInt(in.readLine());
		
		int i = 1;
		while (i <= number) {
			String res = "Case #" + i + ": ";
			String[][] square = new String[4][4];
			String[][] square1 = new String[4][4];

			int rownumber1 = Integer.parseInt(in.readLine());
			
			square[0] = in.readLine().split(" ");
			square[1] = in.readLine().split(" ");
			square[2] = in.readLine().split(" ");
			square[3] = in.readLine().split(" ");
			int rownumber2 = Integer.parseInt(in.readLine());

			square1[0] = in.readLine().split(" ");
			square1[1] = in.readLine().split(" ");
			square1[2] = in.readLine().split(" ");
			square1[3] = in.readLine().split(" ");

			String[] row = square[rownumber1 - 1];
			String[] row1 = square1[rownumber2 - 1];

			String sameOne = "n";
			int num = 0;
			for(int j = 0; j<4; j++){
				String c = row[j];
				for(int k = 0; k<4; k++){
					if(c.equals(row1[k])){
						sameOne = c;
						num++;
					}
				}
			}
			
			if(num == 1){
				res += sameOne;
			}else if(num > 1){
				res += "Bad magician!";

			}else if(num == 0){
				res += "Volunteer cheated!";
			}
			fw.write(res + "\n");
			i++;
		}
		in.close();
		fw.flush();
		fw.close();
	}
}
