package methodEmbedding.Speaking_in_Tongues.S.LYD203;

import java.io.*;

public class Tongues {
    public static void main(String[] args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String map = "yhesocvxduiglbkrztnwjpfmaq";

	int T = Integer.parseInt(in.readLine());
	String s;
	for (int i = 0; i < T; i++) {
	    s = in.readLine();
	    System.out.print("Case #" + (i+1) + ": ");
	    for (int j = 0; j < s.length(); j++) {
		if (s.charAt(j) != ' ')
		    System.out.print(map.charAt((int)(s.charAt(j) - 'a')));
		else
		    System.out.print(' ');
	    }
	    System.out.println();
	}
    }
}
