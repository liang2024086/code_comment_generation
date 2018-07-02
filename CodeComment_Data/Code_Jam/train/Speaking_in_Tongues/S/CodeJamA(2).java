package methodEmbedding.Speaking_in_Tongues.S.LYD1617;

/**
 * @author Juan Sebastian Beltran Rojas
 * @mail jsbeltran.valhalla@gmail.com
 * @veredict No enviado
 * @problemId CodeJamA.java
 * @problemName CodeJamA.java
 * @judge http://www.spoj.pl | http://uva.onlinejudge.org/ | http://livearchive.onlinejudge.org/
 * @category ---
 * @level ???
 * @date 13/04/2012
 **/
import java.io.*;
import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
public class CodeJamA {
	public static void main(String args[]) throws Throwable {
		System.setOut(new PrintStream("A.out"));
		char[] letras=new char[]{'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		StringBuilder sb = new StringBuilder();
		for (int t=0,T=parseInt(in.readLine().trim());t++<T;) {
			sb.append("Case #"+t+": ");
			char[] ln=in.readLine().toCharArray();
			String s="";
			for(int i=0;i<ln.length;i++)
				if(Character.isLetter(ln[i])){
					int j=0;
					for(;j<letras.length;j++)if(letras[j]==ln[i])break;
					s+=(char)(j+'a');
				}
				else s+=ln[i];
			sb.append(s+"\n");
		}
		System.out.print(new String(sb));
	}
}
