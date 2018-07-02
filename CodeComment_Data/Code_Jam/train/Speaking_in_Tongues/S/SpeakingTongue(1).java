package methodEmbedding.Speaking_in_Tongues.S.LYD76;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SpeakingTongue 
{
	static HashMap<Character, Character> langMap = new HashMap<Character, Character>();
	static
	{
		String[] s = {	"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"
			 };

		String[] l = {	"our language is impossible to understand",
						"there are twenty six factorial possibilities",
						"so it is okay if you want to just give up"
					 };
		
		
		for(int i=0;i<s.length;i++)
		{
			String simple = l[i];
			String google = s[i];
			
			for(int j=0;j<simple.length();j++)
			{
				langMap.put(google.charAt(j), simple.charAt(j));
			}
		}
		
		langMap.put('q', 'z');
		langMap.put('z', 'q');		
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.setIn(new FileInputStream("C:/Users/Atiq/Desktop/A-small-attempt0.in"));
		System.setOut(new PrintStream("C:/Users/Atiq/Desktop/A-small-attempt0.out"));			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++)
		{
			String line = br.readLine();
			String text = "";
			
			for(int j=0;j<line.length();j++)
				text += langMap.get(line.charAt(j));
			
			System.out.println("Case #"+(i+1)+": "+text);
		}
	}	
}
