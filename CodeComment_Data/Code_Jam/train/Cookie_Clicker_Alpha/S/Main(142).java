package methodEmbedding.Cookie_Clicker_Alpha.S.LYD959;

/**
 *  Created on  : 12/04/2014
 *  Author      : M. en C. Javier Silva P??rez - [javier]
 *  Description :
 *  	
 */

import com.keysd.googlecodejam.qualification.CookieClickerAlpha;
import com.keysd.googlecodejam.qualification.MagicTrick;


/**
 * Main tester class for the Google Code Jam 2014 problems, in this class the
 * user could select which problem to solve indicating the input file and the
 * problem key as parameters
 * 
 * @author M. en C. Javier Silva P??rez - [javier]
 * @since 13/04/2013
 * @version 1.0
 */
public class Main {

	/**
	 * Key for problem
	 */
	public static final int PROBLEM_MAGIC_TRICK= 0;

	/**
	 * Key for problem
	 */
	public static final int PROBLEM_COOCIE_CLICKER_ALPHA= 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer problemKey = PROBLEM_COOCIE_CLICKER_ALPHA;

		String inputFileName = "B-small-attempt0.in";
		String outputFileName = inputFileName.replace(".in", ".out");

		Problem problem;
		switch (problemKey) {
		case PROBLEM_MAGIC_TRICK:
			problem = new MagicTrick(inputFileName, outputFileName);

			break;

		case PROBLEM_COOCIE_CLICKER_ALPHA:
			problem = new CookieClickerAlpha(inputFileName, outputFileName);
			break;

		default:
			problem = new MagicTrick(inputFileName, outputFileName);
			break;
		}

		problem.execute();

	}

}
