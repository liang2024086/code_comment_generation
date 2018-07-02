package methodEmbedding.Speaking_in_Tongues.S.LYD1678;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Googlerese {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ?????????????????\?b?h?E?X?^?u
		Googlerese g = new Googlerese();
		Map<Character, Character> map = new HashMap<Character, Character>();
		String samplein1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String sampleout1 = "our language is impossible to understand";
		String samplein2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String sampleout2 = "there are twenty six factorial possibilities";
		String samplein3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String sampleout3 = "so it is okay if you want to just give up";
		for(int i=0; i<3; ++i){
			for(int j=0; j<samplein1.length(); ++j){
				map.put(samplein1.charAt(j), sampleout1.charAt(j));
			}
			for(int j=0; j<samplein2.length(); ++j){
				map.put(samplein2.charAt(j), sampleout2.charAt(j));
			}
			for(int j=0; j<samplein3.length(); ++j){
				map.put(samplein3.charAt(j), sampleout3.charAt(j));
			}
		}
		// in hand
		map.put('q', 'z');
		map.put('z', 'q');
		map.remove(' ');
		// end
		try {
			FileReader fr = new FileReader("A-small-attempt1.in");
			BufferedReader br = new BufferedReader(fr);
			String lineNum;
			lineNum = br.readLine();
			for(int i=1; i<=Integer.parseInt(lineNum); ++i){
				String line = br.readLine();
				//String out = g.solve(line);
				for(char c : map.keySet()){
					line = line.replace(c, (char)(map.get(c)-('a'-'A')));
				}
				for(char c='A'; c<='Z'; ++c) {
					line = line.replace(c, (char)(c + 'a'-'A'));
				}
				System.out.println("Case #" + i + ": " + line);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
