package methodEmbedding.Speaking_in_Tongues.S.LYD288;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Scanner;


public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
String a = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
String b = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
Hashtable<Character,Character> maping  = new Hashtable<Character,Character>();
maping.put('z', 'q');
for(int i = 0 ;i<a.length();i++){
	if(!maping.containsKey(a.charAt(i)))
		maping.put(a.charAt(i), b.charAt(i));
}
for(int i = 97 ;i < 123;i++){
	if(!maping.contains((char)i)){
		maping.put('q', (char) i);
		break;
	}
}
Scanner in = new Scanner(new BufferedReader(new FileReader("input.in")));
int x = new Integer(in.nextLine());
for(int i = 1 ;i<= x;i++){
	String m = in.nextLine();
	StringBuffer out = new StringBuffer();
	
	for(int z =0 ;z<m.length();z++)
		out.append(maping.get(m.charAt(z)));
	System.out.print("Case #"+i+": ");
	System.out.println(out);
	
}
	}

}
