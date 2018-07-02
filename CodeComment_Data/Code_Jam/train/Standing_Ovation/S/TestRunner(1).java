package methodEmbedding.Standing_Ovation.S.LYD772;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

public class TestRunner {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("I need exactly on argument");
			return;
		}
		Path fileName = Paths.get(args[0]);
		Consumer<String> c = new Ovation(System.out);
		try {
			Files.lines(fileName).forEachOrdered(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
