package methodEmbedding.Counting_Sheep.S.LYD454;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sheep {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("input.in"));
		String input = null;
		String count = null;
		FileWriter fw = new FileWriter("output.out");  
		count = bf.readLine();
		for (int i = 0; i < Integer.parseInt(count); i++) {
			ArrayList<Boolean> b1 = new ArrayList<Boolean>();
			for (int i1 = 0 ; i1 < 10; i1++) b1.add(false);
			input = bf.readLine();
			if (input.equals("0")) {
				fw.write("Case #" + (i + 1) + ": INSOMNIA\n");
				continue;
			}
			else {
				Integer origin = Integer.parseInt(input);
				Integer now = origin;
				while (true) {
					Integer now1 = now;
					while (now1 > 0) {
						int te = now1 % 10;
						now1 /= 10;
						b1.set(te, true);
					}
					int i1;
					for (i1 = 0; i1 < 10; i1++)
						if (!b1.get(i1)) break;
					if (i1 == 10) break;
					now += origin;
				}
				fw.write("Case #" + (i + 1) + ": " + now + "\n");
			}
		}
		bf.close();
		fw.close();
	}

}
