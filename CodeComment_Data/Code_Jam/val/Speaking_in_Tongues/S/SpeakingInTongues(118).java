package methodEmbedding.Speaking_in_Tongues.S.LYD1358;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			BufferedReader r = new BufferedReader(
					new FileReader("mapping2.txt"));
			int a;

			SortedMap<Integer, Integer> mapping = new TreeMap<Integer, Integer>();

			int key;
			while ((key = r.read()) != -1) {
				mapping.put(key, r.read());
			}

			BufferedReader in = new BufferedReader(new FileReader(
					"speakingintongues_input.txt"));

			int cases = Integer.parseInt(in.readLine());

			Writer w = new FileWriter("speakingintongues_output.txt");
			for (int i = 1; i <= cases; i++) {
				String line = in.readLine();
				Reader lineReader = new BufferedReader(new StringReader(line));
				w.write("Case #" + i + ": ");

				int c;
				while ((c = lineReader.read()) != -1) {
					Integer val;
					if ((val = mapping.get(new Integer(c))) != null)
						w.write((char) val.intValue());
					else
						w.write((char) c);
				}

				w.write("\n");
			}

			w.close();
			in.close();
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
