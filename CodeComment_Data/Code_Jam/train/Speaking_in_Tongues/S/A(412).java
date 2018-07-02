package methodEmbedding.Speaking_in_Tongues.S.LYD103;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {

	private static final char[] CONVERSION = { 'y', 'h', 'e', 's', 'o', 'c',
		'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n',
		'w', 'j', 'p', 'f', 'm', 'a', 'q' };
	
	public static void main(String [] args) throws Exception{
		
		//Scanner sc = new Scanner (System.in);
		Scanner sc = new Scanner (new File ("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
		int j = sc.nextInt();
		sc.nextLine();
		for (int i=1; i <=j; i++){
			String val = sc.nextLine();
			String result="";
			for (int k=0; k<val.length(); k++){
				if (val.charAt(k) != ' '){
					result += CONVERSION[(int)(val.charAt(k)-'a')];
				}else{
					result += " ";
				}
			}
			System.out.println("Case #"+i+": "+result);
			out.println("Case #"+i+": "+result);
			
		}
		
		out.close();
		
	}
	
}
