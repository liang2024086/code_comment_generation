package methodEmbedding.Speaking_in_Tongues.S.LYD636;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Hashtable;

public class A {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Hashtable<Byte, Byte> table = new Hashtable<Byte, Byte>(27);
		table.put((byte) 'a', (byte) 'y');
		table.put((byte) 'b', (byte) 'h');
		table.put((byte) 'c', (byte) 'e');
		table.put((byte) 'd', (byte) 's');
		table.put((byte) 'e', (byte) 'o');
		table.put((byte) 'f', (byte) 'c');
		table.put((byte) 'g', (byte) 'v');
		table.put((byte) 'h', (byte) 'x');
		table.put((byte) 'i', (byte) 'd');
		table.put((byte) 'j', (byte) 'u');
		table.put((byte) 'k', (byte) 'i');
		table.put((byte) 'l', (byte) 'g');
		table.put((byte) 'm', (byte) 'l');
		table.put((byte) 'n', (byte) 'b');
		table.put((byte) 'o', (byte) 'k');
		table.put((byte) 'p', (byte) 'r');
		table.put((byte) 'q', (byte) 'z');
		table.put((byte) 'r', (byte) 't');
		table.put((byte) 's', (byte) 'n');
		table.put((byte) 't', (byte) 'w');
		table.put((byte) 'u', (byte) 'j');
		table.put((byte) 'v', (byte) 'p');
		table.put((byte) 'w', (byte) 'f');
		table.put((byte) 'x', (byte) 'm');
		table.put((byte) 'y', (byte) 'a');
		table.put((byte) 'z', (byte) 'q');
		table.put((byte) ' ', (byte) ' ');
		BufferedReader read = new BufferedReader(new InputStreamReader(
				new FileInputStream(
						"C:/Users/Ortiga/Downloads/A-small-attempt2.in")));
		byte length = Byte.parseByte(read.readLine());

		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("C:/Users/Ortiga/Downloads/output.txt")));
		for (int i = 0; i < length; i++) {
			String red = read.readLine();
			String rit = "Case #" + (i + 1) + ": ";
			for (int j = 0; j < red.length(); j++)
				rit += ((char) table.get((byte) red.charAt(j)).byteValue() + "");
			write.write(rit);
			if (i < length - 1)
				write.newLine();
			// System.out.println(red);
			// System.out.println(rit);
		}
		read.close();
		write.close();
	}
}
