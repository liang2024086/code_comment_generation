package methodEmbedding.Speaking_in_Tongues.S.LYD1592;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		String norm = "abcdefghijklmnopqrstuvwxyz";
		String goog = "ynficwlbkuomxsevzpdrjgthaq";
		File f = new File("A-small-attempt0.in");
		Scanner sc = new Scanner(f);
		FileWriter fstream = new FileWriter("out.txt");		  
		BufferedWriter output = new BufferedWriter(fstream);
		int num = Integer.parseInt(sc.nextLine());
		for(int i =1;i<=num;i++){
			String out="";
			String in = sc.nextLine();
			for(int x=0;x<in.length();x++){
				if(in.charAt(x)==' ')
					out = out + ' ';
				else{
					int index = goog.indexOf(in.charAt(x));
					out = out + norm.charAt(index);					
				}
			}
			output.write("Case #"+i+": "+out+"\n");
		}
		output.close();

	}

}
