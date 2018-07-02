package methodEmbedding.Speaking_in_Tongues.S.LYD34;

import java.util.*;

public class a {
	public static void main(String[] args){
		//char [] english ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String english="abcdefghijklmnopqrstuvwxyz";
		String googlerese="ynficwlbkuomxsevzpdrjgthaq";
		Scanner in = new Scanner(System.in);
		int numOfLines = new Integer(in.nextLine());
		for (int i= 1; i<=numOfLines; i++){
			String s = in.nextLine();
			String transString = "";
			for (char c :s.toCharArray())
			{
				if (c==' ') transString=transString+" ";
				else transString=transString+english.charAt(googlerese.indexOf(c));
			}		
		System.out.format("Case #%d: %s\n", i, transString);
		}
		return;
	}
}
