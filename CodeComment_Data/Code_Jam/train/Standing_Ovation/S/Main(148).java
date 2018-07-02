package methodEmbedding.Standing_Ovation.S.LYD1404;


import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		String text = new String(Files.readAllBytes(Paths.get("inputfile.txt")), StandardCharsets.UTF_8);
		PrintStream out = null;
		try {
			out = new PrintStream(new File("outputfile.txt"));
			ArrayList<Integer> solutions = Ovation.parseOvation(text).solve();
			for (int i=0; i<solutions.size(); i++) {
				out.println("Case #" + (i+1) + ": " + solutions.get(i));
			}
			System.out.println("done");
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
