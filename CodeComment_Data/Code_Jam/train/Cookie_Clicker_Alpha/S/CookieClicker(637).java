package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1352;

import java.io.File;


public class CookieClicker {

	public static void main(String[] args) throws Exception {
		String filename = args[0];
		File file = new File(filename);
		InputReader reader = new InputReader(file);
		reader.processResults();
	}

}
