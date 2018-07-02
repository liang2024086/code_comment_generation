package methodEmbedding.Speaking_in_Tongues.S.LYD854;

import java.util.*;

public class googleRese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> mMap = new HashMap();
		mMap.put(" "," ");
		mMap.put("a", "y");
		mMap.put("b", "h");
		mMap.put("c", "e");
		mMap.put("d", "s");
		mMap.put("e", "o");
		mMap.put("f", "c");
		mMap.put("g", "v");
		mMap.put("h", "x");
		mMap.put("i", "d");
		mMap.put("j", "u");
		mMap.put("k", "i");
		mMap.put("l", "g");
		mMap.put("m", "l");
		mMap.put("n", "b");
		mMap.put("o", "k");
		mMap.put("p", "r");
		mMap.put("q", "z");
		mMap.put("r", "t");
		mMap.put("s", "n");
		mMap.put("t", "w");
		mMap.put("u", "j");
		mMap.put("v", "p");
		mMap.put("w", "f");
		mMap.put("x", "m");
		mMap.put("y", "a");
		mMap.put("z", "q");
				
		Scanner scan = new Scanner(System.in);
		int numStrings = scan.nextInt();
		scan.nextLine();
		for(int i = 1; i <= numStrings; i++){
			String temp = scan.nextLine();
			// System.out.println("Printing line: " + temp );
			// System.out.println("Length is " + temp.length());
			
			String target = new String();
			
			for(int j = 1; j <= temp.length(); j++){
				
				target = target.concat(mMap.get(temp.substring(j-1,j)));
				
			}
			
			System.out.format("Case #%d: %s", i, target.concat("\n"));
		}
		
	}

}
