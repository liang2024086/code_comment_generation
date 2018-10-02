package methodEmbedding.Magic_Trick.S.LYD2105;

import java.io.File;


public class MagicTrick {

	public static void main(String[] args) throws Exception {
		String filename = args[0];
		File file = new File(filename);
		InputReader reader = new InputReader(file);
		reader.processResults();
	}

}
