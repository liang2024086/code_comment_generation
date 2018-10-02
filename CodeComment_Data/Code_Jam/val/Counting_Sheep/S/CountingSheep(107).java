package methodEmbedding.Counting_Sheep.S.LYD737;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("infile/A-small-attempt2.in"));
		FileWriter fw = new FileWriter("infile/A-small-attempt2.out");

		int T = new Integer(in.readLine());

		for (int cases = 1; cases <= T; cases++) {
			Integer N = new Integer(in.readLine());
			int i = 0;

			Set<String> allDigits = new HashSet<String>();
			allDigits.add(new String("1"));
			allDigits.add(new String("2"));
			allDigits.add(new String("3"));
			allDigits.add(new String("4"));
			allDigits.add(new String("5"));
			allDigits.add(new String("6"));
			allDigits.add(new String("7"));
			allDigits.add(new String("8"));
			allDigits.add(new String("9"));
			allDigits.add(new String("0"));

			while (true) {
				String strN = String.valueOf(++i * N);
				if(strN.equals("0") || strN.startsWith("-"))
				{
					fw.write("Case #"+cases+": INSOMNIA"+"\n");
					break;
				}
				Iterator<String> iterator = allDigits.iterator();

				// check values
				while (iterator.hasNext()) {
					String digit = iterator.next();
					if (strN.contains(digit)) {
						iterator.remove();
					}
				}

				if (allDigits.size() == 0) {
					fw.write("Case #"+cases+": " + strN+"\n");
					break;
				} 
			}

		}
		in.close();

		fw.flush();
		fw.close();
	}

}
