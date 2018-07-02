package methodEmbedding.Speaking_in_Tongues.S.LYD250;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) {
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
								'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
								's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		Map<String, String> mapping = new HashMap<String, String>();
		
		String gString = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String tString = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		
		char[] gCharArray = gString.toCharArray();
		char[] tCharArray = tString.toCharArray();
		
		for(int i=0; i<gCharArray.length; i++){
			mapping.put(gCharArray[i]+"", tCharArray[i]+"");
		}
		
		mapping.put("q", "z");
		mapping.put("z", "q");
		try {			
			
			Scanner sc = new Scanner(new FileReader("D:/Nandan/Project/GoogleCodeJam/Qualification-2012/A-small.in"));
			int T = sc.nextInt();
			sc.nextLine();
			for(int t=1; t<=T; t++){
				String line = sc.nextLine();
				
				char[] charArray = line.toCharArray();
				for(int i=0; i<charArray.length; i++){
					char temp = charArray[i];
					if(temp == ' '){
						continue;
					}
					charArray[i] = mapping.get(charArray[i]+"").toCharArray()[0];
				}
				System.out.println("Case #"+t+": "+ new String(charArray));
			}
			
				
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
