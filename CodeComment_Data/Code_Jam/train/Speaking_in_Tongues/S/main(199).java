package methodEmbedding.Speaking_in_Tongues.S.LYD1262;

import java.io.FileNotFoundException;


public class main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Parser parser = new Parser(args[0]);
		Googlerese googlerese = new Googlerese(parser.parse(1));
		googlerese.solve();
	}

}
