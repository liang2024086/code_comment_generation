package methodEmbedding.Magic_Trick.S.LYD1085;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class A {
 
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		FileWriter fw = new FileWriter("A-small-attempt1.out");
		int N = new Integer(in.readLine());
  
		for (int cases = 1; cases <= N; cases++) {
			int row = new Integer(in.readLine());
			String[] first = null;
			for (int i = 1; i <= 4; i++){
				String temp = in.readLine();
				if (i == row){
					first = temp.split(" ");
				}
			}
			int row2 = new Integer(in.readLine());
			String[] second = null;
			for (int i = 1; i <= 4; i++){
				String temp = in.readLine();
				if (i == row2){
					second = temp.split(" ");
				}
			}
			int find = 0;
			int finded = 0;
			for (int i = 0; i < second.length; i++){
				for (int ii = 0; ii < first.length; ii++){
					if (Integer.parseInt(second[i]) == Integer.parseInt(first[ii])){
						finded = Integer.parseInt(second[i]);
						find++;
					}
				}
			}
			if (find == 0){
				fw.write ("Case #" + cases + ": Volunteer cheated!\n");
			} else if (find == 1){
				fw.write ("Case #" + cases + ": " + finded + "\n");
			} else {
				fw.write ("Case #" + cases + ": Bad magician!\n");
			}
		}
		in.close();
		fw.flush();
		fw.close();
	}
}
