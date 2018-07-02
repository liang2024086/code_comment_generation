package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1023;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CCA {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("cca.in"));
		FileWriter fw = new FileWriter(new File("cca.out"));
		
		int t =sc.nextInt();
		for(int i=0; i<t; i++)
		{
			double C=sc.nextDouble(), F=sc.nextDouble(), X=sc.nextDouble();
			int N = (int)(X/C-2/F);
			if(N<0) N=0;
			System.out.println(N);
			double total=X/(2+N*F);
			for(int n=0; n<N; n++) total+=C/(2+n*F);
			fw.write("Case #"+(i+1)+": "+total+"\n");
		}
		fw.flush();
		fw.close();
	}
}
