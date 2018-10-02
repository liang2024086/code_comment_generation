package methodEmbedding.Revenge_of_the_Pancakes.S.LYD203;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new FileInputStream("input"));
		PrintWriter writer = new PrintWriter("output");
		int T = scan.nextInt();
		for(int i = 1; i <= T; i++){
			String s = scan.next();
			char flag = s.charAt(0);
			int count = 0;
			for(int j = 1; j < s.length(); j++){
				char c = s.charAt(j);
				if(c == flag) continue;
				else{
					count++;
					flag = c;
				}
			}
			if(flag == '-') count++;
			
			writer.println("Case #" + i + ": " + count);	
		}
		writer.close();
		scan.close();
	}
}
