package methodEmbedding.Speaking_in_Tongues.S.LYD1530;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author: Ahmed Gomaa
 * @codeJame: gomaa86	
 * @topCoder: gomaa86
 * @email :gomaa86@gmail.com
 * */
public class A {

	static int N;
	public static void main(String[] args) throws Exception  {

		String in = "A-small-attempt3.in";
		
		FileInputStream fin = new FileInputStream(in);
		Scanner scn = new Scanner(fin);
		
		// Output file
		String out = "A.out";
		FileOutputStream fout = new FileOutputStream (out);
		PrintStream ps = new PrintStream(fout);
		
		N = scn.nextInt();scn.nextLine();
		int i,j=0;
		char[] arr = new char[26];
		arr[0] = 'y';//a
		arr[1] = 'h';//b
		arr[2] = 'e';//c
		arr[3] = 's';//d
		arr[4] = 'o';//e
		arr[5] = 'c';//f
		arr[6] = 'v';//g
		arr[7] = 'x';//h
		arr[8] = 'd';//i
		arr[9] = 'u';//j
		arr[10] = 'i';//k
		arr[11] = 'g';//l
		arr[12] = 'l';//m
		arr[13] = 'b';//n
		arr[14] = 'k';//o
		arr[15] = 'r';//p
		arr[16] = 'z';//q//*
		arr[17] = 't';//r
		arr[18] = 'n';//s
		arr[19] = 'w';//t
		arr[20] = 'j';//u
		arr[21] = 'p';//v
		arr[22] = 'f';//w
		arr[23] = 'm';//x
		arr[24] = 'a';//y
		arr[25] = 'q';//z//*
		//q, z (16, 25)
		for (i=0 ; i< N ; i++) {
			
			String s1 = scn.nextLine();
			String res = "";
			for (j = 0 ; j < s1.length(); j++){
				if (s1.charAt(j) != ' '){
					res += arr[s1.charAt(j)-97];
				} else {
					res += ' ';
				}
			}
			ps.println("Case #" + (i+1) + ": " + res);
		}
		
		fout.close();
		fin.close();
		System.out.println("Done:.......");
		System.exit(0);
	}
}
