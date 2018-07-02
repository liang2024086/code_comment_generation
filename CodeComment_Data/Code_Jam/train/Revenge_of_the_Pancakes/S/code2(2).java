package methodEmbedding.Revenge_of_the_Pancakes.S.LYD709;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			String s = in.next();
			char tmp = s.charAt(0);
			int count = 1;
			for (int j = 1; j<s.length(); j++) {
				if(s.charAt(j) != tmp){
					count ++;
					tmp = s.charAt(j);
				}
			}
			if(tmp == '+') {
				count --;
			}
			System.out.println("Case #"+i+" "+count);
		}
	}
}
