package methodEmbedding.Speaking_in_Tongues.S.LYD1430;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A{
	public static void main(String[] args){
		String src = "our language is impossible to understand" +
				"there are twenty six factorial possibilities" +
				"so it is okay if you want to just give up" + 
				"zq";
		String dst = "ejp mysljylc kd kxveddknmc re jsicpdrysi" +
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"+
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"+
				"qz";
		char[][] mapping = new char[2][26];
		for (int i = 0 ; i < 26;i++){
			char c = (char)('a'+i);
			mapping[0][i] = c;
			int index = dst.indexOf(c);
			if (index == -1){
//				System.out.println(c);
				continue;
			}
			mapping[1][i] = src.charAt(index);
//			System.out.printf("%c %c\n",mapping[0][i],mapping[1][i]);
		}
		
		Scanner s = new Scanner(System.in);
//		Scanner s = null;
//		try {
//			s = new Scanner(new FileInputStream("s.in"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		int lines = s.nextInt();
		s.nextLine();
		for (int i = 1 ; i <= lines ;i++){
			
			String l = s.nextLine();
			char[] seq = l.toCharArray();
			StringBuilder sb = new StringBuilder();
			for (char c :seq){
				if (c>='a' && c <='z'){
					sb.append(mapping[1][c-'a']);
				}else{
					sb.append(c);
				}
			}
			
			System.out.printf("Case #%d: %s\n", i,sb.toString());
		}
	}
}
