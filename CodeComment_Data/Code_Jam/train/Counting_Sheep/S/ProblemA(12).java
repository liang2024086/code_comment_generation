package methodEmbedding.Counting_Sheep.S.LYD1450;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		File f = new File("input.txt");
		Scanner s = new Scanner(new BufferedInputStream(new FileInputStream(f)));
		
		File w = new File("output.txt");
		FileWriter wr = new FileWriter(w);
		
		int tests = s.nextInt();
		for (int i=0;i<tests;i++){
			long n = s.nextInt();
			int k=0;
			long it=1;
			if (n==0) {wr.write("Case #"+(i+1)+": INSOMNIA\n");continue;}
			while (k!=2046){
				long l=n*it;
				while (l>0){
					k=k|(1<<(l%10+1));
					l = l /10;
				}
				it++;
			}
			wr.write("Case #"+(i+1)+": "+n*(it-1)+"\n");
			
		}
		wr.close();
		

	}

}
