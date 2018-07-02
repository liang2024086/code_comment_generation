package methodEmbedding.Speaking_in_Tongues.S.LYD982;

import java.util.*;


public class CodeJamA {
	
	private static int[] mapping = {24,7,4,18,14,2,21,23,3,20,8,6,11,1,10,17,25,19,13,22,9,15,5,12,0,16};
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		int i = 1;
		while (scan.hasNextLine()) {
			System.out.printf("Case #%d: ", i);
			String line = scan.nextLine();
			char[] str = line.toCharArray();
			for (int j = 0; j < str.length; j++) {
				if (str[j] >= 'a' && str[j] <= 'z')
					str[j] = (char)(mapping[str[j] - 'a'] + 'a');
			}
			System.out.println(new String(str));
			i++;
		}
	}
	
}
