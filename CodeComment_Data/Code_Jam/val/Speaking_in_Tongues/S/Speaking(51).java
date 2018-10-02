package methodEmbedding.Speaking_in_Tongues.S.LYD1182;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class Speaking {

	public static void main(String[] args) {
		String[] a = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"
		};
		String b[] = {"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"
		};
		
		int[] val  =new int[26];
		for(int i=0;i<26;++i) {
			val[i] = -1;
		}
		
		for(char ch='a'; ch <='z'; ++ch) {
			boolean found = false;
			for(int i=0;i<3 && !found;++i) {
				int poz = b[i].indexOf(ch);
				if(poz >= 0) {
					char bb = a[i].charAt(poz);
					val[bb-'a'] = ch-'a';
					found = true;
				}
			}
		}
		try{
			FileInputStream fstream = new FileInputStream("in.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			FileWriter ostream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(ostream); 
			int count = Integer.parseInt(br.readLine());
			for(int i=0;i<count;++i) {
				String strLine = br.readLine();
				StringBuffer buf = new StringBuffer("");
				for(int c = 0; c< strLine.length();++c) {
					char ch = strLine.charAt(c);
					if(ch == ' ') {
						buf.append(ch);
					} else {
						if(val[ch-'a'] != -1) {
							buf.append((char)('a' + val[ch-'a']));
						} else {
							if(ch == 'q')
							buf.append('z');
							else
								buf.append('q');
						}
					}
				}
				//out.write("Case #"+(i+1)+": " + buf.toString());
				//out.write("\r\n");
				System.out.println("Case #"+(i+1)+": " + buf.toString());
			}
			//Close the input stream
			in.close();
			out.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}	
	}
}
