package methodEmbedding.Speaking_in_Tongues.S.LYD53;

//import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SpeakingInTongues {

	public static void main(String[] args) throws NumberFormatException, IOException {

		char[] googlerese = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
		char[] english = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up".toCharArray();
		Map<Character, Character> map = new TreeMap<Character, Character>();
		map.put('q', 'z');
		map.put('z', 'q');
		for(int i = 0; i < googlerese.length; i++){
			map.put(googlerese[i], english[i]);
		}
		//Character[] array = {};
		//Set<Character> ch = map.keySet();
		//for(Character c : ch){
		//	System.out.println(c+"->"+map.get(c));
		//}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String line;
		char[] array;
		for(int i = 1; i <= n; i++){
			line = br.readLine();
			System.out.print("Case #"+i+": ");
			array = line.toCharArray();
			for(char c : array){
				System.out.print(map.get(c));
			}
			System.out.println();
		}
				
	}

}
