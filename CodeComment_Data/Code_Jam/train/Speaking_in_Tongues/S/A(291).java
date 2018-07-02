package methodEmbedding.Speaking_in_Tongues.S.LYD518;

import java.util.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String[] aEng = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		String[] aGoo = {"y","n","f","i","c","w","l","b","k","u","o","m","x","s","e","v","z","p","d","r","j","g","t","h","a","q"," "};
		List<String> lEng = Arrays.asList(aEng);
		List<String> lGoo = Arrays.asList(aGoo);
		int T = in.nextInt();
		in.nextLine();
		for(int zz = 1; zz <= T;zz++){
			String textG =in.nextLine();
			String outputw = "";
			for (int i=0;i<textG.length();i++) {
				int index = lGoo.indexOf("" + textG.charAt(i));
				outputw += lEng.get(index);
			}
			
			System.out.format("Case #%d: %s\n", zz, outputw);
		}
	}
}
