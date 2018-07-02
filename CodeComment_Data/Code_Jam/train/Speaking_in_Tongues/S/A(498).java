package methodEmbedding.Speaking_in_Tongues.S.LYD625;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

	//a is googleresh
	static final String a = " zqejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
	//b is english
	static final String b = " qzourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//bug eliminator
		Map<Character,Character> m=new HashMap<Character, Character>();
		for(Character c: a.toCharArray()){
			if(m.containsKey(c)){
				if(! m.get(c).equals(b.charAt(a.indexOf(c))))
					System.err.println("english "+c+"previsously "+m.get(c)+", now its "+b.charAt(a.indexOf(c)));
				
			}else{
				m.put(c, b.charAt(a.indexOf(c)));
			}
		}
		
		

		Scanner in = new Scanner(new File("d:\\a.small.in"));// new Scanner(new
															// File("d:\\b.small.in"));
		// in = new Scanner(new File("d:\\Minimum Scalar Product-big.in"));

		int testCases = in.nextInt();
		in.nextLine();
		for (int cas = 1; cas <= testCases; cas++) {
			String line=in.nextLine();
			String ans="";
			
			for(int i=0;i<line.length();i++){
				if(a.indexOf(line.charAt(i))==-1){
					System.err.println(line.charAt(i));
				}
				ans+=b.charAt(a.indexOf(line.charAt(i)));
			}
			
			System.out.printf("Case #%d: %s\n", cas, ans);
		}

	}

}
