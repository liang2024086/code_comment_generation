package methodEmbedding.Speaking_in_Tongues.S.LYD528;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Substitution {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("Output");

		
		String alphabetn = "abcdefghijklmnopqrstuvwxyz";
		String alphabet =  "ynficwlbkuomxsevzpdrjgthaq";
		
		ArrayList<String> array = new ArrayList<String>();
		
		char [] keys = alphabetn.toCharArray(); 
		String length = in.nextLine();
		while (in.hasNextLine()) {
			array.add(in.nextLine());
		}
		int count = 0;
		for (String s : array) {
			count++;
			String str="";
			for(char c : s.toCharArray()){
				int i = alphabet.indexOf(c);
				if(i >= 0){
					str+=keys[i];
				}else{
					str+=" ";
				}
			}
			out.println("Case #"+ count + ": " + str);
		}

		in.close();
		out.close();
	}

}
