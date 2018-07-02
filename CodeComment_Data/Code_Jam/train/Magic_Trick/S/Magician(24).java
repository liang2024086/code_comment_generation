package methodEmbedding.Magic_Trick.S.LYD680;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;


public class Magician {

	public static void main(String[] args) {
		try {
			String file = "A-small-attempt0";
			FileReader fr = new FileReader(file + ".in");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(file + ".out");
			BufferedWriter bw = new BufferedWriter(fw);
			String line;
			line = br.readLine();
			int cases = Integer.parseInt(line);
			int row1[] = new int[4];
			for(int i=0; i<cases; i++) {
				line = br.readLine();
				int answer1 = Integer.parseInt(line);
				for(int j=0; j<answer1; j++)
					line = br.readLine();
				String[] words = line.split(" ");
				for(int j=0; j<words.length; j++) {
					row1[j] = Integer.parseInt(words[j]);
				}
				for(int j=0; j<4-answer1; j++) {
					br.readLine();
				}
				line = br.readLine();
				int answer2 = Integer.parseInt(line);
				for(int j=0; j<answer2; j++)
					line = br.readLine();
				words = line.split(" ");
				int uniqueNumber = -1;
				for(int j=0; j<words.length; j++) {
					int candidate = Integer.parseInt(words[j]);
					for(int k=0; k<4; k++) {
						if(row1[k] == candidate)
							if(uniqueNumber != -1) {
								uniqueNumber = -2;
								break;
							} else {
								uniqueNumber = candidate;
							}
					}
					if(uniqueNumber == -2) break;
				}
				for(int j=0; j<4-answer2; j++) {
					br.readLine();
				}
				bw.write("Case #" + (i+1)+":");
				if(uniqueNumber == -1) {
					bw.write(" Volunteer cheated!");
				} else if(uniqueNumber == -2) {
					bw.write(" Bad magician!");
				} else {
					bw.write(" " + uniqueNumber);
				}
				bw.write("\n");
			}
			br.close();
			bw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
