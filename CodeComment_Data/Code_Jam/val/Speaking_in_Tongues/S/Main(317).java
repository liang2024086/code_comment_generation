package methodEmbedding.Speaking_in_Tongues.S.LYD47;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;


public class Main {

	
	static String[] base_start = new String[] {
			"ejp mysljylc kd kxveddknmc re jsicpdrysi",
			"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
			"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
	static String[] base_end = new String[]{
			"our language is impossible to understand",
			"there are twenty six factorial possibilities",
			"so it is okay if you want to just give up"};
	
	static Map<Character, Character> mastermap = new TreeMap<Character, Character>();
	static{
		mastermap.put('a','y');
		mastermap.put('o','e');
		mastermap.put('z','q');
		mastermap.put('q','z');
		for(int i = 0; i < base_start.length; i++){
			assert(base_start[i].length()==base_end[i].length());
			for(int k = 0; k < base_start[i].length(); k++){
				if(Character.isLetter(base_start[i].charAt(k))){
					Character z = mastermap.put(base_start[i].charAt(k), base_end[i].charAt(k));
					assert(z == null || z.equals(base_end[i].charAt(k)));
				}
			}
		}
		
	}
	
	private static final String CASENUM = "Case #";
	private static final String COLON_SPACE = ": ";
	
	public static void main(String[] args) throws Exception {
		System.out.println("Map size is: "+mastermap.size());
		for(Character c : mastermap.keySet()){
			System.out.println(c +"->"+mastermap.get(c));
		}
		List<String> lines = FileUtils.readLines(new File(args[0]), "UTF-8");
		List<String> oLines = new ArrayList<String>(30);
		for(int i=1; i < lines.size(); i++){
			StringBuilder sb = new StringBuilder(110).append(CASENUM).append(i).append(COLON_SPACE);
			for(Character c : lines.get(i).toCharArray()){
				if (Character.isLetter(c))
					sb.append(mastermap.get(c));
				else
					sb.append(c);
			}
			oLines.add(sb.toString());
		}
		FileUtils.writeLines(new File(args[1]), "UTF-8", oLines, false);
		
	}

}
