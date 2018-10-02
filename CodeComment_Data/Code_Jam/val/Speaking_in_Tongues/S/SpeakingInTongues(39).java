package methodEmbedding.Speaking_in_Tongues.S.LYD1405;

/**
 * 
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author armin
 *
 */
public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File in, out;
		Scanner sc;
		PrintWriter pr;
		
		in = new File("material.qualification/A-small-attempt0.in");
		out = new File("material.qualification/SpeakingInTongues.out");
		
		int[] transform = {24,7,4,18,14,2,21,23,3,20,8,6,11,1,10,17,25,19,13,22,9,15,5,12,0,16};
		
		try{
			sc = new Scanner(new FileReader(in));
			pr = new PrintWriter(new FileWriter(out));
			
			int T = Integer.parseInt(sc.nextLine());
			
			for(int cas=1;cas<=T;cas++){
				String s = sc.nextLine();
				pr.print("Case #"+cas+": ");
				for(int i=0;i<s.length();i++){
					if(s.charAt(i) == ' ') pr.print(' ');
					else{
						int val = s.charAt(i) - 97;
						pr.print((char)(97 + transform[val]));
					}
				}
				pr.println();
				pr.flush();
			}
			
			
			
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		

	}

}
