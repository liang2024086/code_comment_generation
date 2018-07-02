package methodEmbedding.Counting_Sheep.S.LYD986;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class codeJam1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Brenton\\Downloads\\A-small-attempt2.in");
	    File outFile = new File("C:\\Users\\Brenton\\Downloads\\A-small-attempt2.out");
	    
	    BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	    int lines = Integer.parseInt(br.readLine());

		for (int x = 1; x <= lines; x++) {
			int n = Integer.parseInt(br.readLine());

			if (n != 0) {
				HashSet<Character> digitsSeen = new HashSet<Character>();

				int i = 1;
				while (true) {
					int numberInt = n * i;
					char[] number = Integer.toString(numberInt).toCharArray();
					
					for (char c : number) {
						digitsSeen.add(c);
					}
					
					if (digitsSeen.size() == 10) {
						bw.write("Case #" + x + ": " + numberInt + "\n");
						break;
					}
					
					i++;
				}
			} else {
				bw.write("Case #" + x + ": INSOMNIA\n");
			}
		}
		
	    br.close();
	    bw.close();
	}
}
