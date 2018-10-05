package methodEmbedding.Standing_Ovation.S.LYD1382;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ovation {
	public static void main(String[] args) throws IOException{
		File file = new File("input.txt");
		Scanner in = new Scanner(file);
		int cases = in.nextInt();
		
		for(int i = 0; i < cases; i++){
			int smax = in.nextInt();
			int add = 0;
			int standing = 0;
			String ppl = in.next();
			for(int j = 0; j < ppl.length() ; j++){
				while(standing < j){
					add++;
					standing++;
				}
				standing += Character.getNumericValue(ppl.charAt(j));
			}
			System.out.println("Case #" + (i+1) + ": " + add);
		}
		
	}
}
