package methodEmbedding.Speaking_in_Tongues.S.LYD62;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;

public class A2012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] inputchars = { 'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u',
				'o', 'm', 'x', 's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g',
				't', 'h', 'a', 'q' };
		char[] outputchars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z' };

		ArrayList<Character> inputlist = new ArrayList<Character>();
		ArrayList<Character> outputlist = new ArrayList<Character>();

		try {

			for (int i = 0; i < 26; i++) {
				inputlist.add(new Character(inputchars[i]));
				outputlist.add(new Character(outputchars[i]));
			}
			FileReader fr = new FileReader(
					"C:\\work\\mayur\\work\\gcjam\\Ainputsample.txt");
			FileWriter fw = new FileWriter(
					"C:\\work\\mayur\\work\\gcjam\\Aoutputsample.txt");

			char c;
			int line = 1, linetotal = 30;
			fr.read();
			fr.read();
			fr.read();
			fr.read();
			fw.write("Case #" + line + ": ");
			int index = -1;
			while (line <= linetotal) {
				c = (char) fr.read();
				if (c == '\n') {
				} else if (c == '\r') {
					line++;
					if (line <= linetotal)
						fw.write("\r\nCase #" + line + ": ");
				} else if (c == -1) {
					line++;
					break;
				} else {
					index = (inputlist.indexOf(new Character(c)));
					if (index == -1)
						fw.write(c);
					else
						fw.write(outputlist.get(index).charValue());
				}
				fw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
