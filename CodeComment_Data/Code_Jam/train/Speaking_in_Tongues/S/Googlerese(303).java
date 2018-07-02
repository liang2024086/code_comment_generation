package methodEmbedding.Speaking_in_Tongues.S.LYD595;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Googlerese {

	/**
	 * @param args
	 */
	public static String str1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
	public static String str2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	public static String str3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
	
	public static String str4 = "our language is impossible to understand";
	public static String str5 = "there are twenty six factorial possibilities";
	public static String str6 = "so it is okay if you want to just give up";
	
	public static TreeMap<Character,Character> mapping = new TreeMap<Character, Character>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for(Character c: str1.toCharArray())
			mapping.put(c,str4.charAt(i++));
		i = 0;
		for(Character c: str2.toCharArray())
			mapping.put(c,str5.charAt(i++));
		i = 0;
		for(Character c: str3.toCharArray())
			mapping.put(c,str6.charAt(i++));
		mapping.put('q','z');
		mapping.put('z','q');
		for(Character key: mapping.keySet())
			System.out.println("Key: "+key+" "+mapping.get(key));
		System.out.println("Size: "+mapping.size());
		
		File fin = new File("src/files/a.txt");
		File fout = new File("src/files/a1.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fin));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
			long num = Integer.parseInt(br.readLine());
			for(int k=1;k<=num;k++)
			{
				String text = br.readLine();
				StringBuilder newText = new StringBuilder();
				for(Character c: text.toCharArray())
					newText.append(mapping.get(c));
				bw.write("Case #"+k+": "+newText.toString());
				bw.write("\n");
			}
			bw.flush();
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
