package methodEmbedding.Speaking_in_Tongues.S.LYD810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Googlerease {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String s = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
		String u = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
		HashMap<Character, Character> hash = new HashMap<Character, Character>();
		for(int i=0; i<s.length(); i++){
			if(!hash.containsKey(s.charAt(i))){
				hash.put(s.charAt(i), u.charAt(i));
			}
		}
		hash.put('z', 'q');
		hash.put('q', 'z');
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(read.readLine());
		String tmp= "";
		String res= "";
		int counter =1;
		while(lines >0){
			System.out.print("Case #"+counter+": ");
			tmp = read.readLine();
			for(int i=0; i<tmp.length(); i++){
				if(tmp.charAt(i) != ' ')
					res += hash.get(tmp.charAt(i));
				else
					res += " ";
			}
			System.out.println(res);
			res ="";
			counter++;
			lines--;
		}
		
	}

}
