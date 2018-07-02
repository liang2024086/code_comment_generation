package methodEmbedding.Speaking_in_Tongues.S.LYD546;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class SpeakingInTongues {

	public static void main (String args[]) throws Exception{
		
		BufferedReader reader = new BufferedReader(new FileReader("bin\\qualification\\A-small-attempt0.in") );
		BufferedWriter writer = new BufferedWriter(new FileWriter("bin\\qualification\\A-small.out"));
		
		int tc = Integer.valueOf( reader.readLine() );
		String[] tokens;
		StringBuffer trans;		
		HashMap<Character, Character> dict = new HashMap<Character, Character>();
		dict.put('a', 'y'); dict.put('b', 'h'); dict.put('c', 'e'); dict.put('d', 's'); dict.put('e', 'o'); 
		dict.put('f', 'c'); dict.put('g', 'v'); dict.put('h', 'x'); dict.put('i', 'd'); dict.put('j', 'u');
		dict.put('k', 'i'); dict.put('l', 'g'); dict.put('m', 'l'); dict.put('n', 'b'); dict.put('o', 'k');
		dict.put('p', 'r'); dict.put('q', 'z'); dict.put('r', 't'); dict.put('s', 'n'); dict.put('t', 'w'); 
		dict.put('u', 'j'); dict.put('v', 'p'); dict.put('w', 'f'); dict.put('x', 'm'); dict.put('y', 'a');
		dict.put('z', 'q');
		
		for(int it = 0; it < tc; it++){
			tokens = reader.readLine().split(" ");
			trans = new StringBuffer();
			for (String str : tokens){
				for (char c : str.toCharArray()){
					trans.append( dict.get(c) );
				}
				trans.append(" ");
			}
				
			writer.write(String.format("Case #%d: %s", it+1, trans.toString() ));
			writer.newLine();
		}
		writer.close();
		reader.close();
		
	}
}
