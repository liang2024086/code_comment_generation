package methodEmbedding.Speaking_in_Tongues.S.LYD1210;

import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[]args)throws Exception{
		Scanner in = new Scanner (new File("input.txt"));
		PrintWriter out = new PrintWriter (new File("output.txt"));
			int n = in.nextInt();
			String s = in.nextLine();
			for (int i = 0; i<n; i++){
				s = in.nextLine();
				String ans = "Case #"+(i+1)+": ";
				for (int j = 0; j<s.length(); j++){
					if (s.charAt(j)=='a') ans+="y";
					if (s.charAt(j)=='b') ans+="h";
					if (s.charAt(j)=='c') ans+="e";//
					if (s.charAt(j)=='d') ans+="s";
					if (s.charAt(j)=='e') ans+="o";
					if (s.charAt(j)=='f') ans+="c";//
					if (s.charAt(j)=='g') ans+="v";
					if (s.charAt(j)=='h') ans+="x";
					if (s.charAt(j)=='i') ans+="d";//
					if (s.charAt(j)=='j') ans+="u";
					if (s.charAt(j)=='k') ans+="i";
					if (s.charAt(j)=='l') ans+="g";// 
					if (s.charAt(j)=='m') ans+="l";
					if (s.charAt(j)=='n') ans+="b";//
					if (s.charAt(j)=='o') ans+="k";
					if (s.charAt(j)=='p') ans+="r";
					if (s.charAt(j)=='q') ans+="z"; ////!!!!!!!
					if (s.charAt(j)=='r') ans+="t";
					if (s.charAt(j)=='s') ans+="n";
					if (s.charAt(j)=='t') ans+="w";
					if (s.charAt(j)=='u') ans+="j";
					if (s.charAt(j)=='v') ans+="p";
					if (s.charAt(j)=='w') ans+="f";//
					if (s.charAt(j)=='x') ans+="m";
					if (s.charAt(j)=='y') ans+="a";//
					if (s.charAt(j)=='z') ans+="q"; //////!!!!!
					if (s.charAt(j)==' ') ans+=" "; //////!!!!!
				}
				out.println(ans);
			}
		out.close();
	}
}
