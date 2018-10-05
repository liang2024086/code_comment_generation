package methodEmbedding.Speaking_in_Tongues.S.LYD1294;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainProblem1 {

	static String english = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up",
			grese = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";

	static TreeMap<Character, Character> gToE = new TreeMap<Character, Character>();

	public static void main(String[] args) {
		
		gToE.put('q', 'z');
		gToE.put('z', 'q');//Find by reduction
		for (int i = 0; i < grese.length(); i++) {
			gToE.put(grese.charAt(i), english.charAt(i));
		}
		TreeSet<Character> set = new TreeSet<Character>();
		set.addAll(gToE.values());
//		for (Character aChar : gToE.keySet()) {
//			System.out.println(aChar+ " ->" +gToE.get(aChar));
//		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			int numCases = Integer.parseInt(br.readLine());
			String cases[] = new String[numCases];
			String response[] = new String[numCases];
			for (int i = 0; i < numCases; i++) {
				cases[i] = br.readLine();
				response[i] = "";
				for (int j = 0; j < cases[i].length(); j++) {
					response[i]+= gToE.get(cases[i].charAt(j));
				}
			}
			for (int i = 0; i < response.length; i++) {
				System.out.println("Case #"+(i+1)+": "+response[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
