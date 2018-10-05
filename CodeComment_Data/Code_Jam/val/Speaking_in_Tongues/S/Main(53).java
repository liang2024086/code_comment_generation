package methodEmbedding.Speaking_in_Tongues.S.LYD1304;

import java.io.IOException;
import java.text.ParseException;

import tr0llhoehle.cakemix.utility.googleCodeJam.IOManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length >= 1) {
			IOManager<SITSolver, SITProblem> io = new IOManager<SITSolver, SITProblem>(
					new SITSolver(),
					(Class<SITProblem>) new SITProblem().getClass());
			try {
				io.start(args[0]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
