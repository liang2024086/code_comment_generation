package methodEmbedding.Speaking_in_Tongues.S.LYD1037;

import java.util.*;
import java.io.*;

public class a
{
    public static void main(String argv[])throws Exception
    {
	Scanner sc = new Scanner(System.in);
	PrintStream pt = System.out;

	int T = sc.nextInt();
	sc.nextLine();
	for(int t = 1; t <= T; t++)
	{
	    String input = sc.nextLine();
	    System.out.printf("Case #%d: ", t);

	    for(int i = 0; i < input.length(); i++)
		if('a' <= input.charAt(i) && input.charAt(i) <= 'z')
		    pt.printf("%c", "yhesocvxduiglbkrztnwjpfmaq".charAt(input.charAt(i) - 'a'));
		else
		    pt.printf("%c", input.charAt(i));
	    pt.printf("\n");




	}
    }

}
