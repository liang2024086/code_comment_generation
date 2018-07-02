package methodEmbedding.Speaking_in_Tongues.S.LYD820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String en1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String en2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	    String en3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String an1 = "our language is impossible to understand";
		String an2 = "there are twenty six factorial possibilities";
		String an3 = "so it is okay if you want to just give up";
		
		String arrEn[] = {en1, en2, en3};
		String arrAn[] = {an1, an2, an3};
		//System.out.println(arrEn[0]);
		Integer a[] = new Integer[26];
		Integer b[] = new Integer [26];
		Character c[] = new Character [26];
		Character d[] = new Character [26];


		for(int i = 0; i < 26; i++) {
			a[i] = 0;
			b[i] = 0;
		}
		
		for(int i = 0; i < arrEn.length; i++) {
			for(int j = 0; j < arrEn[i].length(); j++){
				if(arrAn[i].charAt(j)==' ')
					continue;
				//System.out.print(arrEn[i].charAt(j)-arrAn[i].charAt(j) + " ");
				c[arrAn[i].charAt(j) - 'a'] = arrEn[i].charAt(j);
				d[arrEn[i].charAt(j) - 'a'] = arrAn[i].charAt(j);

				a[arrAn[i].charAt(j) - 'a']++;
				b[arrEn[i].charAt(j) - 'a']++;
			}
			//System.out.println();
		}
		c['z' - 'a'] = 'q';
		c['q' - 'a'] = 'z';

		d['z' - 'a'] = 'q';
		d['q' - 'a'] = 'z';
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		str = in.readLine();
		
		int inputLines = Integer.valueOf(str);
		
		for(int i = 0; i < inputLines; i++) {
			str = in.readLine();
			String printedLine = "Case #"+(i+1)+": ";
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j)==' ')
					printedLine += " ";
				else
					printedLine += d[str.charAt(j) - 'a'];
			}
			System.out.println(printedLine);
		}
	}
}
