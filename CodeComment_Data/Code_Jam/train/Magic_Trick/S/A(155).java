package methodEmbedding.Magic_Trick.S.LYD1597;

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
	    
	    Output = new FileOutputStream("A-small.out");
	    out = new PrintStream(Output);
	    
	    int T = sc.nextInt();
	    for (int keis = 1; keis <= T; keis++) {
	    	boolean[] bool = new boolean[16];
	    	Arrays.fill(bool, true);
			int R1 = sc.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int N = sc.nextInt();
					if(R1-1 != i){
						bool[N-1] = false;
					}
				}
			}
//			System.out.println(Arrays.toString(bool));
			int R2 = sc.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int N = sc.nextInt();
					if(R2-1 != i){
						bool[N-1] = false;
					}
				}
			}
			int COUNT = 0;
			int ANS = 0;
			for (int i = 0; i < 16; i++) {
				if(bool[i]){
					COUNT++;
//					System.out.println(i);
					ANS = (i+1);
				}
			}
			if(COUNT > 1){
				out.println("Case #"+keis+": "+"Bad magician!");
			}else if(COUNT < 1){
				out.println("Case #"+keis+": "+"Volunteer cheated!");
			}else{
				out.println("Case #"+keis+": "+ANS);
			}
		}
	    
	}
}
