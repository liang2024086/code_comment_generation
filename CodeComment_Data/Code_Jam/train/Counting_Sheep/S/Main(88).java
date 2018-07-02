package methodEmbedding.Counting_Sheep.S.LYD945;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    try
	    {
		    Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		    ArrayList<String> output = new ArrayList<String>();

		    int trials = scanner.nextInt();
		    for (int i = 1; i <= trials; i++)
		    {
			    String caseOutput = "Case #" + i + ": ";

			    int n = scanner.nextInt();

			    if (n == 0)
			    {
				    caseOutput = caseOutput + "INSOMNIA";
			    }
			    else
			    {

				    boolean[] foundDigit = new boolean[10];
				    boolean foundAll;
				    int accum = 0;
				    do
				    {
					    accum += n;
					    int accumCopy = accum;
					    while (accumCopy >= 1)
					    {
						    foundDigit[accumCopy % 10] = true;
						    accumCopy /= 10;
					    }

					    foundAll = true;
					    for (boolean b : foundDigit)
					    {
						    if (!b)
						    {
							    foundAll = false;
							    break;
						    }
					    }
				    } while (!foundAll);

				    caseOutput = caseOutput + accum;
			    }

				output.add(caseOutput);
		    }

		    Files.write(Paths.get("A-small-attempt0.out"), output, Charset.forName("UTF-8"));
	    }
	    catch (Exception e)
	    {
		    e.printStackTrace();
	    }
    }
}
