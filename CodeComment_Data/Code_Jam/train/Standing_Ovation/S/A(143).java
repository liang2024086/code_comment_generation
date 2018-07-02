package methodEmbedding.Standing_Ovation.S.LYD1995;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class A {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		FileOutputStream Output;
	    PrintStream out;
//	    Output = System.out;
	    Output = new FileOutputStream("A-small.out");
	    out = new PrintStream(Output);
	    
	    int keises = sc.nextInt();
	    for (int keis = 1; keis <= keises; keis++) {
			int L = sc.nextInt();
			String str = sc.next();
			long RUNTOT = 0;
			long SAGOT = 0;
			for (int i = 0; i < str.length(); i++) {
				if(RUNTOT < i){
					SAGOT += i-RUNTOT;
					RUNTOT += i-RUNTOT;
				}
				char c = str.charAt(i);
				int n = c-'0';
				RUNTOT += n;
			}
			out.printf("Case #%d: %d\n", keis, SAGOT);
		}
	}
}
