package methodEmbedding.Magic_Trick.S.LYD52;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class namer {
	public static int examples;
	public static int [][] fi = new int[4][4];
	public static int [][] se = new int[4][4];
	public static int f;
	public static int s;
	public static String [] names;

	public static void main(String[] args) {
		try {
			String strLine1;
			BufferedReader in1 = new BufferedReader(new FileReader("A-small-attempt0.in"));

			strLine1 = in1.readLine();
			examples = Integer.parseInt(strLine1);

			for (int ex = 0; ex < examples; ex++) { // go through examples
				strLine1 = in1.readLine();
				f = Integer.parseInt(strLine1) - 1;
				for (int i = 0; i < 4; i++) {
					strLine1 = in1.readLine();
					String[] line = (strLine1.trim()).split("\\s+");
					for (int k = 0; k < 4; k++) {
						fi[i][k] = Integer.parseInt(line[k]);
					}
				}
				
				strLine1 = in1.readLine();
				s = Integer.parseInt(strLine1) - 1;
				for (int i = 0; i < 4; i++) {
					strLine1 = in1.readLine();
					String[] line = (strLine1.trim()).split("\\s+");
					for (int k = 0; k < 4; k++) {
						se[i][k] = Integer.parseInt(line[k]);
					}
				}				

				int matches = 0;
				int fi_match = 0;
				
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						if (fi[f][j] == se[s][k]) {
							if (matches == 0) fi_match = fi[f][j];
							matches++;
						}
					}
				}
				
				if (matches == 0) System.out.println ("Case #" + (ex+1) + ": Volunteer cheated!");
				else if (matches > 1) System.out.println ("Case #" + (ex+1) + ": Bad magician!");
				else System.out.println ("Case #" + (ex+1) + ": " + fi_match);


			}
			in1.close();
		} catch (Exception e) {
			System.err.println ("1. Error occurred. " + e.getMessage());
		}

	}

}


/*import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class namer {
	public static int examples;
	public static int [][] lengths;
	public static String [] names;

	public static void main(String[] args) {
		try {
			String strLine1;
			BufferedReader in1 = new BufferedReader(new FileReader("sssss"));

			strLine1 = in1.readLine();
			examples = Integer.parseInt(strLine1);
			names = new String[examples];
			lengths = new int[examples][2];

			for (int ex = 0; ex < examples; ex++) {
				strLine1 = in1.readLine();
				String[] line = (strLine1.trim()).split("\\s+");
				int slen = line[0].length();
				int num = Integer.parseInt(line[1]);
				int matches = 0;
				int combos = 0;
				String patternnn = "[bcdfghjklmnpqsrtvwxyz]";
				for (int i = 0; i < num - 1; i++) {
					patternnn += "[bcdfghjklmnpqsrtvwxyz]";
				}
				Pattern MY_PATTERN = Pattern.compile(patternnn);
				Matcher m;
				int previous = -1;
				for (int i = 0; i < slen; i++) {
					m = MY_PATTERN.matcher(line[0].substring(i));
					if (m.find()) {
						if (previous != line[0].substring(i).indexOf(m.group()) + i) {
							matches++;
							combos++; 
							previous = line[0].substring(i).indexOf(m.group()) + i;
						}

					}
				}
				for (int i = 0; i < matches; i++) {
					combos += (slen-num);
				}
				if (matches > 1) {
					combos--;
				}
				System.out.println ("Case #" + (ex+1) + ": " + combos);


			}
			in1.close();
		} catch (Exception e) {
			System.err.println ("1. Error occurred. " + e.getMessage());
		}

	}

}
 */
