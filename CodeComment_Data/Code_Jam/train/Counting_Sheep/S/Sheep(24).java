package methodEmbedding.Counting_Sheep.S.LYD896;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Sheep {
	public static void main(String[] args) {
		BufferedReader bufReader = null;
		BufferedWriter bufWriter = null;
		try {
			InputStreamReader reader = new InputStreamReader(
					new FileInputStream("A-small-attempt0.in"), "UTF-8");
			bufReader = new BufferedReader(reader);
			int testCases = Integer.parseInt(bufReader.readLine());
			File file = new File("A-small-attempt0.out");
			OutputStreamWriter writer = new OutputStreamWriter(
					new FileOutputStream(file), "UTF-8");
			bufWriter = new BufferedWriter(writer);
			for (int i = 0; i < testCases; i++) {
				Set<Character> outputSet = new HashSet<Character>();
				String input = bufReader.readLine();
				if (i != 0) {
					bufWriter.newLine();
				}
				int loopInput = 0;
				for (int counter = 1; outputSet.size() < 10; counter++) {
					loopInput = Integer.parseInt(input) * counter;
					if (loopInput == 0) {
						break;
					}
					for (Character indChar : (loopInput + "").toCharArray()) {
						outputSet.add(indChar);
					}
				}
				if (loopInput == 0) {
					bufWriter.write("Case #" + i + ": INSOMNIA");
				} else {
					bufWriter.write("Case #" + i + ": " + loopInput);
				}
			}
			System.out.println("Completed!!!:)");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
		} catch (IOException e) {
			System.out.println("can not write/read file");
		} catch (NumberFormatException e) {
			System.out.println("wrong input");
		} finally {
			if (bufReader != null) {
				try {
					bufReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bufWriter != null) {
				try {
					bufWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
