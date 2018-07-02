package methodEmbedding.Speaking_in_Tongues.S.LYD718;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;


public class Solver {
	
	protected final static String IN_FILE = "in";
	protected final static String OUT_FILE = "out";
	protected final static String OUT_PREFIX = "Case #$: ";
	protected BufferedReader in;
	protected int cases;
	

	
	
	public Solver() throws Throwable {
		File inFile = new File(IN_FILE);
		if (!inFile.exists()) {
			throw new RuntimeException();
		}
		in = new BufferedReader(new FileReader(inFile));
		cases = Integer.parseInt(in.readLine());
		
		
		File outFile = new File(OUT_FILE);
		if (outFile.exists()) {
			outFile.delete();
		}
		outFile.createNewFile();
		System.setOut(new PrintStream(outFile) );

		for (int i = 0; i < cases; i++) {
			ProblemCase c = new SpeakingTongusProblemCase(in);
			System.out.println(OUT_PREFIX.replaceAll("[$]", (new Integer(i+1)).toString()) + c.getResult());
		}
	}
	
	public static void main(String[] args) throws Throwable {
		new Solver();
	}
}
