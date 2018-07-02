package methodEmbedding.Speaking_in_Tongues.S.LYD1398;

import java.util.*;
import static java.lang.Math.*;

public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String [] arr = {"ay","bh","ce","ds","eo","fc","gv","hx","id",
						 "ju","ki","lg","ml","nb","ok","pr","qz","rt",
						 "sn","tw","uj","vp","wf","xm","ya","zq"};
		
		int T = Integer.parseInt(in.nextLine());
		for(int i = 0 ; i < T ; i++){
			String result = "";
			String inp = in.nextLine();
			int len = inp.length();
			
			for(int ll = 0 ; ll < len ; ll++){
				if(inp.charAt(ll)== ' ')
					result+= " ";
				else{
					int aa = inp.charAt(ll);
					aa = aa - 97;
					result += arr[aa].charAt(1);
				}
			}
			
			System.out.format("Case #%d: %s\n", i+1, result);
		}
	}
}
