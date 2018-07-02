package methodEmbedding.Speaking_in_Tongues.S.LYD1084;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Googlereese {

	final static char map[] = new char[] {
		'y',	/* a */
		'n',	/* b */
		'f',	/* c */
		'i',	/* d */
		'c',	/* e */
		'w',	/* f */
		'l',	/* g */
		'b',	/* h */
		'k',	/* i */
		'u',	/* j */
		'o',	/* k */
		'm',	/* l */
		'x',	/* m */
		's',	/* n */
		'e',	/* o */
		'v',	/* p */
		'z',	/* q */
		'p',	/* r */
		'd',	/* s */
		'r',	/* t */
		'j',	/* u */
		'g',	/* v */
		't',	/* w */
		'h',	/* x */
		'a',	/* y */
		'q',	/* z */
	};
	
	final static char reverse_map[] = new char[map.length];
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		/* Build reverse map */
		for(int i = 0; i < map.length; i++) {
			reverse_map[map[i] - 'a'] = (char) ('a' + i); 
		}
		/* Open the input file */
		if(args.length == 1) {
			File file = new File(args[0]);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			final int testCaseCount = Integer.parseInt(reader.readLine());
			for(int i = 0; i < testCaseCount; i++) {
				String line = reader.readLine();
				char characters[] = line.toCharArray();
				for(int j = 0; j < characters.length; j++) {
					if(Character.isLowerCase(characters[j])) {
						characters[j] = reverse_map[characters[j] - 'a'];
					}
				}
				System.out.println(String.format("Case #%d: %s", i + 1, new String(characters)));
			}
		}
	}
	
}
