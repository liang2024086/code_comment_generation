package methodEmbedding.Revenge_of_the_Pancakes.S.LYD695;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {

	    try
	    {
		    Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		    ArrayList<String> output = new ArrayList<String>();

		    int trials = scanner.nextInt();
		    scanner.nextLine();
		    for (int i = 1; i <= trials; i++)
		    {
			    String caseOutput = "Case #" + i + ": ";

			    int flips = 0;
			    String pancakes = scanner.nextLine();
				char expected = pancakes.charAt(0);

			    for (int index = 0; index < pancakes.length(); index++)
			    {
				    if (pancakes.charAt(index) != expected)
				    {
					    expected = pancakes.charAt(index);
					    flips++;
				    }
			    }

			    if (pancakes.charAt(pancakes.length()-1) == '-') {flips++;}

			    caseOutput = caseOutput + flips;
				output.add(caseOutput);
//			    System.out.println(caseOutput);
		    }

		    Files.write(Paths.get("B-small-attempt0.out"), output, Charset.forName("UTF-8"));
	    }
	    catch (Exception e)
	    {
		    e.printStackTrace();
	    }
    }
}
