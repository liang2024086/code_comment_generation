package methodEmbedding.Magic_Trick.S.LYD1330;

import java.util.Scanner;

public class MagicTrick
{
    private static String MULTIPLE = "Bad magician!";
    private static String CHEATED = "Volunteer cheated!";

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int n = Integer.parseInt(in.nextLine());
	for (int i = 0; i < n; ++i)
	{
	    System.out.printf("Case #%d: ", (i+1));
	    int rowPrev = Integer.parseInt(in.nextLine());
	    String[] candidatesPrev = new String[4];
	    for (int j = 1; j <= 4; ++j)
	    {
		if (rowPrev == j)
		    candidatesPrev = in.nextLine().split(" ");
		else
		    in.nextLine();
	    }
	    int rowPost = Integer.parseInt(in.nextLine());
	    String[] candidatesPost = new String[4];
	    for (int j = 1; j <= 4; ++j)
	    {
		if (rowPost == j)
		    candidatesPost = in.nextLine().split(" ");
		else
		    in.nextLine();
	    }
	    String answer = CHEATED;
	    for (int j = 0; j < 4; ++j)
		for (int k = 0; k < 4; ++k)
		    if (candidatesPrev[j].equals(candidatesPost[k]))
			if (!answer.equals(CHEATED))
			    answer = MULTIPLE;
			else
			    answer = candidatesPrev[j];
	    System.out.println(answer);
	}
    }
}
