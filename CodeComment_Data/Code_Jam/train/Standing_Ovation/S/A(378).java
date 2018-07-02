package methodEmbedding.Standing_Ovation.S.LYD986;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small.in"));
		int c = in.nextInt();
		for(int i=1;i<=c;++i) {
			int smax = in.nextInt();
			String shyness = in.next();
			int count = 0 , need = 0;
			for(int j=0; j<shyness.length(); ++j) 
				if(shyness.charAt(j) != '0'){ 
					if(count >= j) count += (shyness.charAt(j) - '0');
					else {
						need += j - count;
						count += (shyness.charAt(j) - '0') + need;
					}
					//System.out.println(i + " : count " + count + " need " + need );
				}
			System.out.println("Case #" + i + ": " + need);
		}
		in.close();
	}
}
