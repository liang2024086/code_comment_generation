package methodEmbedding.Standing_Ovation.S.LYD275;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A {
public static void main(String[] args) throws IOException {
	File input = new File("input.txt");
	Scanner s =new Scanner(input);
	int T=s.nextInt();
	String res="";
	int t=0;
	while (t<T) {
		int Smax=s.nextInt();
		String str=s.next();
		int fre=0;
		int std=0;
		for (int i = 0; i <= Smax; i++) {
			if (std>=i) {
				std=std+Integer.parseInt(str.charAt(i)+"");
			}
			else {
				fre=fre+(i-std);
				std=std+(i-std);
				std=std+Integer.parseInt(str.charAt(i)+"");
			}
		}
		
		t++;
		res=res+"Case #"+t+": "+fre+"\n";
	}
	File output = new File("output.txt");
	s.close();
	FileWriter fw = new FileWriter(output.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(res);
	bw.close();

}
}
