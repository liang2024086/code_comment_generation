package methodEmbedding.Revenge_of_the_Pancakes.S.LYD906;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		File fout = new File("out.txt");
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		int n=1;
		int t=in.nextInt();
		in.nextLine();
		for(int i=0;i<t;i++){
			String s= in .nextLine();
			int ans=1;
			char prev=s.charAt(0);
			for(int j=1;j<s.length();j++){
				char current = s.charAt(j);
				if(current!=prev){
					ans++;
					prev=current;
				}
			}
			if(prev=='+')
				ans--;
			bw.write("Case #"+(n++)+": "+ans+"\n");
		}
		bw.close();
	}

}
