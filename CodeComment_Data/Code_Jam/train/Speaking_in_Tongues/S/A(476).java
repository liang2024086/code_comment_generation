package methodEmbedding.Speaking_in_Tongues.S.LYD899;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("A-small-practice.in");
		Scanner scr = new Scanner(file);
		int i= scr.nextInt();
		String p="";
		scr.nextLine();
		for (int a = 1; a<=i;a++) {
			String s = scr.nextLine().trim();
			
			for (int b =0; b< s.length();b++) {
				if (s.charAt(b)=='a') {
					p=p+'y';
				}
				else if (s.charAt(b)=='b') {
					p=p+'h';
				}
				else if (s.charAt(b)=='c') {
					p=p+'e';
				}
				else if (s.charAt(b)=='d') {
					p=p+'s';
				}
				else if (s.charAt(b)=='e') {
					p=p+'o';
				}
				else if (s.charAt(b)=='f') {
					p=p+'c';
				}
				else if (s.charAt(b)=='g') {
					p=p+'v';
				}
				else if (s.charAt(b)=='h') {
					p=p+'x';
				}
				else if (s.charAt(b)=='i') {
					p=p+'d';
				}
				else if (s.charAt(b)=='j') {
					p=p+'u';
				}
				else if (s.charAt(b)=='k') {
					p=p+'i';
				}
				else if (s.charAt(b)=='l') {
					p=p+'g';
				}
				else if (s.charAt(b)=='m') {
					p=p+'l';
				}
				else if (s.charAt(b)=='n') {
					p=p+'b';
				}
				else if (s.charAt(b)=='o') {
					p=p+'k';
				}
				else if (s.charAt(b)=='p') {
					p=p+'r';
				}
				else if (s.charAt(b)=='q') {
					p=p+'z';
				}
				else if (s.charAt(b)=='r') {
					p=p+'t';
				}
				else if (s.charAt(b)=='s') {
					p=p+'n';
				}
				else if (s.charAt(b)=='t') {
					p=p+'w';
				}
				else if (s.charAt(b)=='u') {
					p=p+'j';
				}
				else if (s.charAt(b)=='v') {
					p=p+'p';
				}
				else if (s.charAt(b)=='w') {
					p=p+'f';
				}
				else if (s.charAt(b)=='x') {
					p=p+'m';
				}
				else if (s.charAt(b)=='y') {
					p=p+'a';
				}
				else if (s.charAt(b)=='z') {
					p=p+'q';
				}
				else {
					p=p+s.charAt(b);
				}
				
			}
			System.out.println("Case #"+a+": "+p);
			p="";
		}
		
	}

}
