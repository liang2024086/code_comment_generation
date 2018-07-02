package methodEmbedding.Revenge_of_the_Pancakes.S.LYD385;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public class CodeJamIO {
	
	private static final String FOLDER = "gcj16/q/";

	public static void main(String[] args) throws FileNotFoundException {
		
		String input = FOLDER + args[0] + ".small";
		String output = input + ".out.txt";
		
		PrintWriter pw = new PrintWriter(new File(output));
		Scanner in = new Scanner(new File(input));
		Integer inputs = Integer.parseInt(in.nextLine());
		for(int i=0; i<inputs; i++) {
			String line = in.nextLine();
			String out = null;
			
			switch(args[0]) {
			case "1":
				out = new CountingSheeps().get(line);
				break;
			case "2":
				out = new RevengePancakes().get(line);
			}
			
			pw.println("Case #"+(i+1)+": "+out);
		}
		in.close();
		pw.close();
		
	}

}
