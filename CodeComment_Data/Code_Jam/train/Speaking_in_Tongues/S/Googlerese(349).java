package methodEmbedding.Speaking_in_Tongues.S.LYD480;

import java.util.Arrays;
import java.util.Scanner;


public class Googlerese {
	static String encode = "y qee" + 
			"ejp mysljylc kd kxveddknmc re jsicpdrysi" +
			"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" +
			"de kr kd eoya kw aej tysr re ujdr lkgc jv";
	static String decode = "a zoo" +
			 "our language is impossible to understand" +
			 "there are twenty six factorial possibilities" +
			 "so it is okay if you want to just give up";


	public static void main(String[] args) {
		char reese[] = new char[128];
		for(int i=0; i < decode.length(); i++)
		{
			reese[encode.charAt(i)] = decode.charAt(i);
		}
		
		for(int i='a'; i <= 'z'; i++)
		{
			if(reese[i] < 'a' || reese[i] > 'z')
			{
				reese[i] = 'q';
			}
		}
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++)
		{
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int j=0; j < s.length(); j++)
			{
				sb.append(reese[s.charAt(j)]);
			}
			System.out.println("Case #" + (i+1) + ": " + sb.toString());
		}
		
	}
}
