package methodEmbedding.Standing_Ovation.S.LYD35;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(System.in);
		PrintStream out=new PrintStream(new FileOutputStream(new File("out.txt")));
		int tests=s.nextInt();
		for(int i=1;i<=tests;i++){
			int smax=s.nextInt();
			String shynesses=s.nextLine();
			int[] digits=new int[smax+1];
			for(int j=0;j<smax+1;j++)
				digits[j]=shynesses.charAt(j+1)-'0';
			int needed=0;
			int total=0;
			for(int j=0;j<smax+1;j++){
				needed=Math.max(needed, j-total);
				total+=digits[j];
			}
			out.println("Case #"+i+": "+needed);
		}
		s.close();
		out.close();
	}
}
